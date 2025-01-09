/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q6;
import java.util.Random;
/**
 *
 * @author jirui
 */
public class Game {
    public boolean battle(Team team, Villain enemy){
        team.resetTeamHp();
        enemy.resetHp();
        enemy.resetCd();
        Random random = new Random();
       
        String[] runestoneType = {"Water", "Fire", "Earth", "Light", "Dark"};
        String[] runestoneDissolved = new String[3];
        int round = 0;
        while(enemy.getHp() > 0 && team.getHp() > 0){
            round++;
            enemy.decreaseCd();
            if(enemy.getCurrentCd() == 0){
                enemy.resetCd();
            }
            
            System.out.println("Round " + round);
            System.out.println("Enemy's current CD: " + (int) enemy.getCurrentCd());
            System.out.println("Runestones dissolved:");
            
            for(int x = 0; x < runestoneDissolved.length; x++){
                runestoneDissolved[x] = runestoneType[random.nextInt(runestoneType.length)];
                System.out.println(" - " + runestoneDissolved[x]);
            }
            team.resetTeamMultiplier();
            for(int x = 0; x < runestoneDissolved.length; x++){
                for(int y = 0; y < team.getHeroList().length; y++){
                    if(team.getHeroList()[y].getElement().equals(runestoneDissolved[x])){
                        team.getHeroList()[y].addMultiplier();
                    }
                }          
            }
            double damage = 0;
            System.out.println("");
            for(int y = 0; y < team.getHeroList().length; y++){
                if(team.getHeroList()[y].getMultiplier() != 0){
                    double heroDmg = team.getHeroList()[y].calculateDamage(enemy, team.getHeroList()[y].getMultiplier());
                    System.out.println(team.getHeroList()[y].getName() + " dealt " + heroDmg + " damage to " + enemy.getName());
                    damage += heroDmg;
                }
                
            }  
            if(damage == 0){
                System.out.println("No hero attacked in this round");
            }
            if(enemy.getCurrentCd() == enemy.getInitialCd()){
                team.getDamaged(enemy.getAttack());
                System.out.println(enemy.getName() + " dealt " + enemy.getAttack() + " damage to the team");
            }

            enemy.getDamaged(damage);
            System.out.println("");
            
            System.out.println("Team's remaining HP: " + team.getHp());
            System.out.println(enemy.getName() + "'s remaining HP: " + enemy.getHp());
            System.out.println("");
        }
        
        if(enemy.getHp() == 0){
            System.out.println("You won!");
            return true;
        }
        else if(team.getHp() == 0){
            System.out.println("You have been defeated...");
            return false;
        }
        return true;
    }
    
}

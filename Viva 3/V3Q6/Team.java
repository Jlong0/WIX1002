/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q6;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author jirui
 */
public class Team {
    private Hero[] deck;
    private Hero[] heroList = new Hero[4];
    private double hp;
    
    public Team(Hero[] deck){
        this.deck = deck;
    }
    
    public double getHp(){
        return this.hp;
    }
    public void formTeam(){
        Random random = new Random();        
        for(int x = 0; x < heroList.length; x++){            
            heroList[x] = deck[random.nextInt(deck.length)];
            this.hp += heroList[x].getHp();
        }
    }
    
    public void getDamaged(double damage){
        this.hp -= damage;
        if(this.hp < 0){
            this.hp = 0;
        }
    }
    
    public void resetTeamHp(){
        double totalHp = 0;
        for(int x = 0; x < heroList.length; x++){            
            totalHp += heroList[x].getHp();
        }
        this.hp = totalHp;
    }
    
    public void resetTeamMultiplier(){
        for(int x = 0; x < heroList.length; x++){
            heroList[x].resetMultiplier();
        }
    }
    
    public Hero[] getHeroList(){
        return this.heroList;
    }

    @Override
    public String toString() {
        return heroList[0].toString() + "\n" +  heroList[1].toString() + "\n" + heroList[2].toString() + "\n" + heroList[3].toString();
    }
    
    
    
    
}

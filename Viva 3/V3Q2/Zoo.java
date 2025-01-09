/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q2;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author jirui
 */
public class Zoo {
    Creature[] creatureList;
    public Zoo(int number){
        this.creatureList = new Creature[number];
    }
    
    public void addCreature(String species, double magicPower, String habitat){
        for(int x = 0; x < creatureList.length; x++){
            if(creatureList[x] == null){
                creatureList[x] = new Creature(species, magicPower, habitat);
                System.out.println(creatureList[x].toString() + " added to the zoo.");
                return;
            }
        }
        System.out.println("Zoo is full!");
    }
    
    public void feedCreature(String species, double food){
        for(Creature x : creatureList){
            if(x == null){
                continue;
            }
            if(x.getSpecies().equalsIgnoreCase(species)){
                x.feed(food);
                System.out.println(x.getSpecies() + "'s magic power increased to " + x.getMagicPower());
                return;
            }
            
        }
        System.out.println("No species found.");
    }
    
    public void displayAllCreature(){
        for(Creature x : creatureList){
            if(x == null){
                continue;
            }
            x.displayInfo();
            System.out.println("");
            
        }
    }
    
    
    
}

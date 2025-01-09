/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q1;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jirui
 */
public class PotionContainer {
    List<Potion> potionList = new ArrayList<>();
    public void addPotion(String ingredient, double volume){
        Potion potion = new Potion(ingredient, volume);
        System.out.println(volume + " ml of " + ingredient + " added to the container.");
        potionList.add(potion);
    }
    
    public void usePotion(String ingredient, double volume){
        for(Potion x : potionList){
            if(x.getIngredient().equalsIgnoreCase(ingredient) && x.getVolume() >= volume){
                System.out.println(volume + " ml of " + ingredient + " used.");
                x.ingredientConsumed(volume);   
            }
            else if(x.getIngredient().equalsIgnoreCase(ingredient) && x.getVolume() < volume){
                System.out.println("You tried to use " + volume + " ml. Unable to use more than available volume");
            }
        }
    }
    
    public double getRemainingVolume(String ingredient){
        for(Potion x : potionList){
            if(x.getIngredient().equalsIgnoreCase(ingredient)){
                return x.getVolume();
            }
        }
        return 0;
    }
    
    public boolean isEnoughForPotion(double requiredUnicornTears, double requiredDragonBlood){
        for(Potion x : potionList){
            if(x.getIngredient().equalsIgnoreCase("Unicorn Tears")){
                if(x.getVolume() < requiredUnicornTears){
                    return false;
                }
            }
            else if(x.getIngredient().equalsIgnoreCase("Dragon Blood")){
                if(x.getVolume() < requiredDragonBlood){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void printPotions(){
        for(Potion x : potionList){
            System.out.println(x.getIngredient() + ": " + x.getVolume() + " ml");
        }
    }
    
}

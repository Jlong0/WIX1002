/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q1;

/**
 *
 * @author jirui
 */
public class Potion {
    private String ingredient;
    private double volume;
    
    Potion(String ingredient, double volume){
        this.ingredient = ingredient;
        this.volume = volume;
    }
    
    public String getIngredient(){
        return ingredient;
    }
    
    public void setIngredient(String ingredient){
        this.ingredient = ingredient;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public void setVolume(double volume){
        this.volume = volume;
    }
    
    public void ingredientConsumed(double volume){
        
        this.volume -= volume;
        
    }
}

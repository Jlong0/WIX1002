/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q6;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author jirui
 */
public class Hero {
    private String name, element;
    private double hp, atk, rsMultiplier;
    private Map<String, String> elementRelation = new HashMap();
 
    public Hero(String name, String element, int hp, int atk){
        
        
        this.name = name;
        this.element = element;
        this.hp = hp;
        this.atk = atk;
    }
    
    public double addMultiplier(){
        this.rsMultiplier++;
        return this.rsMultiplier;
    }
    
    public double calculateDamage(Villain enemy, double rsMultiplier){
        double multiplier = 1;
        double damage = 0;
        mapElementDominance();
        if(enemy.getElement().equals(elementRelation.get(element))){
            multiplier = 1.5;
            damage = atk * multiplier * rsMultiplier - enemy.getDefence();
            if(damage < 1){
                damage = 1;
            }
            return damage;
        }
        
        mapElementWeakness();
        if(enemy.getElement().equals(elementRelation.get(element))){
            multiplier = 0.5;
            damage = atk * multiplier * rsMultiplier - enemy.getDefence();
            if(damage < 1){
                damage = 1;
            }
            return damage;
        }
        
        multiplier = 1;
        damage = atk * multiplier * rsMultiplier - enemy.getDefence(); 
        if(damage < 1){
            damage = 1;
        }
        return damage;
    }
    
    public void mapElementDominance(){
        elementRelation.clear();
        elementRelation.put("Water", "Fire");
        elementRelation.put("Fire", "Earth");
        elementRelation.put("Earth", "Water");
        elementRelation.put("Light", "Dark");
        elementRelation.put("Dark", "Light");
    }
    
    public void mapElementWeakness(){
        elementRelation.clear();
        elementRelation.put("Water", "Earth");       
        elementRelation.put("Earth", "Fire");
        elementRelation.put("Fire", "Water");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
    
    public double getMultiplier(){
        return rsMultiplier;
    }
    
    public void resetMultiplier(){
        this.rsMultiplier = 0;
    }

    @Override
    public String toString() {
        return "Hero name: " + name + "\nElement: " + element + "\nHealth Point: " + hp + "\nAttack: " + atk + "\n";
    }
    
    
}

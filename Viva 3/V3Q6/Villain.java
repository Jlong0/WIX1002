/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q6;

/**
 *
 * @author jirui
 */
public class Villain {
    private String name, element;
    private double maxHp, hp, attack, defence, initialCd, currentCd;

    public Villain(String name, String element, double maxHp, double attack, double defence, double initialCd) {
        this.name = name;
        this.element = element;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.attack = attack;
        this.defence = defence;
        this.initialCd = initialCd;
        this.currentCd = initialCd;
    }
    
    public void getDamaged(double damage){
        this.hp -= damage;
        if(this.hp < 0){
            this.hp = 0;
        }
    }
    
    public void resetHp(){
        this.hp = this.maxHp;
    }
    
    public void decreaseCd(){
        this.currentCd -= 1;
    }
    
    public void resetCd(){
        this.currentCd = this.initialCd;
    }

    @Override
    public String toString() {
        return "Villian name: " + name + "\nElement: " + element + "\nMax HP: " + maxHp + "\nHP: " + hp + "\nAttack=" + attack + "\nDefence: " + defence + "\ninitialCd: " + initialCd + "\ncurrentCd: " + currentCd;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public double getMaxHp() {
        return maxHp;
    }

    public double getHp() {
        return hp;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefence() {
        return defence;
    }

    public double getInitialCd() {
        return initialCd;
    }

    public double getCurrentCd() {
        return currentCd;
    }
    
    
}

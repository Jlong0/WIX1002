/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q2;

/**
 *
 * @author jirui
 */
public class Creature {
    private String species;
    private double magicPower;
    private String habitat;
    
    public Creature(String species, double magicPower, String habitat){
        this.species = species;
        this.magicPower = magicPower;
        this.habitat = habitat;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(double magicPower) {
        this.magicPower = magicPower;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public void feed(double foodAmount){
        this.magicPower += foodAmount;
    }

    @Override
    public String toString() {
        return species;
    }
    
    public void displayInfo(){
        System.out.println("Creature: " + species);
        System.out.println("Magic Power: " + magicPower);
        System.out.println("Habitat: " + habitat);
    }
}

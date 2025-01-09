/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q3;

/**
 *
 * @author jirui
 */
public class Pet {
    private String name, species, breed, healthRecord, adopterName;
    private int age;   
    private boolean isAdopted;
    
    public Pet(String name, String species, String breed, int age, String healthRecord){
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.healthRecord = healthRecord;
    }
    
    public void adopt(String adopterName){
        this.adopterName = adopterName;
    }
    
    public void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Health Record: " + healthRecord);
        System.out.println("Adopt status: " + isAdopted);
        System.out.println("Adopter Name: " + adopterName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getHealthRecord() {
        return healthRecord;
    }

    public void setHealthRecord(String healthRecord) {
        this.healthRecord = healthRecord;
    }

    public String getAdopterName() {
        return adopterName;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean isAdopted) {
        this.isAdopted = isAdopted;
    }
    
    
           
}

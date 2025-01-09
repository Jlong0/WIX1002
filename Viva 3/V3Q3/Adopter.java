/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q3;

/**
 *
 * @author jirui
 */
public class Adopter {
    private String name, preferredSpecies, preferredAgeRange;
    
    public Adopter(String name, String preferredSpecies, String preferredAgeRange){
        this.name = name;
        this.preferredSpecies = preferredSpecies; 
        this.preferredAgeRange = preferredAgeRange;
    }
    
    public void viewMatchingPets(PetAdoptionCentre centre){
        String[] range = preferredAgeRange.split("-");
        int minAge = Integer.parseInt(range[0]);
        int maxAge = Integer.parseInt(range[1]);
        for(Pet x : centre.getPetList()){
            if(preferredSpecies.equalsIgnoreCase(x.getSpecies())){
                if(x.getAge() >= minAge && x.getAge() <= maxAge){
                    x.getDetails();
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreferredSpecies() {
        return preferredSpecies;
    }

    public void setPreferredSpecies(String preferredSpecies) {
        this.preferredSpecies = preferredSpecies;
    }

    public String getPreferredAgeRange() {
        return preferredAgeRange;
    }

    public void setPreferredAgeRange(String preferredAgeRange) {
        this.preferredAgeRange = preferredAgeRange;
    }
    
    
}

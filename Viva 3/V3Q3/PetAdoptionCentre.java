/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q3;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jirui
 */
public class PetAdoptionCentre {
    private List<Pet> petList = new ArrayList<>();
    
    public void addPet(Pet pet){
        petList.add(pet);
    }
    
    public void adoptPet(Pet pet, Adopter adopter){
        pet.setAdopted(true);
        pet.setAdopterName(adopter.getName());
    }
    
    public void viewAvailablePets(){
        for(Pet x : petList){
            if(!x.isAdopted()){
                x.getDetails();
                System.out.println("");
            }
        }
    }
    
    public Pet getPetByName(String petName){
        for(Pet x : petList){
            if(x.getName().equalsIgnoreCase(petName)){
                return x;
            }
        }
        return null;
    }
    
    public List<Pet> getPetList(){
        return petList;
    }
}

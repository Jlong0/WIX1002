/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v3q3;

/**
 *
 * @author jirui
 */
public class V3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PetAdoptionCentre centre = new PetAdoptionCentre();

        // Adding pets to the centre
        centre.addPet(new Pet("Whiskers", "Cat", "Siamese", 2, "Vaccinated"));
        centre.addPet(new Pet("Buddy", "Dog", "Labrador", 3, "Healthy"));
        centre.addPet(new Pet("Spike", "Parrot", "Macaw", 4, "Needs Checkup"));
        

        // Viewing available pets
        System.out.println("Available pets:");
        centre.viewAvailablePets();
        
        // Adopter matching and adoption process
        Adopter adopter1 = new Adopter("John", "Dog", "1-4");
        System.out.println("\nMatching pets for John:");
        adopter1.viewMatchingPets(centre);

        System.out.println("\nJohn adopts Buddy!");
        centre.adoptPet(centre.getPetByName("Buddy"),adopter1);
        
        System.out.println("\nAvailable pets after adoption:");
        centre.viewAvailablePets();
    }
    
}

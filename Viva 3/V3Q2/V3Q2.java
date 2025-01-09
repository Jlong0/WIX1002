/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v3q2;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author jirui
 */
public class V3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's creature your zoo!");
        int zooSize = 0;
        while(zooSize == 0){
            try{
                System.out.print("Enter the size of your zoo: ");
                zooSize = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                zooSize = 0;
                System.out.println("Wrong input!");
                sc.nextLine();
                
            }
        }
        sc.nextLine();
        Zoo myZoo = new Zoo(zooSize);
        int option = 0;
        boolean run = true;
        
        while(run){
            System.out.print("1. Add new Ceature\n2. Feed Creature\n3. Display zoo creatures\n4. Exit\nPlease select an option:");
            
                try{
                    option = sc.nextInt();
                    
                }catch(InputMismatchException e){
                    System.out.println("Wrong input!");
                    sc.nextLine();
                }
                System.out.println("");
                sc.nextLine();
            switch(option){
                case 1:
                    System.out.print("Enter the name of the species: ");
                    String species = sc.nextLine();
                    
                    System.out.print("Enter the magic power of the species: ");
                    double magicPower = sc.nextDouble();
                    
                    System.out.print("Enter the habitat of the species: ");
                    sc.nextLine();
                    String habitat = sc.nextLine();
                    System.out.println("");
                    
                    myZoo.addCreature(species, magicPower, habitat);
                    break;
                case 2:
                    System.out.print("Enter the name of the species: ");
                    species = sc.nextLine();
                    
                    System.out.print("Enter the amount of food to feed: ");
                    double food = sc.nextDouble();
                    sc.nextLine();
                    
                    myZoo.feedCreature(species, food);
                    break;
                case 3:
                    myZoo.displayAllCreature();
                    break;       
                case 4:
                    run = false;
                    break;
            }
        }
    }
    
}

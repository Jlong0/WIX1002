/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v1q4;
import java.util.Scanner;
/**
 *
 * @author jirui
 */
public class V1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalPrice = 0, pizzaNum = 0, drinksNum = 0, dessertNum = 0;
        while(true){
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Maroni's Pizza!\n1. Pizza\n2. Drinks\n3. Dessert\n4. CHECKOUT\n");
            System.out.print("Pick an option: ");
            int input = sc.nextInt();
            boolean subMenu = false;
            if(input == 1 || input == 2 || input == 3){
                subMenu = true;
            }
            else if(input == 4){
                if(pizzaNum >= 1 && drinksNum >= 1 && dessertNum >= 1){
                    System.out.println("Your total is RM" + totalPrice);
                    System.out.println("You've availed the One-of-each offer. You get a 20% discount!");
                    System.out.println("Your new total is " + String.format("%.1f",totalPrice*0.8));
                    System.out.println("");
                    System.out.println("Have a nice day!");
                    break;
                }
                else{
                    System.out.println("Your total is RM" + totalPrice);
                    System.out.println("Have a nice day!");
                    break;
                }
            }
            else{
                System.out.println("Wrong Input");
            }
            
            while(subMenu){

                switch (input){
                    case 1:
                        System.out.println("PIZZA\n1. Chicken Peperoni - RM15\n2. Chicken Supreme - RM18\n3. Vegan Indulgence - RM12\n4. Beef Delight - RM22\n5. Margherita - RM9\n6. BACK TO MAIN MENU\n");
                        System.out.print("Pick an option: ");
                        int subInput = sc.nextInt();
                        if (1 <= subInput && subInput <= 5){
                            pizzaNum++;
                        }
                      
                        System.out.println("--------------------------------");
                        switch (subInput){
                            case 1:
                                System.out.println("Added Chicken Peperoni.");
                                totalPrice += 15;
                                break;
                            case 2:
                                System.out.println("Added Chicken Supreme.");
                                totalPrice += 18;
                                break;
                            case 3:
                                System.out.println("Added Vegan Indulgence.");
                                totalPrice += 12;
                                break;
                            case 4:
                                System.out.println("Added Beef Delight.");
                                totalPrice += 22;
                                break;
                            case 5:
                                System.out.println("Added Margherita.");
                                totalPrice += 9;
                                break;
                            case 6:
                                System.out.println("Going back to main menu...");
                                subMenu = false;
                                break;
                            default:
                                System.out.println("Wrong Input");
                        }
                        System.out.println("--------------------------------");
                        break;
                    case 2:
                        System.out.println("DRINKS\n1. Strawberry Smoothie - RM8\n2. Banana Smoothie - RM8\n3. Mocktail - RM12\n4. Soft Drink - RM5\n5. Mineral Water - RM3\n6. BACK TO MAIN MENU\n");
                        System.out.print("Pick an option: ");
                        subInput = sc.nextInt();
                        if (1 <= subInput && subInput <= 5){
                            drinksNum++;
                        }
                        
                        System.out.println("--------------------------------");
                        switch (subInput){
                            case 1:
                                System.out.println("Added Strawberry Smoothie.");
                                totalPrice += 8;
                                break;
                            case 2:
                                System.out.println("Added Banana Smoothie.");
                                totalPrice += 8;
                                break;
                            case 3:
                                System.out.println("Added Mocktail.");
                                totalPrice += 12;
                                break;
                            case 4:
                                System.out.println("Added Soft Drink.");
                                totalPrice += 5;
                                break;
                            case 5:
                                System.out.println("Added Mineral Water.");
                                totalPrice += 3;
                                break;
                            case 6:
                                System.out.println("Going back to main menu...");
                                subMenu = false;
                                break;
                            default:
                                System.out.println("Wrong Input");
                        }
                        System.out.println("--------------------------------");
                        break;
                        
                    case 3:    
                    System.out.println("DESSERT\n1. Tiramisu - RM7\n2. Strawberry Shortcake - RM10\n3. Green Jello - RM4\n4. Crème Brûlée - RM15\n5. Raspberry Pie - RM20\n6. BACK TO MAIN MENU\n");
                        System.out.print("Pick an option: ");
                        subInput = sc.nextInt();
                        if (1 <= subInput && subInput <= 5){
                            dessertNum++;
                        }
                        
                        System.out.println("--------------------------------");
                        switch (subInput){
                            case 1:
                                System.out.println("Added Tiramisu.");
                                totalPrice += 7;
                                break;
                            case 2:
                                System.out.println("Added Strawberry Shortcake.");
                                totalPrice += 10;
                                break;
                            case 3:
                                System.out.println("Added Green Jello.");
                                totalPrice += 4;
                                break;
                            case 4:
                                System.out.println("Added Crème Brûlée.");
                                totalPrice += 15;
                                break;
                            case 5:
                                System.out.println("Added Raspberry Pie.");
                                totalPrice += 20;
                                break;
                            case 6:
                                System.out.println("Going back to main menu...");
                                subMenu = false;
                                break;
                            default:
                                System.out.println("Wrong Input");
                        }
                        System.out.println("--------------------------------");
                        break;         
                }
            }
        }
        
    }
    
}

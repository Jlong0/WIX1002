/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v2q2;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author jirui
 */
public class V2Q2 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");
    public static void main(String[] args) {
        System.out.println("Choose the shape to calculate the area:");
        int option = 0;
        Menu();
        while(option < 1 || option > 4){
            System.out.print("Enter your choice: ");
            try{
                option = sc.nextInt();
                if(option < 1 || option > 4){
                    System.out.println("Not an option, try again");
                }
            }catch(Exception e){
                System.out.println("Error input, try again");
                sc.next();
            }
        }
        //Circle
        if(option == 1){
            double radius = 0;
            while(radius <= 0){
                try{
                    if(radius <= 0){
                        System.out.print("Enter the radius of the circle: ");
                        radius = sc.nextDouble();
                        if(radius <= 0){
                            System.out.println("Cannot be zero or less, try again");
                        }
                    }                 
                }catch(Exception e){
                    System.out.println("Error input, try again");
                    sc.next();
                }
            }
            System.out.println("The area of the circle is: " + df.format(areaCircle(radius)));

        }
        //Rectangle
        else if(option == 2){
            double length = 0, width = 0;
            while(length <= 0 || width <= 0){
                try{
                    if(length <= 0){
                        System.out.print("Enter the length of the rectangle: ");
                        length = sc.nextDouble();
                        if(length <= 0){
                            System.out.println("Cannot be zero or less, try again");
                            continue;
                        }
                    }
                    if(width <= 0 && length > 0){
                        System.out.print("Enter the width of the rectangle: ");
                        width = sc.nextDouble();
                        if(width <= 0){
                            System.out.println("Cannot be zero or less, try again");
                        }
                    }  

                }catch(Exception e){
                    System.out.println("Error input, try again");
                    sc.next();
                }
            }
            System.out.println("The area of the rectangle is: " + df.format(areaRectangle(length, width)));
        }
        //Triangle
        else if(option == 3){
            double base = 0, height = 0;
            while(base <= 0 || height <= 0){
                try{
                    if(base <= 0){
                        System.out.print("Enter the length of the triangle: ");
                        base = sc.nextDouble();
                        if(base <= 0){
                            System.out.println("Cannot be zero or less, try again");
                            continue;
                        }
                    }
                    if(height <= 0 && base > 0){
                        System.out.print("Enter the width of the rectangle: ");
                        height = sc.nextDouble();
                        if(height <= 0){
                            System.out.println("Cannot be zero or less, try again");
                        }
                    }  

                }catch(Exception e){
                    System.out.println("Error input, try again");
                    sc.next();
                }
            }
            System.out.println("The area of the triangle is: " + df.format(areaTriangle(base, height)));

        }
        //Exit
        else if(option == 4){
            System.out.println("");
            System.out.println("See you next time!");
        }      
    }
    
    public static void Menu(){
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle\n4. Exit ");
    }
    
    public static double areaCircle(double radius){
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }
    
    public static double areaRectangle(double length, double width){
        double area = length * width;
        return area;
    }
    
    public static double areaTriangle(double base, double height){
        double area = base * height / 2;
        return area;
    }
}

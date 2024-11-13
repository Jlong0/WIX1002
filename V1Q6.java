/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v1q6;
import java.util.Scanner;
/**
 *
 * @author jirui
 */
public class V1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp, highestNum = 0, highestCount = 0, secondHighNum = 0, secondHighCount = 0, sum = 0;
        boolean checkNegative = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        
        //This is for the first number entered.
        highestNum = sc.nextInt();
        highestCount++;
        sum += highestNum;
        
        while(true){
            temp = sc.nextInt();
            
            sum += temp;
            if(temp == 0){
                break;
            }
            else if(temp == highestNum){
                highestCount++;
            }
            else if(temp == secondHighNum){
                secondHighCount++;
            }
            
            //If new numer is largest, we replace highestNum with the new number, and the previous highestNum becomes the secondHighNum.
            //the occurrence of the previous highestCount is transfered to the secondHighCount while the new highestCount = 1(first occurrence).
            else if(temp > highestNum){
                
                secondHighNum = highestNum;
                highestNum = temp;
                secondHighCount = highestCount;
                highestCount = 1;
                
            }
            
            //This is when new number is larger than secondhighest and smaller than highest
            else if(temp < highestNum && temp > secondHighNum){
                
                secondHighNum = temp;
                secondHighCount = 1;
                
            }
            
            if (temp<0){
                checkNegative = true;
            }
            
        }
        System.out.println("The largest number is " + highestNum);
        System.out.println("The occurence count of the largest number is " + highestCount);
        System.out.println("The second-largest number is " + secondHighNum);
        System.out.println("The occurence count of the second-largest number is " + secondHighCount);
        System.out.println("The total sum of all numbers is " + sum);
        if(checkNegative){
            System.out.println("Negative numbers were entered.");
        }
        else{
            System.out.println("Negative numbers were not entered");
        }
    }
    
}

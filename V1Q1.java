/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v1q1;
import java.util.Scanner;
/**
 *
 * @author jirui
 */
public class V1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, digitSum = 0;
        double eachDigit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        String nums = String.valueOf(num);
        int totalDigit = nums.length();
        
        while(totalDigit != 1){
            digitSum = 0;
            for(int x=1;x<=totalDigit;x++){
                eachDigit = num % 10;
                digitSum += eachDigit;
                num /= 10;
            }
            num = digitSum;
            nums = String.valueOf(num);
            totalDigit = nums.length();
            
        }
        System.out.println("Sum of digits until single digit: " + digitSum);
        
        
    }
    
}

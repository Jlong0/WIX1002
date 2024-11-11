/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v1q3;

/**
 *
 * @author jirui
 */
public class V1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 96 , checkPrime = 0, sum = 0, product = 1, max = Integer.MAX_VALUE;
        boolean tooLarge = false;
        System.out.print("The factors are: ");
        for(int x = 1; x<=num; x++){

            if (num%x==0){
                checkPrime++;
                sum += x;
                product *= x;
                max /= x;
                
                if (max<1){
                    tooLarge = true;
                }
                System.out.print(x + ", ");
            }
            
            
        }
        System.out.println("\b\b.");
        
        
        if(checkPrime==2){
            System.out.println("The number is a prime number.");
            
        }
        else{
            System.out.println("The number is not a prime number.");
        }
        System.out.println("The sum of the factors is " + sum);
        
        if(tooLarge){
            System.out.println("The product of the factors is too large to display.");
        }
        else{
            System.out.println("The product of the factors is " + product);
        }
        
        if(num % Math.sqrt(num) == 0){
            System.out.println(num + " is a prefect number.");
        }
        else{
            System.out.println(num + " is not a perfect number.");
        }
        
        System.out.print("Prime numbers between 2 and " + num + ": ");
        int numPrime = 0;
        boolean println = false;
        for(int x = 2; x<=num; x++){
            int isPrime = 0;
            for(int y = 1; y<=x; y++){
                if(x%y==0){
                    
                    isPrime++;
                    
                }
                if(isPrime > 2){
                    break;
                }
            }
            
            if(isPrime == 2){
                System.out.print(x + ", ");
                numPrime++;
                println = true;
            }
            
            
            
            if(numPrime%13 == 0 && println){
                System.out.println("");
                println = false;
            }
        }
        System.out.println("\b\b.");
        System.out.println("    ");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v1q2;
import java.util.Scanner;

/**
 *
 * @author jirui
 */
public class V1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, a, b, step = 0; 
        boolean complete = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers with these conditions \n1 ≤ n ≤ 10^9\n1 ≤ a ≤ n\n2 ≤ b ≤ 10^5 ");
        n = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt();

        while(!complete){
            
            if(n%b==0){
                n /= b;
                step++;
            }
            else {
                n-=a;
                step++;
            }
            
            if(n==1){
                complete = true;
                System.out.println(step);
            }
            else if(n<1){
                complete = true;
                System.out.println(-1);
            }
        }
    }
    
}

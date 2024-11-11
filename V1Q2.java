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
//                step2 = 0;
//        double n1, n2;
        boolean complete = false;
//                , method1 = true, method2 = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers with these conditions \n1 ≤ n ≤ 10^9\n1 ≤ a ≤ n\n2 ≤ b ≤ 10^5 ");
        n = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt();
//        n1 = n; n2 = n;
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
//                method1 = false;
                

            }
            
            
        }
//        complete = false;
//        while(!complete){
//            
//            if(n2-a>=1){
//                n2 -= a;
//                step2++;
//            }
//            else {
//                n2/=b;
//                step2++;
//            }
//            
//            if(n2==1){
//                complete = true;
//            }
//            else if(n2<1){
//                complete = true;
//                method2 = false;
//            }
            
            
//        }
//        if(!method1 && !method2){
//            System.out.println(-1);
//        }
//        else {
//            System.out.println(step1);
//            System.out.println(step2);
//            System.out.println(Math.min(step1, step2));
//        }

            
        
    }
    
}

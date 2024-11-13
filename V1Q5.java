/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v1q5;
import java.util.Scanner;
/**
 *
 * @author jirui
 */
public class V1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the remixed song: ");
        String remixSong = sc.nextLine();
        
        //toUpperCase if user input lowercase // replaceAll means replace first word with second word, 
        //first we replace REMIX with space, then we replace excess space with a space.
        String originalSong = remixSong.toUpperCase().replaceAll("REMIX", " ").replaceAll(" +", " "); 
        
        //.trim cut off all excess space before and after the string.
        System.out.println(originalSong.trim());   
        
    }
    
}

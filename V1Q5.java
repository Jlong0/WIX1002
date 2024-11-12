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
       
//        String newx = x.replaceAll("REMIX", " ");
//        System.out.println(newx.trim());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the remixed song: ");
        String x = sc.nextLine();
        int index = 0, wordFirstIndex = 0, wordLastIndex = 0;
        boolean firstIndex = false, lastIndex = false, lastWord = false;
        String finalWord = "";
        
        
        while(true){
            String checkRemix = x.substring(index, index+5);
            
            //substring == REMIX
            if (checkRemix.equals("REMIX")){
                //variable firstIndex is the first index of the important word
                //variable lastIndex is the last index of the important word
                //This if statement is when the important word is not found yet. example: (REMIX)ABCREMIX
                //then checkRemix will skip the REMIX word. example: REMIX(ABCRE)MIX
                if(!firstIndex){
                    index += 5;
                    
                }
                //This else statement is when the important word is found. This means we have reached the next REMIX word. example: REMIXABC(REMIX)
                //Then the last index of the important word is saved in variable lastIndex. example: (The index of C is recorded).
                
                else{
                    wordLastIndex = index-1;
                    lastIndex = true;
                    index += 5;
                }
            }
            //substring =! REMIX
            else if (!checkRemix.equals("REMIX")){
                //
                if(!firstIndex){
                    System.out.println("hi");
                    wordFirstIndex = index;
                    firstIndex = true;
                    index++;
                }
                else{
                    
                    index++;
                }
            }

            //if we reached the end of the string then we check if the last word is REMIX or other word.
            //This if statement is when REMIX is not the last word
            if(index+3 >= x.length()-1 && !lastIndex){
                wordLastIndex = x.length()-1;
                System.out.println("yo");
                lastIndex = true;
                lastWord = true;
            }
            //This else if statement is when REMIX is the last word
            else if (index+3 >= x.length()-1 && lastIndex){
                lastWord = true;
            }
            
            //This if statement substrings the important word and concatonates to the final word
            if(firstIndex && lastIndex){
                
                finalWord += x.substring(wordFirstIndex, wordLastIndex+1);
                wordFirstIndex = 0; wordLastIndex = 0;
                firstIndex = false; lastIndex = false;
                System.out.println("hi");
                if(!lastWord){
                    finalWord += " ";
                }
            }
            
            if(lastWord){
                break;    
            }
        }
        System.out.println(finalWord);
        
    }
    
}

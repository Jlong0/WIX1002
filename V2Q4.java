/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v2q4;
import java.util.Scanner;

/**
 *
 * @author jirui
 */
public class V2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] arrayISBN = inputISBNList();
        System.out.println("-".repeat(60));
        boolean[] value = validateISBNList(arrayISBN);
        for (int a=0; a < arrayISBN.length; a++){
            System.out.println(arrayISBN[a] + " " + value[a]);
        }
    }
    
    public static String[] inputISBNList(){
        Scanner sc = new Scanner(System.in);
        boolean done = false;
        int listSize = 0;
        while(!done){
            try {
                System.out.println("Enter the size of the ISBN list: ");
                listSize = sc.nextInt();
                if(listSize<=0){
                    System.out.println("List size cannot be equal to or smaller than zero");
                    continue;
                }
                    done = true;
            } catch (Exception e) {
                System.out.println("Error");
                sc.next();
            }
        }
        String[] arrayISBN = new String[listSize];
        for (int x = 0; x<arrayISBN.length; x++){
            String temp = "";
            boolean format = false;
            System.out.println("Enter the ISBN-10 string (" + (x+1) + "/" + arrayISBN.length + ") :");
            while(!format){
                temp = sc.next();
                if(temp.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9|X]")){
                    format = true;
                }
                else{
                    System.out.println("Error, try again");
                }
            }
            arrayISBN[x] = temp;
        }
        return arrayISBN;
    }
    
    public static boolean[] validateISBNList(String[] array){
        
        boolean[] value = new boolean[array.length];
        
        for (int a=0; a < array.length; a++){
            int sum = 0;
           
            for (int y = 0; y<array[a].length() - 1; y++){
                char ch = array[a].charAt(y);
                int temp = Integer.parseInt(String.valueOf(ch));
                sum += temp * (y+1);
            }            

            int remainder = sum % 11;
            if(array[a].charAt(array[a].length()-1) == 'X'){
                if(remainder == 10){

                }
                else{
                    value[a] = false;
                    continue;
                }
            }
            else{
                char ch = array[a].charAt(array[a].length()-1);
                int temp = Integer.parseInt(String.valueOf(ch));
                if(remainder == temp){

                }
                else{
                    value[a] = false;
                    continue;
                }
            }
            value[a] = true;
        }
        return value;
    }
    
}

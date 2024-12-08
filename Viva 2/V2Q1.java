/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v2q1;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;

/**
 *
 * @author jirui
 */
public class V2Q1 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");
    
    public static void main(String[] args) {
        
        double balance = 1000;     
        List<List<Object>> history = new ArrayList<List<Object>>();
        System.out.println("Welcome to the Bank!");
 
        while(true){
            int option = 0;
            balance = Double.valueOf(df.format(balance));
            Menu();
            while(option < 1 || option > 5){
                System.out.print("Choose an option: ");
                try{
                    option = sc.nextInt();
                    if(option < 1 || option > 5){
                        System.out.println("Not an option, try again");
                    }
                }catch(Exception e){
                    System.out.println("Error input, try again");
                    sc.next();
                }
            }
            //Check Balance
            if(option == 1){
                checkBalance(balance);
            }
            //Deposit
            else if(option == 2){
                List<Object> transaction = depositDetails(balance);
                double amount = Double.valueOf(df.format(transaction.get(2)));
                balance += amount;
                System.out.println("Your balance is now: RM" + df.format(balance));
                history.add(transaction);
            }
            //Withdraw
            else if(option == 3){
                List<Object> transaction = withdrawDetails(balance);
                double amount = Double.valueOf(df.format(transaction.get(2)));
                balance += amount;
                System.out.println("Your balance is now: RM" + df.format(balance));
                history.add(transaction);
            }
            //Print Transactions
            else if(option == 4){
                printTransactions(history);
            }
            //Exit
            else if(option == 5){
                System.out.println("");
                System.out.println("Thank you for using our banking system!");
                System.out.println("Your final balance is: RM" + df.format(balance));
                break;
            }
            System.out.println("");
        }   
    }
    
    public static void Menu(){
        System.out.println("1. Check Balance\n2. Deposit Money\n3. Withdraw Money\n4. View Transaction History\n5. Exit ");
    }
    
    public static void checkBalance(double amount){
        System.out.println("Current balance: RM" + df.format(amount));
    }
    
    public static double deposit(){
        double amount = 0;
        while(true){
            System.out.print("Enter amount to deposit: RM");
            try{
                amount = sc.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("Error input, try again");
                sc.next();
            }
        }
        return amount;
    }
    
    public static List<Object> depositDetails(double balance){
        double amount = deposit(), newBalance = balance + amount;
        newBalance = Double.valueOf(df.format(newBalance));
        String status = "Deposit";
        return Arrays.asList(status, balance, amount, newBalance);
    }
    
    public static double withdraw(){
        double amount = 0;
        while(true){
            System.out.print("Enter amount to withdraw: RM");
            try{
                amount = sc.nextDouble();
                break;
            }catch(Exception e){
                System.out.println("Error input, try again");
                sc.next();
            }
        }
        return amount;
    }
    
    public static List<Object> withdrawDetails(double balance){
        double amount = withdraw(), newBalance = balance - amount;
        newBalance = Double.valueOf(df.format(newBalance));
        String status = "Withdraw";
        return Arrays.asList(status, balance, -amount, newBalance);        
    }
    
    public static void printTransactions(List<List<Object>> history){
        if(history.isEmpty()){
            System.out.println("No history");
        }
        else{
            System.out.println("-----------------------------------------------------------------");
            System.out.println("|Transaction    |Balance        |Amount Changed |New Balance    |");
            for(int x = 0; x<history.size(); x++){
                System.out.println("-----------------------------------------------------------------");
                for(int y = 0; y<history.get(x).size(); y++){
                    System.out.printf("%2$s%1$15s",history.get(x).get(y),"|");
                }
                System.out.print("|\n");
            }
            System.out.println("-----------------------------------------------------------------");
        }
    }
}

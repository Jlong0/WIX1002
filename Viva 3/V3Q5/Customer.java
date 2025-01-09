/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q5;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author jirui
 */
public class Customer {
    String name;
    String customerId;
    List<BankAccount> accounts = new ArrayList<>();
    
    public Customer(String name, String customerId){
        this.name = name;
        this.customerId = customerId;
    }
    
    public void addAccount(BankAccount account){
        this.accounts.add(account);
    }
    
    public BankAccount getAccount(String accountNumber){
        for(int x = 0; x < accounts.size(); x++){
            if(accountNumber.equalsIgnoreCase(accounts.get(x).getAccountNumber())){
                return accounts.get(x);
            }
        }
        return null;
    }
    
    public void displayAccounts(){
        for(int x = 0; x < accounts.size(); x++){
            System.out.println("Account number: " + accounts.get(x).getAccountNumber() + ", Balance: " + accounts.get(x).getBalance());
        }
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
    
}

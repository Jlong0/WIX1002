/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q5;

/**
 *
 * @author jirui
 */
public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    
    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        this.balance += amount;
        System.out.println(amount + " deposited.");
        System.out.println("New balance: " + this.balance);
    }
    
    public boolean withdraw(double amount){
        if(this.balance < amount){
            System.out.println("Cannot withdraw more than that.");
            return false;
        }
        else{
            this.balance -= amount;
            System.out.println(amount + " withdrawed.");
            System.out.println("New balance: " + this.balance);
            return true;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}

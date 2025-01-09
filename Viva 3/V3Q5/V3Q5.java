/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v3q5;

/**
 *
 * @author jirui
 */
public class V3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank("SimpleBank");
        System.out.println("Welcome to " + bank.getName());
        System.out.println("Creating a new customer: John Doe (ID: C001)");
        Customer customer = new Customer("John Doe", "C001");
        System.out.println("Adding a savings account for John Doe with account number A1001 and an initial deposit of $500.");
        BankAccount account = new BankAccount("A1001", customer.getName(), 500);
        customer.addAccount(account);
        System.out.println("Adding another savings account for John Doe with account number A1002 and an initial deposit of $200.");
        BankAccount account2 = new BankAccount("A1002", customer.getName(), 200);
        customer.addAccount(account2);
        bank.addCustomer(customer);
        System.out.println("Depositing and withdrawing from A1001");
        customer.getAccount("A1001").deposit(200);
        customer.getAccount("A1001").withdraw(100);
        System.out.println("Trying to withdraw 300.0 from A1002");
        customer.getAccount("A1002").withdraw(300);
        System.out.println("Displaying all accounts for customer John Doe:");
        customer.displayAccounts();
        System.out.println("Displaying all customers of SimpleBank:");
        bank.displayerAllCustomer();
    }
    
}

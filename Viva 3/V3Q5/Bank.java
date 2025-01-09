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
public class Bank {
    String bankName;
    List<Customer> customers = new ArrayList<>();
    
    public Bank(String bankName){
        this.bankName = bankName;
    }
    
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    
    public Customer getCustomer(String customerId){
        for(int x = 0; x < customers.size(); x++){
            if(customerId.equalsIgnoreCase(customers.get(x).getCustomerId())){
                return customers.get(x);
            }
        }
        return null;
    }
    
    public void displayerAllCustomer(){
        for(int x = 0; x < customers.size(); x++){
            System.out.println("Customer name: " + customers.get(x).getName());
            System.out.println("Customer id: " + customers.get(x).getCustomerId());
        }
    }
    
    public String getName(){
        return this.bankName;
    }
}

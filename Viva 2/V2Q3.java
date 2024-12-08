/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v2q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jirui
 */
public class V2Q3 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
            
        List<List<String>> bookList = new ArrayList<List<String>>();
 
        while(true){
            int option = 0;
            
            Menu();
            while(option < 1 || option > 4){
                System.out.println("Choice of action: ");
                try{
                    option = sc.nextInt();
                    if(option < 1 || option > 4){
                        System.out.println("Not an option, try again");
                    }
                    sc.nextLine();
                }catch(Exception e){
                    System.out.println("Error input, try again");
                    sc.next();
                }
            }
            //Add a book
            if(option == 1){
                List<String> book = addBook();
                bookList.add(book);
            }
            //View book details
            else if(option == 2){
                String title = bookDetail();
                for(int x = 0; x<bookList.size(); x++){
                    if(title.equalsIgnoreCase(bookList.get(x).get(0))){
                        System.out.println("Book Details: " + bookList.get(x).get(0) + " by " + bookList.get(x).get(1));
                    }
                }
            }
            //View all books
            else if(option == 3){
                viewAllBooks(bookList);
            }
            //Exit
            else if(option == 4){
                System.out.println("");
                System.out.println("Program ending...");
                break;
            }
            System.out.println("");
        }   
    }
    
    public static void Menu(){
        System.out.println("1. Add a book\n2. View book details\n3. View all books\n4. Exit");
    }
    
    public static List<String> addBook(){
        String title, author;
        List<String> book = new ArrayList<String>();
        while(true){      
            try{
                System.out.print("Enter book title: ");
                title = sc.nextLine();
                book.add(title);
                if(!title.isEmpty()){
                    System.out.print("Enter book author: ");
                    author = sc.nextLine();
                    book.add(author);
                }
                break;
            }catch(Exception e){
                System.out.println("Error input, try again");
                sc.next();
            }
        }
        return book;
    }
    
    public static String bookDetail(){
        String title;
        while(true){
            
            try{
                System.out.print("Enter book title: ");
                title = sc.nextLine();              
                break;
            }catch(Exception e){
                System.out.println("Error input, try again");
                sc.next();
            }
        }
        return title;
    }
    
    public static void viewAllBooks(List<List<String>> bookList){
        if(bookList.isEmpty()){
            System.out.println("No history");
        }
        else{
            System.out.println("---------------------------------");
            System.out.println("|Title          |Author         |");
            for(int x = 0; x<bookList.size(); x++){
                System.out.println("---------------------------------");
                for(int y = 0; y<bookList.get(x).size(); y++){
                    System.out.printf("%2$s%1$15s",bookList.get(x).get(y),"|");
                }
                System.out.print("|\n");
            }
            System.out.println("---------------------------------");
        }
    
    }
    
}

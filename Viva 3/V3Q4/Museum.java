/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package v3q4;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author jirui
 */
public class Museum {
    List<Exhibit> exhibitList = new ArrayList<>();
    
    public void loadExhibits(String filename){
        try{
            Scanner reader = new Scanner(new FileInputStream(filename));
            while(reader.hasNextLine()){
                String title = reader.nextLine();
                
                String artist = reader.nextLine();
                
                int year = reader.nextInt();
                
                reader.nextLine();
                String type = reader.nextLine();
                
                String description = reader.nextLine();
                
                Exhibit exhibit = new Exhibit(title, artist, year, type, description);
                exhibitList.add(exhibit);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("No file with this name exists");
        }
    }
    
    public void searchExhibitsByArtist(String artist){
        boolean isSearched = false;
        for(Exhibit x : exhibitList){            
            if(x.getArtist().equalsIgnoreCase(artist)){
                x.getDetails();
                isSearched = true;
                System.out.println("");
            }
        }
        if(!isSearched){
            System.out.println("No exihibit with this artist.");
        }
        
    }
    
    public void searchExhibitsByType(String type){
        boolean isSearched = false;
        for(Exhibit x : exhibitList){
            if(x.getType().equalsIgnoreCase(type)){
                x.getDetails();
                System.out.println("");
                isSearched = true;
            }
        }
        if(!isSearched){
            System.out.println("No exihibit with this type.");
        }
        
        
    }
    
    public void searchExhibitsByYear(int year){
        boolean isSearched = false;
        for(Exhibit x : exhibitList){
            if(x.getYear() == year){
                x.getDetails();
                isSearched = true;
                System.out.println("");
            }
        }
        if(!isSearched){
            System.out.println("No exihibit with this publishing year.");
        }
    }
    
    public void viewAllExhibits(){
        for(Exhibit x : exhibitList){
            
            x.getDetails();  
            System.out.println("");
        }
    }
    
    
}

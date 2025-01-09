/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v3q4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jirui
 */
public class V3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String title = "Starry Night", artist = "Vincent van Gogh", type = "Painting", description = "A famous painting that depicts a night sky swirling with stars.";
        int year = 1889;
        
        String title2 = "David", artist2 = "Michelangelo", type2 = "Sculpture", description2 = "A marble statue representing the biblical hero David.";
        int year2 = 1504;
        
        String title3 = "The Persistence of Memory", artist3 = "Salvador DalA-", type3 = "Painting", description3 = "A surreal painting featuring melting clocks.";
        int year3 = 1931;
        
        try{
            PrintWriter writer = new PrintWriter(new FileOutputStream("Exhibits.txt"));
            writer.println(title + "\n" + artist + "\n" + year + "\n" + type + "\n" + description);
            writer.println(title2 + "\n" + artist2 + "\n" + year2 + "\n" + type2 + "\n" + description2);
            writer.println(title3 + "\n" + artist3 + "\n" + year3 + "\n" + type3 + "\n" + description3);
            writer.close();
        }catch(IOException e){
            System.out.println("Error");
        }
        
        Museum museum = new Museum();
        museum.loadExhibits("Exhibits.txt");

        System.out.println("All exhibits:");
        museum.viewAllExhibits();

        System.out.println("\nSearch exhibits by artist 'Vincent van Gogh':");
        museum.searchExhibitsByArtist("Vincent van Gogh");

        System.out.println("\nSearch exhibits by type 'Painting':");
        museum.searchExhibitsByType("Painting");

        System.out.println("\nSearch exhibits by year '1504':");
        museum.searchExhibitsByYear(1504);
    }
    
}

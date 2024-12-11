/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v2q6;
import java.util.Scanner;

/**
 *
 * @author jirui
 */
public class V2Q6 {

    /**
     * @param args the command line arguments
     */
    static boolean hour12 = true, hour24 = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        
        int[] firstInterval = timeInput();
        int[] lastInterval = timeInput();
        int[] timeInterval = calculateInterval(firstInterval, lastInterval);
        
        name = removeNonInitials(name);
        
        System.out.println("");
        System.out.println("+".repeat(60));
        isPrintingWelcomeMessage(name);
        if(firstInterval[0] >= 0 && lastInterval[0] < 6){
            System.out.println("SLEEP NOW!!!!!!!!!!");
        }
        System.out.printf("%02d:%02d:%02d\n", timeInterval[0], timeInterval[1], timeInterval[2]);
        System.out.println("+".repeat(60));
    }
    
    public static int[] timeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter interval ( In hh:mm:ss (am/pm) )\nIf am/pm is not inputted then the system recognises it as 24-hour format:");
        String interval = sc.nextLine();
        boolean format = false; 
        int[] time = new int[3];
        while(true){ 
            if(interval.matches("..:..:.. (am|pm)") && hour12){
                boolean isPM = false;
                if(interval.matches("..:..:.. pm")){
                    isPM = true;
                }
                hour24 = false;
                String tempStr = "";
                for(int x = 0, y = 1; x<interval.length(); x++, y++){
                    tempStr += interval.charAt(x);
                    if(y == 2){
                        int tempInt = Integer.parseInt(tempStr);
                        if(tempInt >= 1 && tempInt <=12){
                            time[0] = tempInt;
                            if(isPM && time[0] != 12){
                                time[0] += 12;
                            }
                            else if(!isPM && time[0] == 12){
                                
                                time[0] -= 12;
                            }
                        }
                        else{
                            System.out.println("hour is incorrect");
                            break;
                        }
                        tempStr = "";
                        x++;
                    }
                    else if(y == 4){
                        int tempInt = Integer.parseInt(tempStr);
                        if(tempInt >= 0 && tempInt <=59){
                            time[1] = tempInt;
                        }
                        else{
                            System.out.println("minute is incorrect");
                            break;
                        }
                        tempStr = "";
                        x++;
                    }
                    else if(y == 6){
                        int tempInt = Integer.parseInt(tempStr);
                        if(tempInt >= 0 && tempInt <=59){
                            time[2] = tempInt;
                            format = true;
                        }
                        else{
                            System.out.println("second is incorrect");
                            break;
                        }
                        
                    }
                    
                }
            }
            else if(interval.matches("..:..:..") && hour24){
                hour12 = false;
                String tempStr = "";
                for(int x = 0, y = 1; x<interval.length(); x++, y++){
                    tempStr += interval.charAt(x);
                    if(y == 2){
                        int tempInt = Integer.parseInt(tempStr);
                        if(tempInt >= 0 && tempInt <=23){
                            time[0] = tempInt;
                        }
                        else{
                            System.out.println("hour is incorrect");
                            break;
                        }
                        tempStr = "";
                        x++;
                    }
                    else if(y == 4){
                        int tempInt = Integer.parseInt(tempStr);
                        if(tempInt >= 0 && tempInt <=59){
                            time[1] = tempInt;
                        }
                        else{
                            System.out.println("minute is incorrect");
                            break;
                        }
                        tempStr = "";
                        x++;
                    }
                    else if(y == 6){
                        int tempInt = Integer.parseInt(tempStr);
                        if(tempInt >= 0 && tempInt <=59){
                            time[2] = tempInt;
                            format = true;
                        }
                        else{
                            System.out.println("second is incorrect");
                            break;
                        }
                        
                    }
                    
                }
            }
            else{
                System.out.println("Error, try again");
            }
            if(format){
                return time;
            }
            System.out.print("Enter interval ( In hh:mm:ss (am/pm) )\nIf am/pm is not inputted then the system recognises it as 24-hour format:");
            interval = sc.nextLine();
            
        }
    }
    
    public static String removeNonInitials(String name){
        String[] delimiter = {" ", "\'", "-", "_", "\\."};
        for (int x = 0; x < delimiter.length; x++){
           for (int y = 0; y < delimiter.length; y++){   
               name = name.replaceAll(delimiter[x] + "bin" + delimiter[y], " ");
               name = name.replaceAll(delimiter[x] + "binti" + delimiter[y], " ");
               name = name.replaceAll(delimiter[x] + "a/l" + delimiter[y], " ");
               name = name.replaceAll(delimiter[x] + "a/p" + delimiter[y], " ");
               name = name.replaceAll(delimiter[x] + "al" + delimiter[y], " ");
               name = name.replaceAll(delimiter[x] + "ap" + delimiter[y], " ");
           }
        }
        return name;
    }
    
    public static String generateInitials(String name){
        String initial = "";
        boolean isInitial = false;
        initial += name.toUpperCase().charAt(0);
        for (int x = 1; x<name.length()-1; x++){
            char ch = name.charAt(x);
            if(isInitial){
                initial += name.toUpperCase().charAt(x);
                isInitial = false;
            }
            
            if(ch == ' ' || ch == '\'' || ch == '-' || ch == '_' || ch == '.'){
                isInitial = true; 
            }
            
        }
        
        
        return initial;
    }
    
    public static void isPrintingWelcomeMessage(String name){

        name = name.toLowerCase();
        if(name.contains("lee") && name.contains("kah") && name.contains("sing")){
            System.out.println("Welcome to G101, Kolej Kediaman Kinabalu, Universiti Malaya!");
            if(name.charAt(0) == 'k' || name.charAt(0) == 's'){
                System.out.println("LKS" + "!!!!!!!!!!");
                System.out.println("WE KNOW IT'S YOU -- LEE KAH SING!");
            }
            else if(name.charAt(0) == 'l'){
                System.out.println(generateInitials(name) + "!!!!!!!!!!");
                System.out.println("WE KNOW IT'S YOU!");
            }
        }
        else if( (name.contains("ridwan") && name.contains("faiz")) && name.contains("mohamad") && name.contains("hassan") || (name.contains("suresh") && name.contains("subramaniam")) ){
            System.out.println("Welcome to G101, Kolej Kediaman Kinabalu, Universiti Malaya!");
            System.out.println(generateInitials(name));
        }
        else{
            System.out.println(generateInitials(name));
        }
    }
    
    public static int[] calculateInterval(int[] start, int[] end){
        int[] total = new int[3];
        for (int x = 2; x>=0; x--){
            if(end[x] >= start[x]){
                total[x] = end[x] - start[x];
            }
            else if(x == 0 && end[x] < start[x]){
                end[x] += 24;
                total[x] = end[x] - start[x];
            }
            else{
                end[x] += 60;
                end[x-1]--;
                total[x] = end[x] - start[x];
            }
        }
        return total;
    }
    
}

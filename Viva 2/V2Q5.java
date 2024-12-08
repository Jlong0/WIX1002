/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v2q5;

/**
 *
 * @author jirui
 */
public class V2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] studentID = {"S0001", "S0002", "S0003", "S0004", "S0005", "S0006"};
        String[] studentName = {"John", "Cindy", "Alex", "Ali", "Rosli", "Roger"};
        int[] mark = {59, 62, 21, 36, 85, 74};
        
        String[][] studentInfo = getStudentInfo(studentID, studentName, mark);
        
        System.out.println("List of Students and thier Marks:");
        printStudentInfo(studentInfo);
        
        System.out.println("Student with highest marks: ");
        findStudentWithHighestMarks(studentInfo);
        
        double average = findAverage(mark);
        System.out.println("Average mark: " + average);
        
        System.out.println("\nStudents scoring below the average:");
        listStudentsBelowAverage(studentInfo, average);
    
    }
    
    public static String[][] getStudentInfo(String[] studentID, String[] studentName, int[] mark){
        String[][] studentInfo = new String[6][3];
        for(int x = 0; x<studentInfo.length; x++){
            for(int y = 0; y<studentInfo[x].length; y++){
                switch (y){
                    case 0:
                        studentInfo[x][y] = studentID[x];
                        break;
                    case 1:
                        studentInfo[x][y] = studentName[x];
                        break;
                    case 2:
                        studentInfo[x][y] = String.valueOf(mark[x]);
                        break;
                }
            }
        }
        return studentInfo;
    }
    
    public static void printStudentInfo(String[][] studentInfo){
        for(int x = 0; x<studentInfo.length; x++){
            String id = "", name = "", mark = "";
            for(int y = 0; y<studentInfo[x].length; y++){
                switch (y){
                    case 0:
                        id = studentInfo[x][y];
                        break;
                    case 1:
                        name = studentInfo[x][y];
                        break;
                    case 2:
                        mark = studentInfo[x][y];
                        break;
                }
                
            }
            System.out.printf("%1$s - %2$-9s: %3$s", id, name, mark);
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void findStudentWithHighestMarks(String[][] studentInfo){
        int mark = 0;
        String name = "";
        for(int x = 0; x<studentInfo.length; x++){
            int temp = Integer.parseInt(studentInfo[x][2]);
            if(temp > mark){
                name = studentInfo[x][1];
                mark = temp;
            }
        }
        System.out.println(name + ": " + mark);
        System.out.println("");
    }
    
    public static double findAverage(int[] mark){
        int total = 0;
        for(int x = 0; x<mark.length; x++){
            total += mark[x];
        }
        double average = (double) total/mark.length;
        return average;
    }
    
    public static void listStudentsBelowAverage(String[][] studentInfo, double average){
        for(int x = 0; x<studentInfo.length; x++){
            int temp = Integer.parseInt(studentInfo[x][2]);
            if(temp < average){
                System.out.println(studentInfo[x][1] + " : " + temp);
            }
        }
    }
}

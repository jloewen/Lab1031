
/**
 * Write a description of class ListRunner here.
 * 
 * @Jameson Loewen
 * @10/28
 */
import java.util.Scanner;
import java.util.Arrays;
public class ListRunner
{
    public static void main(String[] args){
        
        Scanner scr = new Scanner(System.in);
        int ansNum = 0;
        String ans = "y";
        int stuIndex = 0;
        StudentList studList = new StudentList();
        while(ansNum != 4 || !ans.equals("quit")){
            System.out.println("Type a number to choose from the options below:"); 
            System.out.println("1. Add Student to List");
            System.out.println("2. Print Student List");
            System.out.println("3. Delete Sudent from List");
            System.out.println("4. Quit Program");
            ansNum = scr.nextInt();
            if(ansNum == 1){
                if(stuIndex < 3){
                    studList.addStu(stuIndex);
                    stuIndex++;
                } else
                    System.out.println("\n" + "Student list is full.");
            } else if(ansNum == 2){
                studList.printList();
            }else if(ansNum == 3){
                studList.deleteStudent();
            }else if(ansNum == 4){
                ans = "quit";
            }else{
                System.out.println("\n" + "Invalid number.");
            }
            if (ansNum != 4){
                System.out.println("\n" + "Press 1 to complete another action or press 2 to quit"); 
                ansNum = scr.nextInt();
                if(ansNum == 2){
                    ans = "quit";
                }else System.out.println("\n" + "**************" + "\n");
            }
        }
        
    }
}

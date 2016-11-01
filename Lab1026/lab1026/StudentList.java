
/**
 * Write a description of class StudentList here.
 * 
 * @Jameson Loewen
 *
 * @10/28
 */
import java.util.Scanner;
import java.util.Arrays;
public class StudentList
{
    private Student[] students;

    public StudentList()
    {
        students = new Student[3];
    }

    public void addStu(int stuIndex){
        System.out.println("\n" +"*Adding new student*");
        Scanner scr = new Scanner(System.in);
        int id = 0;
        double gpa = 0.0;
        String name = "";
        System.out.println("\n" +"Enter student name:");
        name = scr.nextLine();
        System.out.println("\n" +"Enter student ID number:");
        id = scr.nextInt();
        System.out.println("\n" +"Enter student GPA:");
        gpa = scr.nextDouble();
        String clearBuffer = scr. nextLine();
        students[stuIndex] = new Student(id, gpa, name);
    }
    
     public void printList(){
        if(students[0] == null)
            System.out.println("\n" + "No students in list.");
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                if(!students[i].getStuName().equals("")){
                    System.out.println("\n" + "Student " + (i + 1) + ":" + "\n");
                    System.out.println("Name: " + students[i].getStuName());
                    System.out.println("ID Number: " + students[i].getStuID());
                    System.out.println("GPA: " + students[i].getStuGPA());
                }
            }
        }
    }
    
    public void deleteStudent(){
        Scanner scr = new Scanner(System.in);
        System.out.println("\n" + "Enter the name of the student you would like to delete");
        String stu = scr.nextLine();
        int control = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].getStuName().equals(stu)){
                students[i].setStuName("");
                students[i].setStuID(0);
                students[i].setStuGPA(0);
                control = 1;
            }
        }
        if (control == 0)
        
            System.out.println("Student not found.");
    }
}

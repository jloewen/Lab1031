
/**
 * Write a description of class Student here.
 * 
 * @Jameson Loewen
 * @10/26
 */
public class Student
{
    private int stuID;
    private double stuGPA;
    private String stuName;

    /**
     * Constructor for objects of class Student
     */
    public Student(int id, double gpa, String name){
       stuID = id;
       stuGPA = gpa;
       stuName = name;
    }

    public int getStuID(){
        return stuID;
    }
    public double getStuGPA(){
        return stuGPA;
    }
    public String getStuName(){
        return stuName;
    }
    public void setStuID(int x){
        stuID = x;
    }
    public void setStuGPA(double g){
        stuGPA = g;
    }
    public void setStuName(String n){
        stuName = n;
    }
}

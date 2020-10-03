/*
*   45.	Create a class Student with two members : rollno and percentage. Create default and parameterized constructors. Create method show() to display information. Create another class CollegeStudent inherits Student class. Add a new member semester to it. Create default and parameterized constructors. Also override show() method that calls super class show() method and displays semester. Create another class SchoolStudent inherits Student class. Add a new member className(eg 12th ,10th etc.) to it. Create default and parameterized constructors. Also override show() method that calls super class show() method and displays className. 
Create a class( say Demo) with main method that carries out the operation of the project : -- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent) --create two CollegeStudent  and three SchoolStudent objects and store them inside the array -- display all records from the array -- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. --count how many students are having A grade, if for A grade percentage >75. 
 */
import java.util.*;

 class  Student{
     int rollNo;
     double percentage;

     Student(){
         rollNo = 0;
         percentage = 0;
     }

     Student(int rollNo, double percentage){
         this.rollNo = rollNo;
         this.percentage = percentage;
     }

     void show(){
         System.out.println("*********Student information*********");
         System.out.println("Roll No :"+rollNo+" Percentage :"+percentage);
     }
 }

 class CollegeStudent extends Student{
     int semester;

     CollegeStudent(){
         semester = 0;
     }

     CollegeStudent(int semester){
         this.semester = semester;
     }

     void show(){
         super.show();
         System.out.println("Semester :"+semester);
     }
 }

 class SchoolStudent extends Student{
     int className;

     SchoolStudent(){
         className = 0;
     }

     SchoolStudent(int className){
         this.className = className;
     }

     void show(){
         super.show();
         System.out.println("Class :"+className);
     }
 }

 class ClassDemo{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[5];
        for(int i=0; i< 2;i++){
            System.out.println("Enter Roll No of student :");
            int rollNo = sc.nextInt();

            System.out.println("Enter Percentage :");
            double percentage = sc.nextInt();

            System.out.println("Enter Semester :");
            int semester = sc.nextInt();

            Student s = new Student(rollNo,percentage);
            CollegeStudent c =new CollegeStudent(semester);
            
            }

            for(int i=2;i<arr.length;i++){
                System.out.println("Enter Roll No of student :");
            int rollNo = sc.nextInt();

            System.out.println("Enter Percentage :");
            double percentage = sc.nextInt();

            System.out.println("Enter Class Name :");
            int className = sc.nextInt();

            Student s = new Student(rollNo,percentage);
            SchoolStudent s1 = new SchoolStudent(className);
            }

            for(int i[] : arr){
                for(int j[] : i){
                    arr.show();
                }
            }
     }
 }
/**
 *  40.	Create a class Student having data members name, roll no., age and score. Write a program to accept 10 records of student and store them in an array. And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].
 */

import java.util.Scanner;
class Student{
    String name;
    int rollno;
    int age;
    int score;
    
    void set(String name,int rollno,int age,int score){
        this.name=name;
        this.rollno=rollno;
        this.age=age;
        this.score=score;
        
    }
    void show(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(age);
        System.out.println(score);
    }
}
class StudentDemo45{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        Student s1[] = new Student[10];
          System.out.println("Enter Students Details");
       // Getting Input from user
          for(int i=0; i<s1.length; i++){

               System.out.println("Enter your name :  ");
               String name = sc.next();
               
               System.out.print("Enter your rollno : ");
               int rollno = sc.nextInt();
               
               System.out.print("Enter your age : ");
               int age = sc.nextInt();
               
               System.out.print("Enter your score : ");
               int score = sc.nextInt();
               // creating new object for storing details
               Student p = new Student();

               p.set(name,rollno,age,score);

               s1[i] = p;

           }

               for(int i = 0 ; i<s1.length; i++){	

                   if(s1[i].score >=0 && s1[i].score <=50){
                       System.out.println("Category one score [0-50]");
                       s1[i].show();

           
                   }

                   else if(s1[i].score >50 && s1[i].score <=65){
                       System.out.println("Category one score [50-65]");
                       s1[i].show();
       
                  
                   }             

                   else if(s1[i].score >65 && s1[i].score <=80){
                       System.out.println("Category one score [65-80]");
                       s1[i].show();

            
                   }      

                   else if(s1[i].score >80 && s1[i].score <=100){

                       System.out.println("Category one score [80-100]");
                       s1[i].show();
                   }      

                   else{
                       System.out.println("Not valid in score");
                       s1[i].show();

                   }
               }    
           }
   }
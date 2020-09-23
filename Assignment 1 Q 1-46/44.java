/*
*   44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )
 */
import java.util.*;

 class Faculty{
     int facultyId;
     int salary;
              Scanner sc = new Scanner(System.in);
     void input(){
         System.out.println("Enter the Salary : ");
         facultyId = sc.nextInt();
     }
     void printSalary(){
         System.out.println("Salary is : "+salary);
     }
 }

 class FullTimeFaculty extends Faculty{
     int basicSalary;
     int allowance;  

     void input(){
         super.input();

         System.out.println("Enter the BasicSalary : ");
         basicSalary = sc.nextInt();

         System.out.println("Enter the Allowance : ");
         allowance = sc.nextInt();

         salary = basicSalary + allowance;
     }   
     void show(){
         System.out.println("Total Salary of FullTime Faculty is :"+salary);
     }
 }

 class PartTimeFaculty extends Faculty{
     int workingHours;
     int ratePerHour;

     void input(){
         super.input();

         System.out.println("Enter the working Hourse : ");
         workingHours = sc.nextInt();

         System.out.println("Enter the Rate Per Hour : ");
         ratePerHour = sc.nextInt();

         salary = workingHours * ratePerHour;
     }

     void show(){
         System.out.println("Total Salary of PartTime Faculty is :"+salary);
     }
 }

 class FacultyDemo{
     public static void main(String args[]){
         FullTimeFaculty ft = new FullTimeFaculty(); 
         PartTimeFaculty pt =new PartTimeFaculty();

         ft.input();
         ft.show();

         pt.input();
         pt.show();
     }
 }
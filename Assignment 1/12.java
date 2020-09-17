/*
*12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
 */

 import java.util.*;

 class Salary{
     public static void main(String args[]){
         int sal;
         double  DA, HRA, GS;
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the Basic Salary of employee");
         sal = sc.nextInt();

         if(sal < 10000){
             HRA = sal * 0.1;
             DA = sal * 0.9;
             GS= sal + DA + HRA;
             System.out.println("Gross Salary : "+GS);
         };

         if(sal >= 10000){
             HRA = 2000;
             DA = sal * 0.98;
             GS= sal + DA + HRA;
             System.out.println("Gross Salary : "+GS);
         }
     }
 }
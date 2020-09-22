/*
*09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.
 */
import java.util.*;

 class Years{
     public static void main(String agrs[]){
         int days=0; 
         int months=0;
         int years=0;
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the no of days");
         days = sc.nextInt();

         while(days >= 365){
             days = days - 365;
             years++;             
         }

         while(days >= 30){
             days = days - 30;
             months++;
         }

         System.out.print(+years);
         System.out.print(" Years, ");

         System.out.print(+months);
         System.out.print(" Months, ");
         System.out.print(+days);
         System.out.print(" Days. ");
     }
 }
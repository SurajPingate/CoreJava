/*
*14.	Program to check that entered year is a leap year or not.
 */
import java.util.*;
 class LeapYear{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter year :");
         int year = sc.nextInt();

         if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ){
             System.out.print(year);
             System.out.print(" is Leap year");
         }
         else{
             System.out.print(year);
             System.out.print(" is not Leap year");
         }
     }
 }
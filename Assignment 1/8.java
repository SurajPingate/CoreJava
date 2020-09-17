/*
*08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.
 */

 import java.util.Scanner;

 class SimpleInterest{
     public static void main(String args[]){
         int amount,period;
         float rate,SI;
         
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter Principle Amount");
         amount = sc.nextInt();
         
         System.out.println("Enter Rate");
         rate = sc.nextFloat();

         System.out.println("Enter Time Period");
         period = sc.nextInt();

         SI = (amount * rate * period)/100;

         System.out.println("Simple Interest is :"+SI);

     }
 }
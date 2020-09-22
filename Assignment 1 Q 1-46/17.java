/*
*17.	Write a program to reverse a given number.
 */

 import java.util.*;

 class ReverseNum{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the Number :");
         int num = sc.nextInt();

         while(num != 0){
             int rem = num % 10;
             System.out.print(rem);
             num = num/10;
         }
     }
 }
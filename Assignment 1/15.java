/*
*15.	Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is eligible for marriage or not.
 */

 import java.util.*;

 class Marriage{
     public static void main(String args[]){
         char gender;
         int age;

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the Gender of Person(m for male and f for female)");
         gender = sc.next().charAt(0);

         System.out.println("Enter the Age of Person");
         age = sc.nextInt();

         if(gender == 'm' && age >= 21){
             System.out.println("You are eligible for marriage");
         }
         else if(gender == 'f' && age >= 18){
             System.out.println("You are eligible for marriage");
         }
         else{
             System.out.println("You are not eligible for marriage");
             };
     }

 }
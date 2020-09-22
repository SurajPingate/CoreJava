/*
*10.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
 */

 import java.util.*;

 class Temperature{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         float Fahrenheit;

         System.out.println("Enter the Temprature in Fahrenheit");
         Fahrenheit = sc.nextFloat();

         float temperature= 5*(Fahrenheit-32)/9;

         System.out.println("Temprature is "+temperature);
     }
 }
/*
*21.	Program to show sum and average of 10 element array. Accept array elements from user. 
 */

 import java.util.*;

 class Array21{
     public static void main(String args[]){
         int sum = 0,avg;
         Scanner sc = new Scanner(System.in);
         int arr[] = new int[10];
         
         for(int i=0; i < arr.length; i++){
             System.out.println("Enter the elements in array");
             arr[i] = sc.nextInt();
         }

         for(int a : arr){
             sum = sum + a; 
         }
          avg = sum / arr.length;

         System.out.println("Sum is :"+sum);
         System.out.println("Average is :"+avg);
     }
 }
/*
*19.	Calculate  series : 12+22+32+42+.........+n2
 */

 import java.util.*;

 class PowSeries{
     public static void main(String args[]){
         int sum=0;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Number :");
         int num = sc.nextInt();

         for(int i=0; i<=num;i++){
             sum = sum + (i*i);
         }
         System.out.println("Calculation of Series :"+sum);
     }
 }
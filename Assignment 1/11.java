/*
*11.	Write a program to swap two numbers without using third variable.
 */

 class swap{
     public static void main(String args[]){
         int a = 10;
         int b = 20;

         System.out.println("a= "+a);
         System.out.println("b= "+b);

         a = a+b;
         b = a-20;
         a = a-10;
         

         System.out.println("%%%%%% After Swapping %%%%%%");
         System.out.println("a= "+a);
         System.out.println("b= "+b);
     }
 }
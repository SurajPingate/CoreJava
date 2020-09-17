/*
*13.	Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  
 */


 class grtNo{
     public static void main(String args[]){
         int a = 10;
         int b = 50;
         int c = 30;
         int grt;

         if(a > b){
             grt = (a > c) ? a : c;
             System.out.println("Greatest no is : "+grt);
         }
         else{
             grt = (b > c) ? b : c;
             System.out.println("Greatest no is : "+grt);
         }
     }
 }
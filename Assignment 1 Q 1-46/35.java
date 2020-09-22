/**
 *  35.	Create a class MathOperation that has four static methods. add() method that takes two integer numbers as parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the product. power() method that takes two integer numbers as parameter and returns the power of first number to second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and prints the return values of every method.
 */

 import java.util.*;
import java.lang.Math;

 class MathOperation{
     static int sum(int a,int b){
         return a+b;
     }

     static int sub(int a,int b){
         return a-b;
     }

     static int mul(int a,int b){
         return a * b;
     }

     static int power(int a,int b){
        int pw = 1;
        for(int i=1; i<=b; i++){
            pw = pw * a;
        }
        return pw;
     }

     static void showResult(int p,int q,int r,int s){
         System.out.println("Addition : "+p);
         System.out.println("Subtraction : "+q);
         System.out.println("Multiplication: "+r);
         System.out.println("Power: "+s);
     }
 }

 class MathDemo{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         MathOperation cal = new MathOperation();
         System.out.println("Enter two numbers");
         int a = sc.nextInt();
         int b = sc.nextInt();

         int p = cal.sum(a,b);
         int q = cal.sub(a,b);
         int r = cal.mul(a,b);
         int s = cal.power(a,b);

         cal.showResult(p,q,r,s);
     }
 }
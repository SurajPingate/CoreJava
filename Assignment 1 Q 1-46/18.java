/*
*18.	Program to check whether number is prime or not.
 */

 import java.util.*;

 class Prime{
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter Any positive number");
         int num = sc.nextInt();
        int flag = 0;

        for (int i = 2; i <= num/2; ++i){

            if (num % i == 0){
                flag = 1;
                break;
            }
        }

        if(num == 1){
            System.out.println("1 is not Prime Number");
        }
        else{
            if(flag == 0)
            System.out.println(num+ " is a Prime number");
            else
            System.out.println(num+ " is not a Prime number");
        }
     }
 }
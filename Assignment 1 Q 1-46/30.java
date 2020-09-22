/**
 *  30.	Create an integer type 2-D array of size [3X3]. Take the elements from the user and then calculate the sum of the elements present in the diagonal.
 */

 import java.util.*;

 class Array2dSum{
     public static void main(String[] args) {
         int sum = 0;
         Scanner sc = new Scanner(System.in);
         int arr[][] = new int[3][3];

         for (int i=0; i<arr.length;i++){
             for(int j=0; j<arr[i].length;j++){
                 System.out.print("Enter Element :");
                 arr[i][j] = sc.nextInt();
             }
         }

         for(int ar[] : arr){
             for(int b : ar){
                 sum = sum + b;
             }
         }

         System.out.println("Sum of elements is :"+sum);
     }
 }
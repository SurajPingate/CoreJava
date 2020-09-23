/**
 *   29.	Write a program to print the total number of one-D arrays in a two-D array and the number of elements in every one-D array present in the two-D arrays.
 */

 class Array2D{
     public static void main(String[] args) {
         int count = 0;
         int count1 = 0;
         int a[] = new int[]{1,88,9,8,6,5,4,5};
         int b[] = new int[]{55,66,42,6,3,6,9,4,7,5,2};
         int c[] = new int[]{88,9,2,5,45,8,89,2,6,68,89,6,5};

         int arr[][] = new int[3][];

         arr[0] = a;
         arr[1] = b;
         arr[2] = c;

         for(int x[] : arr){
             for(int y : x){
                 count1++;
                  
             }
             count++;
         }

         System.out.println(" *   Total number of one-D arrays :"+count);
         System.out.println(" *   Number of elements in one-D array present in the two-D arrays :"+count1);
     }
 }
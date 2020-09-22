/**
 *  27.	Write a program to fine the smallest and greatest number present in the array of integer type.
 */

 class ArraySm{
     public static void main(String[] args) {
         int arr[] = new int[]{54,56,8,4,2,66,8};
        //  int min = 0;
        //  int max = 0;
         for( int i=0; i<arr.length; i++){
             if(arr[0] > arr[i])
             arr[0]=arr[i];
         }
         System.out.println("Min No in array :"+arr[0]);

         for(int i=0; i<arr.length;i++){
             if(arr[0] < arr[i])
             arr[0]=arr[i];
         }
         System.out.println("Max no in array :"+arr[0]);
     }
 }
 
/*
*22.	Sort a ten element array in descending order.
 */

 class ArraySort{
     public static void main(String args[]){
          int arr[] = new int[]{12,41,5,7,88,55,36,69,33,10};

          int i,j,k;
          for(i = 1; i<10; i++){
              k = arr[i];
              j = i-1;

              while(j>=0 && arr[j]>k){
                  arr[j+1] = arr[j];
                  j=j-1;
              }
              arr[j+1] = k;
          }

          for(int a : arr){
              System.out.println(a);
          }
     }
 }
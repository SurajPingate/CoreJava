/*
*   25.Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.
 */


import java.util.Scanner;
class SumOfOddEven{
    public static void main(String[] args) 
    {
      int n, num1 = 0, num2 = 0;
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0;i<n;i++)
        {
          a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
          if(a[i] % 2 == 0)
          {
            num1= num1 + a[i];
          }
          else
           {
             num2 = num2 + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+num1);
        System.out.println("Sum of Odd Numbers:"+num2);
    }
}


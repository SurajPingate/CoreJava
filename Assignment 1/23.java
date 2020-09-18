/*
*   23.	Write a program to reverse the array elements.
 */

import java.util.*;
class ReverseArray{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array size");
    int num = sc.nextInt();
    int arr[] = new int[num];
    int reverse[] = new int[num];
    int j=0;
    System.out.println("Enter Array Elements:");
    for(int i=0; i<num; i++)
	{
      arr[i] = sc.nextInt();
    }
    System.out.println("Reverse Elements are:" );
    for(int i=num; i>0; i--,j++)
    {
      reverse[j] = arr[i-1];
      System.out.println(reverse[j]);
    }
  } 
}
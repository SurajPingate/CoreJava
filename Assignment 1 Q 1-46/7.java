/*
*07.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.

 */

import java.util.Scanner;

class CalPercentage{
	public static void main(String args[]){
		int sub1,sub2,sub3,sub4,sub5;
		float percentage;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of subject 1");
		sub1 = sc.nextInt();

		System.out.println("Enter marks of subject 2");
		sub2 = sc.nextInt();

		System.out.println("Enter marks of subject 3");
		sub3 = sc.nextInt();

		System.out.println("Enter marks of subject 4");
		sub4 = sc.nextInt();


		System.out.println("Enter marks of subject 5");
		sub5 = sc.nextInt();
		
		
		percentage = (sub1 + sub2 + sub3 + sub4 + sub5) * 0.2f;		
		System.out.println("Percentage marks = "+percentage);
	}
}
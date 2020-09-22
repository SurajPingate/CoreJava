/*
*06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.
 */


import java.util.Scanner;

class AreaOfCircle{
	public static void main(String args[]){
		int r;
		float pi = 3.14f;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of circle");
		r = sc.nextInt();
		
		float area = pi * (r*r);
		
		System.out.println("Area Of Circle is :"+area);
	}
}
//48.	Create an Abstract class Processor with int member variable data and
//method showData to display data value. Create abstract method process() 
//to define processing of member data. Create a class Factorial using 
//abstract class Processor to calculate and print factorial of a number
//by overriding the process method. b. Create a class Circle using abstract 
//class Processor to calculate and print area of a circle by overriding the 
//process method.Ask user to enter choice (factorial or circle area). 
//Also ask data to work upon. Use Processor class reference to achieve this mechanism.

package Q48;

import java.util.Scanner;

abstract class Processor{
	int data;
	void showData() {
		System.out.println(+data);
	}
	abstract int process();
}

class Factorial extends Processor{
	public int process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No: ");
		int f = sc.nextInt();
		data = 1;
		for(int i=2;i<=f;i++) {
			data = data * i;
		}
		System.out.print("Factorial of " +f+ " is :");
		return data;
	}
}

class Circle extends Processor{
	public int process() {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		data = n.nextInt();
		final double pi = 3.14;
		double area = pi * data * data;
		data = (int)area;
		return data;
	}
}

public class FactNAreaCircle {

	public static void main(String[] args) {
		
		Scanner ch = new Scanner(System.in);
		System.out.println("Which Operation you want to do :");
		System.out.println("1) Factorial ");
		System.out.println("2) Area of Circle");
		int choice = ch.nextInt();
		switch (choice) {
		case 1:
		{
			Processor f = new Factorial();
			f.process();
			f.showData();
			break;
		}
		
		case 2:
		{
			Processor c =new Circle();
			c.process();
			c.showData();
			break;
		}
			

		default:
		{
			System.out.println("Enter Right choice");
			break;
		}
			
		}
	}

}

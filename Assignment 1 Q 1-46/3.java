/*
* 03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D.      (print value of z) [ x, y, z are boolean variables ]

 */


class Primitive{
	
	static void bool(){

		boolean x = true;
		boolean y = false;
		boolean z = true;
		z = x && y || !(x || y);
		System.out.println("D.z = "+z);
	}
		
	public static void main(String arg[]){
		int x = 10;
		int y = 20;
		int z;
		
		y = x*x + 3*x -7;
		System.out.println("A.y = "+y);
		
		
		y=x++ + ++x;
		System.out.println("B.x = "+x);
		System.out.println("B.y = "+y);
		
		
		z = x++ - --y - --x  +  x++ ;
		System.out.println("C.x = "+x);
		System.out.println("C.y = "+y);
		System.out.println("C.z = "+z);
		
		
		bool();
		
	}
	
	
}

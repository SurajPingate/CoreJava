/**
 *  41.	Write a program to demonstrate this() construct functionality.
 */

class ThisConst{
	ThisConst(){
		System.out.println("Parameterless Constructor Called");
	}
	ThisConst(int t){
		this();
		System.out.println("Parameterized Constructor Called");
	}
}
class ThisDemo{
	public static void main(String args[]){
		ThisConst t1 = new ThisConst(50);	
	}
}
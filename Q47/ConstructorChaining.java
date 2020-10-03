/*
47.	Create a program to demonstrate constructor chaining.
*/


package Q47;

class abc{
private int a;
abc(){
    System.out.println("Superclass No Arg");
}

abc(int a){
    System.out.println("Superclass Parameterized");
}
}

class xyz extends abc{
 private int b;
 xyz(){
    System.out.println("Subclass No Arg");
}

xyz(int a){
    System.out.println("Subclass 1 Parameterized");
}

 xyz(int a,int b){
     super(a);
    System.out.println("Subclass Parameterized");
}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xyz obj = new xyz();
		xyz o = new xyz(1120);
		xyz ob = new xyz(10,20);
	}

}
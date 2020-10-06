//60.	Create Interface StudentFee and declare following method.  
//getFee() throws InvalidFeeException. This method ask fees from user 
//and throws exception if user enters invalid or negative fees Create 
//class Student with members (name, fees) and implement the StudentFee 
//Interface.

package Q60;

import java.util.Scanner;

class InvalidFeeException extends Exception{
	
	InvalidFeeException(String str) {
	
		super(str);
	}
}

interface StudentFee{
	
	void getFee(double fee) throws InvalidFeeException;
}

public class InterfaceStdFeeException implements StudentFee {

	public void getFee(double fee) throws InvalidFeeException {
		
		if(fee<0)
			throw new InvalidFeeException("Please provide the valid value for fee.");
		else 
			System.out.println("Your data is accepted.");
	}
	
	public static void main(String[] args) throws InvalidFeeException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter the fee of student : ");
		double fee = sc.nextDouble();
		
		InterfaceStdFeeException obj = new InterfaceStdFeeException();
		obj.getFee(fee);
	}
	
}
//49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. 
//create abstract method calcTax(). a. Create class Employee(empId,name,salary)
//and implement Taxable to calculate incomeTax on yearly salary. b. Create class 
//Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit 
//price of product. c. Create class for main method(Say XYZ), accept employee 
//information and a product information from user and print income tax and sales tax respectively.

package Q49;

import java.util.Scanner;

interface Taxable{
	double salesTax =7;
	double incomeTax = 10.5;
	double calcTax();
	void show();
}

class Product implements Taxable{
	int pId,quantity;
	double price,salesTax1;
	public Product(int pId, int quantity, double price) {
		super();
		this.pId = pId;
		this.quantity = quantity;
		this.price = price;
	}
	public double calcTax() {
		price = price * quantity;
		return salesTax1 = price * (salesTax/100);
	}
	
	public void show() {
		System.out.println("SalesTax for ProductID "+pId+" is :"+salesTax1);
	}
}

class Employee implements Taxable{
	int empId,salary;
	String name;
	double incomeTax1;
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.name = name;
	}

	public double calcTax() {
		salary = salary * 12;
		return incomeTax1 = salary * (incomeTax/100);
	}
	
	public void show() {
		System.out.println("IncomeTax for EmployeeID "+empId+ " is :"+incomeTax1);
	}
}
public class Tax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empId,salary,pId,quantity;
		String name;
		double price;
		System.out.println("Enter Employee Id");
		empId = sc.nextInt();
		System.out.println("Enter Employee Name");
		name = sc.next();
		System.out.println("Enter Employee Salary");
		salary = sc.nextInt();
		
		System.out.println("Enter Product Id");
		pId = sc.nextInt();
		System.out.println("Enter Product Quantity");
		quantity = sc.nextInt();
		System.out.println("Enter Product Price");
		price = sc.nextDouble();
		Taxable E = new Employee(empId, name, salary);
		Taxable P = new Product(pId, quantity, price);
		
		E.calcTax();
		E.show();
		
		P.calcTax();
		P.show();
		
	}

}

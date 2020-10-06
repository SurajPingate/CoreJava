//50.	Explain the importance of toString() and equals() method of the Object class and 
//override them on class Employee(empId,name,salary).  a. Create class for main method(say XYZ),
//and accept five employees information and store in an array. Also ensure if entered empId already
//exist or not (use equals method).  b. Display all employee info using toString method.

package Q50;

import java.util.Scanner;

class Employee{
	int empId;
	private String name;
	private int salary;
	
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return  empId + " " + name + " " + salary;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj instanceof Employee) {
			Employee t = (Employee) obj;
			 boolean isEqual = this.empId == t.empId;
			return isEqual;
		}
		else
			return false;
	}
	
	
}
public class ToStringEquals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e[] = new Employee[5]; 
		for(int i=0;i<e.length;i++) {
			System.out.println("Enter Employee Id");
			int empId = sc.nextInt();
			
			System.out.println("Enter Employee name :");
			String name = sc.next();
			
			System.out.println("Enter salary :");
			int salary = sc.nextInt();
			
			Employee a = new Employee(empId, name, salary);
			
			e[i] = a;
		}
		
		for(Employee ar : e) {
			System.out.println("Employee Details :"+ar);
		}
		
		int count =0;
		for(int i=0; i<e.length; i++)
		{
			for (int j=i+1; j<e.length; j++) {
				   if(e[i].equals(e[j]))
					  {
					System.out.println("the ID are allready present : "
							+ "you Create duplicate Id= "+e[i].empId);
					count++;
					   }
			   }

		}
		System.out.println("Total duplicate values = "+count);
		
		

	}

}

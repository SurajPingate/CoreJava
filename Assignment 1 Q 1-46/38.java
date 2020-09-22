/**
 *  38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.
 */

 class Employee{
     static int empNo = 0;
     private int salary;
     static int totalSalary = 0;

     Employee(int salary){
         empNo++;
         this.salary = salary;
         totalSalary += salary;
     }

     void showData(){
         System.out.println("* Total Employee : "+empNo+"  * Total Salary : "+totalSalary);
     }
 }

 class EmployeeDemo{
     public static void main(String[] args) {
         Employee e = new Employee(1000);

         Employee e1 = new Employee(2000);

         Employee e2 = new Employee(2500);

         Employee e3 = new Employee(4500);

         Employee e4 = new Employee(3500);

         Employee e5 = new Employee(5500);
         e5.showData();
     }
 }
/**
 *  37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
 */

 class Person{
     int age;
     String name;

    void getData(String name, int age){
         this.name = name;
         this.age = age;
     }

     void getData(String name){
        int age = 18;
        this.name = name;
        System.out.println("Name :"+name+" Age :"+age);
     }

     void showData(){
         System.out.println("Name :"+name+" Age :"+age);
     }

 }

 class PersonDemo{
     public static void main(String[] args) {
         Person p = new Person();

         p.getData("Suraj",25);
         p.showData();
         
         p.getData("Suraj");
     }
 }
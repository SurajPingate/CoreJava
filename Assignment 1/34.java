/**
 *  34.	Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of radius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.
 */

 class Circle{
     private float radius;
     private float area;

     void init(float radius){
         this.radius = radius;
     };
     float calculateArea(){
         area = 3.14f * (radius * radius);
         return area;
     }
     void display(){
         System.out.println("Area of circle is :"+area);
     }
 }

 class CircleDemo{
     public static void main(String[] args) {
         Circle a = new Circle();
         a.init(10);
         a.calculateArea();
         a.display();
     }
 }
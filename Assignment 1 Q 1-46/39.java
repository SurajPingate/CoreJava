/**
 *  39.	Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. ( amount spent on single product = price of product * quantity of product )

 */

 import java.util.*;
 class Product{
     int pId;
     int price;
     int quantity;

     Product(int pId,int price, int quantity){
         this.pId = pId;
         this.price = price;
         this.quantity = quantity;
     }

     static int total(Product ar[]){
         Product a;
         int sum = 0;
         for(int i = 0; i<ar.length;i++){
             a=ar[i];
             sum += (a.price * a.quantity);
         }
         return sum;
     }
 }

 class ProductDemo{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Product ar[] = new Product[5];
         for(int i=0; i<ar.length; i++){
             System.out.println("Enter the Product Id : ");
             int pId = sc.nextInt();

             System.out.println("Enter the Price of product : ");
             int price = sc.nextInt();

             System.out.println("Enter the quantity of Product : ");
             int quantity = sc.nextInt();

             Product p = new Product(pId,price,quantity);
             ar[i] = p;
         }
         int prs = 0;
         for(int i=0; i<ar.length;i++){
             if(ar[i].price > prs){
                 prs = ar[i].price;
             }
         }
         for(int i=0; i<ar.length;i++){
             if(prs == ar[i].price){
                 System.out.println("pId of product with highest price : "+ar[i].pId);
             }
         }

         int x = Product.total(ar);
         System.out.println("Total amount spent on the product : "+x);
     }
 }
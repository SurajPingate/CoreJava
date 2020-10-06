package Q67;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Q66.ShoppingDetails;

public class ShoppingDetails1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		  FileInputStream file1=new FileInputStream("E:\\core java\\dir\\Shopping.dat");
	     //  Shopping1 shop =new Shopping1("Cloath",2000,2);
	       ObjectInputStream obj1=new ObjectInputStream(file1);
	  
	        ShoppingDetails shop=(ShoppingDetails)obj1.readObject();
	        System.out.println(shop);
	        
	       obj1.close();
	       System.out.println("Successfully read Data from Shopping.dat file");
	       file1.close();
		}

	}
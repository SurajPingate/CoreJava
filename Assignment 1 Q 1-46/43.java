/**
 *  43.	Create a class OneBHK with instance variables roomArea, hallArea and price. 
Then create default constructor that initializes instance variables with some values
 and a parameterized constructor that takes values for all instance variables and 
 stores them in instance variables. Now create a method named show()  to print 
 OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and 
behaviors of OneBHK and a new instance variable room2Area. \
Then create default constructor to initialize all 4 instance variables and 
a parameterized constructor to take the values for initialization of all instance 
variables. Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s 
information and print information using show method. 
Also print total amount of all flats. 
 */


class OneBHK{
	int roomArea;
	int hallArea;
	double price;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	OneBHK(){
		this.roomArea=0;
		this.hallArea=0;
		this.price=0;
		//System.out.println("OneBHK");
	}
	
	OneBHK(int roomArea,int hallArea,double price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	
	void show(){
		System.out.println(roomArea);
		System.out.println(hallArea);
		System.out.println(price);
		//System.out.println("TwoBHK");
	}
	
}
class TwoBHK extends OneBHK{
	int room2Area;
	
	TwoBHK(){
		this.room2Area=0;
		//System.out.println("TwoBHK");
	}
	TwoBHK(int roomArea,int hallArea,double price,int room2Area){
		//OneBHK(roomArea,hallArea,price);
		super(roomArea,hallArea,price);
		this.room2Area=room2Area;
	}
	void show(){
		super.show();
		System.out.println(room2Area);
	}
	
	
	
}
class FlatDemo{
	public static void main(String args[]){
		
		double price;

		System.out.println("TwoBHK Flat of Sumit ");
		TwoBHK t = new TwoBHK(40,20,250000,50);
		t.show();
		
		System.out.println("TwoBHK Flat of Suraj");
		TwoBHK t1 = new TwoBHK(60,40,500000,60);
		t1.show();
		
		System.out.println("TwoBHK Flat of Vinay");
		TwoBHK t2 = new TwoBHK(80,60,750000,40);
		t2.show();
		//t2.GetPrice();
		
		price= t.getPrice() + t1.getPrice() + t2.getPrice();
		System.out.println("Price of all Two BHK flats are : " +price);
		
		
		
		
	}
}
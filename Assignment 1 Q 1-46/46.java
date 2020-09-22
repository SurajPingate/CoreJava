/**
 *  46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting.
 */

class Vehicle{
	
	
}
class HeavyVehicle extends Vehicle{
	
	
	void show(){
		System.out.println("ACTIVE");
	}
}
class LightVehicle extends HeavyVehicle{
	
	void show(){
		super.show();
		System.out.println("ARG_IN");
	}
}
class VehicleDemo{
	public static void main(String args[]){
		Vehicle v = new HeavyVehicle();
		if(v instanceof Vehicle)
			System.out.println("true");
		else
			System.out.println("False");
		if(v instanceof HeavyVehicle)
			System.out.println("true");
		else
			System.out.println("False");
		if(v instanceof LightVehicle)
			System.out.println("true");
		else
			System.out.println("False");
		
		//System.out.println(v instanceof LightVehicle);
		
		
	}
}
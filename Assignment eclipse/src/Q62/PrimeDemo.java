package Q62;

import java.util.Scanner;


public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Main starts");
		PrimeNo p = new PrimeNo();
		Thread t = new Thread(p);
		t.start();
		System.out.println("Main ends");
	}

}

class PrimeNo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread starts");
		System.out.println("Enter any Positive Number: ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int flag = 0;
		
		for(int i = 2; i<= s/2; ++i){
			if(s % i == 0) {
				flag = 1;
				break;
			}
		}
		
		if(s == 1) {
			System.out.println("1 is not Prime Number");
		}
		else {
			if(flag == 0)
				System.out.println(s+" is Prime number");
			else
				System.out.println(s+ " is not Prime number");
		}
		System.out.println("Thread ends");
	}
}
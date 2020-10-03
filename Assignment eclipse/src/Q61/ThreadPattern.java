//61.		Create a Thread class to print following star (*) pattern on 
//    screen with delay of 1 second between each * print. Number of lines 
//    in the pattern should be passed to the constructor of Thread class. 
//    *  * * * *  * * * * * * * * * * Use this class in main method and 
//    ask user to enter number of lines to print.

package Q61;

import java.util.Scanner;

public class ThreadPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");
		ThreadPat rn = new ThreadPat();       
		Thread th = new Thread(rn);
		th.start();
		System.out.println("Main ends");
	}

}

class ThreadPat implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of lines for pattern: ");
		int n = sc.nextInt();
		for(int i=0; i<n;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.print(" * ");
		}
		System.out.println(" ");
		System.out.println("Thread ends");
	}
}

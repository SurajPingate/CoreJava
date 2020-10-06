//58.	Store name of weekdays in an array (starting from “Sunday” at 0 index).
//Ask day position from user and print day name. Handle array index out of 
//bound exception and give proper message if user enter day index outside 
//range (0-6). 

package Q58;

import java.util.Scanner;

public class WeekDays {
	public static void main(String[] args) {
		String str[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		try {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter a index: ");
			int index=sc.nextInt();
			sc.close();
			
			System.out.println(str[index]);
			
		} catch (Exception e) {
			System.out.println("array index is out of range");
			System.out.println(e);
		}
		
	}
}

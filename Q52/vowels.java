//52.	Input name of a person and count how many vowels it contains.  
//Use String class functions. 

package Q52;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		s=s.toUpperCase();
		int count=0;
		
		for(int i=0;i<(s.length())-1;i++)
		{
			char ch=s.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			{
				count++;
			}
		}
		
		System.out.println("vowel count := "+count);	


	}

}

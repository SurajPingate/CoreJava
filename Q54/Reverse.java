//54.	Write a program to reverse the given String.
package Q54;

public class Reverse {

	public static void main(String[] args) {
		String S="reverse";
		
		StringBuilder sb=new StringBuilder(S);
		
		sb.reverse();
		
		System.out.println("reverse of string : "+sb);

	}

}

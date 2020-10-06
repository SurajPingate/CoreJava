//57.	Write a program to reverse every word of the String.

package Q57;

public class ReverseStr {
	public static void main(String[] args) {
		String str="Welcome to java";
		
		String S[]=str.split(" ");  
	    String reverseWord="";  
	    for(String w : S){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    
	    System.out.println("output : "+reverseWord);
	}
}

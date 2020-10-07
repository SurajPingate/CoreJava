//56.	Write a program to convert very first character of every word in 
//uppercase in a String.

package Q56;

public class Uppercase {

	public static void main(String[] args) {
		
		String str="suraj pingate";
		
		String s1[]=str.split(" ");  
	    String FinalAns="";  
	    for(String w : s1){  
	        String firstLetter=w.substring(0,1);  
	        String afterfirstLetters=w.substring(1);  
	        FinalAns+=firstLetter.toUpperCase()+afterfirstLetters+" "; 
	    }
	    System.out.println("output is: "+FinalAns);
	}
}

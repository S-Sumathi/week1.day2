package week1.day2;

public class Palindrome {
	/* Declare a string first string variable value as"madam"
	 * Declare a second string variable  value as ""
	 * Iterate over the first string in reverse order
	 * Get the char into second string variable
	 * compare first string with second string using .equals method
	 * print palindrome if it equals 
	 * 	
	 */

	public static void main(String[] args) {
		
       //Declaring string variables
		
		String string1="malayalam";
		String stringRev="";
		
		int length=string1.length();
		//for loop to iterate reversely			
		for (int i =length- 1; i>=0; i--) {
			stringRev= stringRev+string1.charAt(i);			
		}
		//Print palindrome
		
		if (string1.equalsIgnoreCase(stringRev)) {
			System.out.println(string1 + " is palindrome");
			
		} 
		else {
				
			System.out.println(string1 + " is not palindromee");	
		    }
	}

}

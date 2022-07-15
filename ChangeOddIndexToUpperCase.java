package week1.day2;

public class ChangeOddIndexToUpperCase {
	/*Declare string input 
	Covert the string to character
	Use for loop for traverse through each character
	Use if statement to find odd index
	within the loop ,change the character to upper case if the index is odd */

	public static void main(String[] args) {
		
	String stringName="changeme";
	
	char[] stringNameArray=stringName.toCharArray();
	
	for (int i = 0; i < stringNameArray.length; i++) {
		
		if (i%2!=0) {
			
			stringNameArray[i]=Character.toUpperCase(stringNameArray[i]);
			System.out.println(stringNameArray[i]); 	
		           }
		else {
		System.out.println(stringNameArray[i]);
		     }
	}	   
	}	
}
		
	



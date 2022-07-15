package week1.day2;



public class RemoveDuplicates {
	/*Declare a string as "We learn java basics as part of java sessions in java week1"
	 * Convert the string to array
	 * Iterate through the array values to find the count of particular repeated values
	 * Replace the word with " " 
	 * Display the string without duplicate values
	 */
	

	public static void main(String[] args) {
		
		//Declaring  variables
	    String stringStmt="We learn java basics as part of java sessions in java week";
		
		//Convert string to array
		String stringStmtArray[]=stringStmt.split(" ");
		
		//Iterate through the array values	
		for (int i = 0; i < stringStmtArray.length; i++) {
			
		//Check the word is available in the string	
			for (int j=i+1; j < stringStmtArray.length; j++) {
				
				if (stringStmtArray[i].equals(stringStmtArray[j])) {
					stringStmtArray[j]=" ";				
				}		
			}						
		}
		for (int i = 0; i < stringStmtArray.length; i++) {
			System.out.print(stringStmtArray[i] + " ");
			
		}
	}
}	
	
	



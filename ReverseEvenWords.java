package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
    /*Declare the input as "I am a software Tester"
     * Split the words and have it in an array
     * Traverse through each word
     * Find the odd index within the loop
     * Split the words and have it in an array
     * Print the even position words in reverse order using another loop
     * convert words to character array if the position is even else print the word as it is
     */
		//Declaring String variable
		
		String test="I am a software Tester";
		//Split the words and keep it in an array
		
		String testArray[]= test.split(" ");
		//Iterate through each word
		
		for (int i = 0; i < testArray.length; i++) {
			
	    //Find the odd index
			if (i%2!=0) {
		//Split the words and have it in an array
				
			char[] word1Array=testArray[i].toCharArray();
		//Printing even position words in reverse order
			
			for (int j=word1Array.length-1; j >= 0; j--) {
				System.out.print(word1Array[j]);
				
			}
				System.out.print(" ");
			} else {
				char[] word2Array=testArray[i].toCharArray();
				for (int j = 0; j < word2Array.length; j++) {
					System.out.print(word2Array[j]);				
				}
               System.out.print(" ");
			}		
		}	
	}
}

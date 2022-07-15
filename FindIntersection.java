package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		//Declaring two integer arrays		
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		
		// for loop to iterate through first array length
		for (int i = 0; i < array1.length; i++) {
			
		//Nested for loop to iterate through second array length	
			for (int j = 0; j < array2.length; j++) {
		
		//if condition to compare both arrays		
				if (array1[i]==array2[j]) {
				System.out.println(array1[i]);
					
				}
				
			}
			
		}

	}

}

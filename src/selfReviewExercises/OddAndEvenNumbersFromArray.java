package selfReviewExercises;

public class OddAndEvenNumbersFromArray {
	
	
	public static void main (String args[]) {
		
		
		int array [] = {1,2,15,13,16,17,28};
		
		System.out.println("Odd numbers: ");
		
		for (int i=0;i<= array.length; i++ ) {
			if (array[i]%2 !=0) {
				System.out.println(array[i]);
			}}
			
			System.out.println("Even numbers: ");
			
			for (int i=0;i<= array.length; i++ ) {
				if (array[i]%2 ==0) {
					System.out.println(array[i]);
				}
			
		}
		
	}

}

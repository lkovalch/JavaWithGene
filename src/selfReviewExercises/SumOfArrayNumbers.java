package selfReviewExercises;

public class SumOfArrayNumbers {

	public static void main(String[] args) {
		
		int [] arrayOfNumbers = {10, 13, 45, 65, 87, 233, 34, 55};
		
		int total=0;
		
		//loop thru array and ADD each element value to TOTAL
		for (int i=0; i< arrayOfNumbers.length; i++) {
			
			total+= arrayOfNumbers[i];
			
			System.out.println("Total number of array elements: " + total);
		}
			
		
		
	}

}

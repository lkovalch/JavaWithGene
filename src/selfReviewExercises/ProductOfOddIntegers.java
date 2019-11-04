package selfReviewExercises;

public class ProductOfOddIntegers {

	public static void main(String[] args) {
		 
		int product =1; //Initialize product - calculated amout of ODD numbers
		int sumOfEvenNumbers=0;
		
		for (int i=1; i<=15; i=+2) { // create loop to iterate thru each second numbers,  i=+2
			product *=i;           //each loop, the multiplied amount is added to product to find a summary
		
		
			
	System.out.printf("The product of all odd integers from 1 to 15 is: %d", product);
			
			if (i%2==0) {sumOfEvenNumbers +=1;
			
			System.out.printf("The summary of all even integers from 1 to 15 is: %d", sumOfEvenNumbers);
		
	}
		}}}

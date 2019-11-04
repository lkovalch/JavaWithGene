package selfReviewExercises;

import java.util.Scanner;

public class GasMiles {

	public static void main(String[] args) {
		
		float milesDriven;
		float gasUsed;
		float total= 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter number of miles for this trip: ");
		
		milesDriven =input.nextFloat();
		
		System.out.print("Please enter number of gas gallons used: ");

		gasUsed =input.nextFloat();
		
		float result = milesDriven/gasUsed;
		
		total = total + result; 
		
		System.out.println ("The gas usage is "+result + " gallons per mile");
		
		input.close();
		
	}

}

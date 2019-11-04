package selfReviewExercises;

import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {
	
		// create Scanner to obtain input from command window
		Scanner input = new Scanner (System.in);
		
		//initializing variables in declaration
		int passNumber = 0;
		int failedNumber = 0;
		
		int numberStudents = 1;
		int result; // one exam result obtained from User Input
		
		while (numberStudents <=10) {
			
		//Prompt user to enter exam result (1 or 2)
		System.out.print("Please eneter results for your exam (1=pass, 2 = fail): ");
		
		result = input.nextInt(); // assign the entered data to the result variable.
			
			if (result ==1) passNumber++; //increment pass numbers
		
			else failedNumber++; //increment failed numbers 
			
			numberStudents  = numberStudents +1;}
		
		System.out.println("Total passed exams: "+ passNumber );
		System.out.print("Total failed exams: "+ failedNumber );

			
			if (passNumber >= 8) 
				System.out.println("You are Super Instructor! You deserve Bonus");
				if (passNumber < 8) 
					System.out.println();
					
					System.out.println("You are Cool Instructor!");
				
				input.close();
				
				
					
				}}
	



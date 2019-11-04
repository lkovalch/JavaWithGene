package selfReviewExercises;

import java.util.Scanner;

public class RunClass {

	public static void main(String[] args) {
		
		//Create scanner to obtain input from command line:
		
		Scanner input = new Scanner (System.in);
		
		// Create GradeBook class object to use in Main class
		
		GradeBook myGB = new GradeBook ();
		myGB.displayMessage();
		
	// Prompt user to inter course name:
		System.out.print("Please enter your course name: "); 
		
		String courseName = input.nextLine ();//read the user input and assign value to String variable
		System.out.println(); //add one line, outputr is one blank line.
		
		System.out.print("How many months you are learning Java? ");
		
		int timing =input.nextInt();
		
		System.out.print("That is awesome! You are learning  "+ courseName+ " for " +timing + " months");
		//Use GradeBook method to print the course name
		
		//System.out.print(myGB.displayMessage());
		
		 
		input.close();
		
	}
	
	
	
}

package test;

import java.util.Scanner;

import selfReviewExercises.GradeBook;

public class GradeBookTest {

	public static void main(String[] args) {

		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );

		// create a GradeBook object and assign it to myGradeBook
		//pass course name to the constractor
		
		GradeBook myGradeBook = new GradeBook();

		// display initial value of courseName
		System.out.printf( "Initial course name is: %s\n\n",
				myGradeBook.getCourseName() );
		// prompt for and read course name
		System.out.println( "Please enter the course name:" );
	
		myGradeBook.setCourseName("Java"); // set the course name
		System.out.println(); // outputs a blank line

		// display welcome message after specifying course name
		myGradeBook.displayMessage();

		myGradeBook.determineClassAverage();
		
		input.close();

	}

}

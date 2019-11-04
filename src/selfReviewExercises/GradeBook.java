package selfReviewExercises;

import java.util.Scanner;

public class GradeBook {
	
	String courseName;
	

		public void setCourseName(String name) {
		
		courseName = name;
			
		};
		
		public String getCourseName() {
			return courseName;
		}
		// display a welcome message to the GradeBook user
		public void displayMessage(){
		       
		       // getCourseName gets the name of the course
		       System.out.printf( "Welcome to the grade book for\n%s!\n\n",
		       getCourseName() );
		      } 
		      
		       // determine class average based on 10 grades entered by user
	public void determineClassAverage(){
		   
	// create Scanner to obtain input from command window
		      Scanner input = new Scanner( System.in );
		      int total; // sum of grades entered by user
		      int gradeCounter; // number of the grade to be entered next
		      int grade; // grade value entered by user
		      int average; // average of grades
		      // initialization phase
		      total = 0; // initialize total
		      gradeCounter = 1; // initialize loop counter
		      // processing phase uses counter-controlled repetition while ( gradeCounter <= 10 ) // loop 10 times
		      {
		      System.out.print( "Enter grade: " ); // prompt
		      grade = input.nextInt(); // input next grade
		      total = total + grade; // add grade to total
		      gradeCounter = gradeCounter + 1; // increment counter 
		      average =total/10;
		      
		      System.out.printf( "\nTotal of all 10 grades is %d\n", total );
		      System.out.printf( "Class average is %d\n", average );
		      
		      input.close();
			}}}
		
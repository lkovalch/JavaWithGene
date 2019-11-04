package selfReviewExercises;

import java.util.Scanner;

public class UserInputCalc {

	public static void ThreeInputsSummary() {
		//Program will calculate three integers
		//create a Scanner to prompt user to enter numbers
		
		Scanner input = new Scanner (System.in);
				
		System.out.print("Please enter first integer: ");
		int x= input.nextInt();
		
		System.out.print("Please enter second integer: ");
		int y= input.nextInt();
		
		System.out.print("Please enter third integer: ");
		int z= input.nextInt();
		int result = x + y+ z;
		
		System.out.println("Product is "+ result);
		
		
		input.close();
		
		System.out.println( "*" );
        System.out.println( "***" );
        System.out.println( "*****" );
        System.out.println( "****" );
        System.out.println( "**" );
        
        System.out.printf( "%s\n%s\n%s\n", "*", "***", "*****" );

}}

package selfReviewExercises;

import java.util.Scanner;


public class BodyMass {
	
	
	 public static void CalculateBodyMass () {

		Scanner input = new Scanner (System.in);

		//Prompt user to enter weight in kg
		System.out.print("Enter your weight in kilos" + ": ");
		
		double weight =input.nextInt();
		
		//Prompt user to enter height in sm
		System.out.print("Enter your height in santimeter: ");

		double height = input.nextInt();
		
		// Calculate body mass 
		double result=(weight/(height * height/1000)*10);
		//System.out.print  ("Your BMI is: " + bm.CalculateBodyMass( weight, height));
		
		System.out.println ("Your BMI is: " + Math.round(result));
		 
		if (result<18.5) {
			System.out.println("You are underweight! ");
		}
		else if  (result >=18.5 && result <=24.9) {
			 System.out.println("Your weight is normal "); 
		 }
		
		else if  (result >=25 && result <=29.0) {
			 System.out.println("You are little overweight "); 
		 }
		
		else if  (result >=30) {
			 System.out.println("You should STOP eat - you are FAT "); 
		 }
		
		
		else  System.out.println("Somethingis not correct...");
		
		
		input.close();
		
		

}
}
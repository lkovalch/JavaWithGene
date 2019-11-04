package selfReviewExercises;

import java.util.Scanner;

public class SalaryCalculation {

	public static void main(String[] args) {

			double hoursWorked =0;
			double salaryPerHour =0;
			
			//Start scanner to enbale user to enter their data
			Scanner input = new Scanner (System.in);
			//Prompt user to enter total hours worked
			System.out.print("Please enter number of hours you worked this pay period: ");
			
			hoursWorked = input.nextDouble();
			//Prompt user to enter hourly salary
			System.out.print("Please enter your hourly rate: ");
			
			salaryPerHour = input.nextInt();
				
			double grossPay = (40 * salaryPerHour) + (hoursWorked - 40) * 1.5;
			
			System.out.print("Your gross salary for this period is $ " + grossPay);
			
			input.close();
			
	}

}


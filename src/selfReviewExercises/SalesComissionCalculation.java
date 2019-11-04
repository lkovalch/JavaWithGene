package selfReviewExercises;

import java.util.Scanner;

public class SalesComissionCalculation {

	public static void main(String[] args) {
		
		double totalSummary=0;
		double weeklySalary =0;
		
		Scanner input = new Scanner (System.in);
		
		//Promp salesperson to enter item's number
		System.out.print("Please enter item's number you sold this week: ");
		double itemNumber= input.nextDouble();
		
	
	   //Promp salesperson to enter quantity of sold items
		System.out.print("Please enter how many you sold: ");
		double quantity= input.nextDouble();
			
			if (itemNumber ==1) 
			{totalSummary = (quantity * 239.99);}
			
				else if (itemNumber ==2) 
				{totalSummary = (quantity * 129.75);}
			
					else if (itemNumber ==3) 
					{totalSummary = (quantity * 99.95);}
						else if (itemNumber ==4) 
						{totalSummary = (quantity * 350.89);}
							else  System.out.println("Sorry, we don't have such item");
			
			
			
		//Total weekly salary including commission
		weeklySalary = totalSummary * 9/100 + 200;
			
			System.out.println("Total salary incuding commission for this salesperson is $" + weeklySalary);
			
			input.close();
			
			

}}

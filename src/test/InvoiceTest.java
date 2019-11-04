package test;

import java.util.Scanner;

import selfReviewExercises.Invoice;

public class InvoiceTest {
	

public static void main(String[] args) {
	
	Scanner invoiceScan = new Scanner (System.in);
	
	System.out.print("Please enter the part description:  " );
	 
	String partdesc =invoiceScan.nextLine();
	
	System.out.print("Please enter the part number:  " );
	 
	String number= invoiceScan.nextLine();
	
	System.out.print("Please enter quantity:  " );
	
	int quant = invoiceScan.nextInt();
	
	System.out.print("Please enter the price:  " );
	
	int price = invoiceScan.nextInt();
	
	
	Invoice myInvoice = new Invoice ();
		
	int summary = (myInvoice.calculateTotalAmount(quant, price));
	
	
	
	System.out.println("part decsription:  "+partdesc);
	System.out.println("part number:  "+number);
	
	System.out.print("Your total amount to pay :  "+ "$"+summary);
	
	
	 
	invoiceScan.close();
	
	
	
	
	
	}

	
}

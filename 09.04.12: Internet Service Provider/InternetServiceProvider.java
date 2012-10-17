/* An Internet service provider has three different subscription packages
 * for its customers.
 * 
 * 		Package A:	For $9.95 per month 10 hours of access access are
 * 					provided. Additional hours are $2.00 per hour.
 * 		
 * 		Package B:	For $13.95 per month 20 hours of access are provided.
 * 					Additional hours are $1.00 per hours.
 * 
 * 		Package C:	For $19.95 per month unlimited access is provided.
 * 
 * Write a program that calculates a customer's monthly bill. It should
 * ask the user to enter the letter of the package the customer has
 * purchased (A, B, or C) and the number of hours that were used. It
 * should then display the total charges.
*/

import java.util.Scanner;


public class InternetServiceProvider {
	public static void main (String args[])
	{
		Scanner userInput = new Scanner (System.in);
		
		while (true)
		{
			printMonthlyBill(calculateBill(getHours(userInput), menu(userInput)));
		}
	}
	
	public static double getHours(Scanner userInput)
	{
		double hours;
		
		System.out.print("Please enter the hours used: ");
		hours = userInput.nextDouble();
		
		return hours;
	}
	
	public static int menu (Scanner userInput)
	{
		int packageChoice;
		
		System.out.println("\n[1] Package A");
		System.out.println("[2] Package B");
		System.out.println("[3] Package C");
		System.out.print("Please select your package: ");
		packageChoice = userInput.nextInt();
		
		return packageChoice;
	}
	
	public static double calculateBill(double hours, int packageChoice)
	{
		switch (packageChoice)
		{
			case 1:
				if (hours < 10)
				{
					return 9.95;
				}
				
				else
				{
					return (hours - 10)*2 + 9.95;
				}
				
			case 2:
				if (hours < 20)
				{
					return 13.95;
				}
				
				else
				{
					return (hours - 20) + 13.95;
				}			
			case 3:
				return 19.95;
				
			default:
				System.out.println("\nInvalid input!");
				return 0;
		}
	}
	
	public static void printMonthlyBill(double bill)
	{	
		if (bill != 0)
			System.out.println("\nYour monthly bill is $" + bill + "\n\n");
		else
			System.out.println("\n");
	}
}

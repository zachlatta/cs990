/* Modify the program you wrote for Programming Challenge 13 so it also calculates and displays the amount of money
 * Package A customers would save if they purchased Packages B or C, and the amount of money Package B customers
 * would save if they purchased Package C. If there would be no savings, no message should be printed.
*/

import java.util.Scanner;


public class InternetServiceProviderPart2 {
	
	// hours is static because passing it between all of the functions isn't needed for a small program, such as this.
	static double hours;
	
	public static void main (String args[])
	{
		Scanner userInput = new Scanner (System.in);
		
		while (true)
		{
			// Calls printMonthlyBill with the appropriate functions as parameters, which executes them 
			printMonthlyBill(calculateBill(getHours(userInput), menu(userInput)));
		}
	}
	
	// Gets hours
	public static double getHours(Scanner userInput)
	{	
		System.out.print("Please enter the hours used: ");
		hours = userInput.nextDouble();
		
		return hours;
	}
	
	// Displays main menu and gets user's package
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
	
	// Calculates the bill
	public static double calculateBill(double hours, int packageChoice)
	{
		switch (packageChoice)
		{
			case 1:
				return getPackageA(hours);
				
			case 2:
				return getPackageB(hours);
				
			case 3:
				return getPackageC();
				
			default:
				System.out.println("\nInvalid input!");
				return 0;
		}
	}
	
	// Prints bill and savings
	public static void printMonthlyBill(double bill)
	{	
		if (bill != 0)
		{
			System.out.printf("\nYour monthly bill is $%.2f\n", bill);
			getSavings(bill);
			System.out.printf("\n\n");
		}
		
		else
			System.out.println("\n");
	}
	
	// Gets bill if user has Package A
	public static double getPackageA(double hours)
	{	
		if (hours < 10)
		{
			return 9.95;
		}
		
		else
		{
			return (hours - 10)*2 + 9.95;
		}
	}
	
	// Gets bill if user has Package B
	public static double getPackageB(double hours)
	{	
		if (hours < 20)
		{
			return 13.95;
		}
		
		else
		{
			return (hours - 20) + 13.95;
		}
	}
	
	// Gets bill if user has Package C
	public static double getPackageC()
	{
		return 19.95;
	}
	
	// Checks if savings are applicable and displays potential savings to the user
	public static void getSavings(double bill)
	{
		if(bill > getPackageA(hours))
		{
			System.out.printf("If you had Package A, you'd save $%.2f\n", bill - getPackageA(hours));
		}
		
		if(bill > getPackageB(hours))
		{
			System.out.printf("If you had Package B, you'd save $%.2f\n", bill - getPackageB(hours));
		}
		
		if(bill > getPackageC())
		{
			System.out.printf("If you had Package C, you'd save $%.2f\n", bill - getPackageC());
		}
	}
}

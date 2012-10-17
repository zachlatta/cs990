/*
 * Design a SavingsAccount class that stores a savings account’s annual interest rate and balance. The class constructor
 * should accept the amount of the savings account’s starting balance. The class should also have methods for subtracting
 * the amount of a withdrawal, adding the amount of a deposit, and adding the amount of monthly interest to the balance.
 * The monthly interest rate is the annual interest rate divided by twelve. To add the monthly interest to the balance, 
 * multiply the monthly interest rate by the balance, and add the result to the balance.
 * 
 * Test the class in a program that calculates the balance of a savings account at the end of a period of time. It should
 * ask the user for the annual interest rate, the starting balance, and the number of months that have passed since the 
 * account was established. A loop should then iterate once for every month, performing the following:
 *		a. Ask the user for the amount deposited into the account during the month. Use the class method to add this
 *		   amount to the account balance.
 * 		b. Ask the user for the amount withdrawn from the account during the month. Use the class method to subtract
 * 		   this amount from the account balance.
 * 		c. Use the class method to calculate the monthly interest.
 * 		   After the last iteration, the program should display the ending balance, the total amount of deposits, the total
 * 		   amount of withdrawals, and the total interest earned.
 */

import java.util.Scanner;

public class SavingsAccountDemo {
	public static void main(String[] args)
	{
		int monthsPassed = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		// Get starting balance & create demoAccount object
		System.out.print("Please enter the starting balance: $");
		SavingsAccount demoAccount = new SavingsAccount(userInput.nextDouble());
		
		// Gets annual interest rate
		System.out.print("Enter the annual interest rate (decimal): ");
		demoAccount.setAnnualInterestRate(userInput.nextDouble());
		
		// Gets numbers of months that have passed since the establishment of the account
		System.out.print("Enter the number of months that have passed since the account\'s establishment: ");
		monthsPassed = userInput.nextInt();
		
		// Loops through all of the 
		for (int count = 1; count <= monthsPassed; count++)
		{
			// Display month number
			System.out.println("\n-----MONTH " + count + "-----");
			
			// Gets amount deposited into account for the month
			System.out.printf("Enter the amount deposited into the account: $");
			demoAccount.deposit(userInput.nextDouble());
			
			
			// Gets amount withdrawn from the account for the month
			System.out.printf("Enter the amount withdrawn from the account: $");
			demoAccount.withdraw(userInput.nextDouble());
			
			// Displays and adds monthly interest
			System.out.printf("This month\'s interest is: $%.2f\n", demoAccount.getMonthlyInterest());
			demoAccount.addMonthlyInterest();
		}
		
		System.out.printf("\nEnding balance: $%.2f", demoAccount.getBalance());
		System.out.printf("\nTotal deposits: $%.2f", demoAccount.getAccumulativeDeposits());
		System.out.printf("\nTotal withdrawals: $%.2f", demoAccount.getAccumulativeWithdrawals());
		System.out.printf("\nTotal interest: $%.2f", demoAccount.getAccumulativeInterest());
		
		
		userInput.close();
	}
}

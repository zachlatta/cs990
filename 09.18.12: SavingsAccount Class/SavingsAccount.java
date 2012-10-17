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

public class SavingsAccount {
	private double annualInterestRate, balance, accumulativeInterest, accumulativeDeposits = 0, accumulativeWithdrawals = 0;

	// Constructor
	public SavingsAccount(double b)
	{
		balance = b;
	}
	
	// Mutators
	public void withdraw(double w)
	{
		balance -= w;
		accumulativeWithdrawals += w;
	}
	
	public void deposit(double d)
	{
		balance += d;
		accumulativeDeposits += d;
	}
	
	public void addMonthlyInterest()
	{
		accumulativeInterest += balance * (annualInterestRate/12);
		balance += balance * (annualInterestRate/12);
	}
	
	// Setters
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public void setAnnualInterestRate(double air)
	{
		annualInterestRate = air;
	}
	
	// Getters
	public double getBalance()
	{
		return balance;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public double getMonthlyInterest()
	{
		return balance * (annualInterestRate/12);
	}
	
	public double getAccumulativeInterest()
	{
		return accumulativeInterest;
	}
	
	public double getAccumulativeDeposits()
	{
		return accumulativeDeposits;
	}
	
	public double getAccumulativeWithdrawals()
	{
		return accumulativeWithdrawals;
	}
}

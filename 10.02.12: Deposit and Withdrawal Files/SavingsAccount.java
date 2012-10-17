package com.zachlatta.depositandwithdrawalfiles;

public class SavingsAccount {
	private double
		annualInterestRate,
		balance,
		accumulativeInterest,
		accumulativeDeposits = 0,
		accumulativeWithdrawals = 0;

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

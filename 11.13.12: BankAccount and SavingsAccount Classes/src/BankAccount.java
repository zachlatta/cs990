import java.math.BigDecimal;
import java.math.RoundingMode;
import org.joda.money.Money;


public abstract class BankAccount
{
	private final double ANNUAL_INTEREST_RATE;
	private Money balance, monthlyServiceCharges = Money.parse("USD 0.00");
	private int monthlyDeposits, monthlyWithdrawals;
	
	public BankAccount(Money balance, double ANNUAL_INTEREST_RATE)
	{
		this.ANNUAL_INTEREST_RATE = ANNUAL_INTEREST_RATE;
		this.balance = balance;
	}

	public Money getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		balance.plus(amount);
		monthlyDeposits++;
	}
	
	public void withdraw(double amount)
	{
		balance.minus(amount);
		monthlyWithdrawals++;
	}
	
	public Money getMonthlyServiceCharges()
	{
		return monthlyServiceCharges;
	}

	public int getMonthlyDeposits()
	{
		return monthlyDeposits;
	}

	public int getMonthlyWithdrawals()
	{
		return monthlyWithdrawals;
	}
	
	public void addMonthlyServiceCharges(double amount)
	{
		monthlyServiceCharges.plus(amount);
	}

	public void calcInterest()
	{
		final double MONTHLY_INTEREST_RATE = ANNUAL_INTEREST_RATE/12;
		BigDecimal monthlyInterestRate = new BigDecimal(Double.toString(MONTHLY_INTEREST_RATE));
		Money monthlyInterest = Money.parse("USD " + balance.multipliedBy(monthlyInterestRate, RoundingMode.DOWN));
		balance.plus(monthlyInterest);
	}
	
	public void monthlyProcess()
	{
		balance.minus(monthlyServiceCharges);
		calcInterest();
		monthlyWithdrawals = 0;
		monthlyDeposits = 0;
		monthlyServiceCharges.minus(monthlyServiceCharges);
	}
}

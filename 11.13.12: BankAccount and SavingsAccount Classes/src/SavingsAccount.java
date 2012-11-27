import org.joda.money.Money;


public class SavingsAccount extends BankAccount
{
	private boolean status;
	private final Money MINIMUM_ACTIVE_ACCOUNT = Money.parse("USD 25.00");
	
	public SavingsAccount(Money balance, double ANNUAL_INTEREST_RATE)
	{
		super(balance, ANNUAL_INTEREST_RATE);
		
		if(super.getBalance().isLessThan(MINIMUM_ACTIVE_ACCOUNT))
		{
			status = false;
		}
		else
		{
			status = true;
		}
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(super.getBalance().isLessThan(MINIMUM_ACTIVE_ACCOUNT) && status != false)
		{
			status = false;
		}
		
		if(status == false)
		{
			System.out.println("Error! Account is inactive.");
		}
		else
		{
			super.withdraw(amount);
		}
	}
	
	@Override
	public void deposit(double amount)
	{
		super.deposit(amount);
			
		if(super.getBalance().isEqual(MINIMUM_ACTIVE_ACCOUNT) || super.getBalance().isGreaterThan(MINIMUM_ACTIVE_ACCOUNT))
		{
			status = true;
		}
	}
	
	@Override
	public void monthlyProcess()
	{
		if(super.getMonthlyWithdrawals() > 4)
		{
			for(int index = 0; index < super.getMonthlyWithdrawals() - 4; index++)
			{
				super.addMonthlyServiceCharges(1);
			}
		}
		
		super.monthlyProcess();
		
		if(super.getBalance().isLessThan(MINIMUM_ACTIVE_ACCOUNT) && status != false)
		{
			status = false;
		}
	}
}

import org.joda.money.Money;


public class SavingsAccountDemo
{
	public static void main(String[] args)
	{
		Money initialBalance = Money.parse("USD 26.42");
		SavingsAccount savingsAccount;
		
		savingsAccount = new SavingsAccount(initialBalance, 0.0095);
		System.out.println("Created account with $26.42 initial balance and 0.95% APY.");
		
		System.out.println("\nDepositing $5...");
		savingsAccount.deposit(5);
		System.out.println("Current balance is $" + savingsAccount.getBalance().getAmount().doubleValue());
		
		System.out.println("\nWithdrawing $10...");
		savingsAccount.withdraw(10);
		System.out.println("Current balance is $" + savingsAccount.getBalance().getAmount().doubleValue());
		
		System.out.println("\nDepositing $3.55...");
		savingsAccount.deposit(3.55);
		System.out.println("Current balance is $" + savingsAccount.getBalance().getAmount().doubleValue());
		
		System.out.println("\nUndergoing monthly process...");
		savingsAccount.monthlyProcess();
		System.out.println("Current balance is $" + savingsAccount.getBalance().getAmount().doubleValue());
		
		System.out.println("\nWithdrawing $5...");
		savingsAccount.withdraw(5);
	}
}

import java.util.Scanner;


public class BankCharges
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int checksWritten = 0;
		double charge = 0;
		
		System.out.print("Please enter the number of checks written for the month: ");
		checksWritten = keyboard.nextInt();
		
		if(checksWritten < 20)
		{
			charge = checksWritten * 0.10;
		}
		else if(checksWritten < 40)
		{
			charge = checksWritten * 0.08;
		}
		else if(checksWritten < 60)
		{
			charge = checksWritten * 0.06;
		}
		else if(checksWritten >= 60)
		{
			charge = checksWritten * 0.04;
		}
		
		System.out.println("The service fees for the month are $" + charge + ".");
	}
}

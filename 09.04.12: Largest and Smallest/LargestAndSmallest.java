import java.util.Scanner;


public class LargestAndSmallest {
	public static void main (String[] args)
	{
		double highest, lowest, number;
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = userInput.nextDouble();
		highest = number;
		lowest = number;
		
		while (true)
		{
			System.out.print("Enter a number: ");
			number = userInput.nextDouble();
			
			if (number == -99)
				break;
			
			if (number > highest)
				highest = number;
			
			if (number < lowest)
				lowest = number;
		}
		
		System.out.println("\nThe highest number was " + highest);
		System.out.println("The lowest number was " + lowest);
		
		userInput.close();
	}
}

import java.util.Scanner;


public class TestAverage {
	public static void main (String args[])
	{
		double score1, score2, score3, average;
		
		// Create userInput stream
		Scanner userInput = new Scanner(System.in);
		
		// Get test scores
		System.out.print("Please enter the first test score: ");
		score1 = userInput.nextDouble();
		
		System.out.print("Please enter the second test score: ");
		score2 = userInput.nextDouble();
		
		System.out.print("Please enter the third test score: ");
		score3 = userInput.nextDouble();
		
		// Close userInput stream
		userInput.close();
		
		// Compute average
		average = (score1 + score2 + score3)/3;
		
		// Round to two decimal places
		average = (double)Math.round(average * 100) / 100;
		
		// Print average
		System.out.println("The average is " + average + ".");
	}
}

import java.util.Scanner;


public class StringManipulator {
	public static void main (String args[])
	{
		String favoriteCity;
		
		// Creates userInput stream
		Scanner userInput = new Scanner(System.in);
		
		// Gets user's favorite city
		System.out.print("Please enter your favorite city: ");
		favoriteCity = userInput.nextLine();
		
		// Prints information about favoriteCity
		System.out.println("Number of characters: " + favoriteCity.length());
		System.out.println("Uppercase: " + favoriteCity.toUpperCase());
		System.out.println("Lowercase: " + favoriteCity.toLowerCase());
		System.out.println("First character: " + favoriteCity.charAt(0));
		
		// Closes userInput stream
		userInput.close();
	}
}

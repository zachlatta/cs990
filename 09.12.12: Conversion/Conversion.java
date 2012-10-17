import java.util.Scanner;

public class Conversion {
	public static void main (String args[])
	{
		double meters;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the number of meters: ");
		meters = userInput.nextDouble();
		
		menu(meters);
		
		userInput.close();
	}
	
	public static void menu (double meters)
	{
		int choice;
		
		Scanner menuChoice = new Scanner(System.in);
		
		System.out.println("\n1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
		
		System.out.print("\nYour choice: ");
		
		choice = menuChoice.nextInt();
		
		switch (choice)
		{
			case 1: showKilometers(meters);
					break;
			case 2: showInches(meters);
					break;
			case 3: showFeet(meters);
					break;
			case 4: quitProgram(meters);
					break;
			default: System.out.println("Invalid input!"); menu(meters);
					break;
		}
		
		menuChoice.close();
	}
	
	public static void showKilometers (double meters)
	{
		double kilometers = meters * 0.001;
		
		System.out.println("\n\n" + meters + " meters is " + kilometers + " kilometers.");
		
		menu(meters);
	}
	
	public static void showInches(double meters)
	{
		double inches = meters * 39.37;
		
		System.out.println("\n\n" + meters + " meters is " + inches + " inches.");
		
		menu(meters);
	}
	
	public static void showFeet (double meters)
	{
		double feet = meters * 3.281;
		
		System.out.println("\n\n" + meters + " meters is " + feet + " feet.");
		
		menu(meters);
	}
	
	public static void quitProgram (double meters)
	{
		System.exit(0);
	}
}
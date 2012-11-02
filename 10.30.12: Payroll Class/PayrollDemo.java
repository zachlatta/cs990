import java.util.Scanner;


public class PayrollDemo
{
	public static void main(String[] args)
	{
		Payroll payroll = new Payroll();
		Scanner keyboard = new Scanner(System.in);
		
		mainMenu(keyboard, payroll);
	}
	
	public static void mainMenu(Scanner keyboard, Payroll payroll)
	{
		boolean exit = false;
		int userSelection;
		
		do
		{
			// Displays menu
			System.out.println("===================");
			System.out.println("=    MAIN MENU    =");
			System.out.println("===================\n");
			System.out.println("[1] Input employee information");
			System.out.println("[2] View employee information");
			System.out.println("[3] Exit");
			System.out.print("Your selection: ");
			
			// Gets user input
			userSelection = keyboard.nextInt();
			
			switch (userSelection)
			{
				case 1:
				{
					retrieveData(keyboard, payroll);
					break;
				}

				case 2:
				{
					viewInfo(keyboard, payroll);
					break;
				}

				case 3:
				{
					exit = true;
					break;
				}

				default:
				{
					System.out.println("\nInvalid input!\n");
					break;
				}
			}
		} while (!exit);
	}
	
	/**
	 * Gets the user's input for each employee id's hours worked and pay rate. It stores
	 * the values using payroll.setHours() and payroll.setPayRate()
	 * 
	 * @param keyboard scanner object
	 * @param payroll the payroll class
	 */
	public static void retrieveData(Scanner keyboard, Payroll payroll)
	{
		for (int index = 0; index < 7; index++)
		{
			// Gets data
			System.out.println("\n=====EMPLOYEE " + payroll.getEmployeeId(index) + "=====");
			
			do
			{
				System.out.print("Please enter hours worked: ");
				payroll.setHours(index, keyboard.nextInt());
				
				if(!validHours(payroll.getHours(index)))
				{
					System.out.println("Invaid input! Please only enter nonnegative numbers.");
				}
			} while(!validHours(payroll.getHours(index)));
			
			do
			{
				System.out.print("Please enter pay rate: $");
				payroll.setPayRate(index, keyboard.nextDouble());
				
				if(!validPayrate(payroll.getPayrate(index)))
				{
					System.out.println("Invalid input! Please only enter numbers greater than six.");
				}
			} while (!validPayrate(payroll.getPayrate(index)));
			
			// Calculates wages
			payroll.calculateWages();
		}
		
		System.out.println();
	}
	
	public static void viewInfo(Scanner keyboard, Payroll payroll)
	{
		// Checks to make sure that user has entered input
		if(payroll.getWages() == null)
		{
			System.out.println("\nNo data exists!\n");
			
			mainMenu(keyboard, payroll);
		}
		
		else
		{
			for(int index = 0; index < 7; index++)
			{
				// Displays the employee's information
				System.out.println("\n=====EMPLOYEE " + payroll.getEmployeeId(index) + "=====");
				System.out.println("Hours worked: " + payroll.getHours(index));
				System.out.println("Payrate: $" + payroll.getPayrate(index));
				System.out.println("Gross wages: $" + payroll.getWages(index));
			}
		}
		
		System.out.println();
	}
	
	/**
	 * Checks if user's input is nonnegative.
	 * 
	 * @param input The user's input
	 * @return true if input is nonnegative, false if input is negative 
	 */
	public static boolean validHours(int input)
	{
		if(input > 0)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	/**
	 * Checks if payrate is equal to or above 6.
	 * 
	 * @param input
	 * @return true if input is equal to or above 6, false if it is under
	 */
	public static boolean validPayrate(double input)
	{
		if(input >= 6)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}
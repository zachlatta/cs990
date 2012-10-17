/*
 * Write a program that asks the user to enter today’s sales for five stores. The program should display a bar chart comparing each store’s sales. Create each bar in the bar chart by displaying a row of asterisks. Each asterisk should represent $100 of sales. Here is an example of the program’s output:
 *
 *  Enter today's sales for store 1: 1000 [Enter]
 *  Enter today's sales for store 2: 1200 [Enter]
 *  Enter today's sales for store 3: 1800 [Enter]
 *  Enter today's sales for store 4: 800 [Enter]
 *  Enter today's sales for store 5: 1900 [Enter]*
 *  SALES BAR CHART
 *  Store 1: **********
 *  Store 2: ************
 *  Store 3: ******************
 *  Store 4: ********
 *  Store 5: *******************
 */

import java.util.Scanner;


public class BarChart {
	public static void main(String[] args)
	{
		double[] store = new double[5];
		
		
		Scanner userInput = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Enter today\'s sales for store %d: ", i + 1);
			store[i] = userInput.nextDouble();
		}
		
		System.out.println("\nSALES BAR CHART");
		
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Store %d: ", i + 1);
			
			for(int c = 0; c < store[i]/100; c++)
				System.out.print("*");
			
			System.out.println();
		}
		
		userInput.close();
	}
}

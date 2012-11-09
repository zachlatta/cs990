import java.text.DecimalFormat;
import java.util.Scanner;

public class CashRegisterDemo
{
	public static void main(String[] args)
	{
		RetailItem item;
		CashRegister cashRegister;
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###.00");

		String itemDescription;
		int quantity;
		double itemPrice;

		System.out.print("Please enter the item's description: ");
		itemDescription = keyboard.nextLine();
		
		System.out.print("Please enter the item's price: $");
		itemPrice = keyboard.nextDouble();

		// Creates item object
		item = new RetailItem(itemDescription, itemPrice);
		
		System.out.print("Please enter the quantity of items: ");
		quantity = keyboard.nextInt();
		
		// Creates CashRegister object
		cashRegister = new CashRegister(item, quantity);
		
		// Displays subtotal, sales tax, and total
		System.out.println("\nSubtotal: $" + decimalFormat.format(cashRegister.getSubtotal()));
		System.out.println("Sales tax: $" + decimalFormat.format(cashRegister.getTax()));
		System.out.println("Total: $" + decimalFormat.format(cashRegister.getTotal()));
	}
}

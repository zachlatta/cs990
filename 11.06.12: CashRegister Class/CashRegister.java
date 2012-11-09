public class CashRegister
{
	double TAX_RATE = 0.06;

	RetailItem item;
	int quantity;

	CashRegister(RetailItem item, int quantity)
	{
		this.item = item;
		this.quantity = quantity;
	}

	public double getSubtotal()
	{
		return item.getPrice() * quantity;
	}

	public double getTax()
	{
		return item.getPrice() * TAX_RATE;
	}

	public double getTotal()
	{
		return getSubtotal() + getTax();
	}
}

public class RetailItem
{
	private String description;
	private double price;

	public RetailItem(String description, double price)
	{
		setDescription(description);
		setPrice(price);
	}

	public String getDescription()
	{
		return description;
	}

	public double getPrice()
	{
		return price;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
}

public class Theater
{
	private double PERCENTAGE_KEPT = 0.20;
	
	private double adultTicketPrice, childTicketPrice;
	private int adultTicketsSold, childTicketsSold;
	
	public double getAdultGross()
	{
		return getAdultTicketPrice() * getAdultTicketsSold();
	}
	
	public double getAdultNet()
	{
		return PERCENTAGE_KEPT * getAdultGross();
	}
	
	public double getAdultTicketPrice()
	{
		return adultTicketPrice;
	}
	
	public int getAdultTicketsSold()
	{
		return adultTicketsSold;
	}
	
	public double getChildGross()
	{
		return getChildTicketPrice() * getChildTicketsSold();
	}
	
	public double getChildNet()
	{
		return PERCENTAGE_KEPT * getChildGross();
	}
	
	public double getChildTicketPrice()
	{
		return childTicketPrice;
	}
	
	public int getChildTicketsSold()
	{
		return childTicketsSold;
	}
	
	public double getTotalGross()
	{
		return getChildGross() + getAdultGross();
	}
	
	public double getTotalNet()
	{
		return getChildGross() + getChildNet();
	}
	
	public void setAdultTicketPrice(double adultTicketPrice)
	{
		this.adultTicketPrice = adultTicketPrice;
	}
	
	public void setAdultTicketsSold(int adultTicketsSold)
	{
		this.adultTicketsSold = adultTicketsSold;
	}
	
	public void setChildTicketPrice(double childTicketPrice)
	{
		this.childTicketPrice = childTicketPrice;
	}
	
	public void setChildTicketsSold(int childTicketsSold)
	{
		this.childTicketsSold = childTicketsSold;
	}
}
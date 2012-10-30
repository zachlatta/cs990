
public class LongDistanceCall
{
	private double DAYTIME_RATE = 0.07;
	private double EVENING_RATE = 0.12;
	private double OFFPEAK_RATE = 0.05;
	
	private int minutes;
	
	
	public double getCost(int time)
	{
		switch(time)
		{
			case 1:
				return getMinutes() * DAYTIME_RATE;
			
			case 2:
				return getMinutes() * EVENING_RATE;
				
			case 3:
				return getMinutes() * OFFPEAK_RATE;
				
			default:
				return -1;
		}
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public void setMinutes(int minutes)
	{
		this.minutes = minutes;
	}
	
}

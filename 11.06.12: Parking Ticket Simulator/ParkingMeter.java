/**
 * Simulates a parking meter. It only knows the number of minutes of parking time
 * that has been purchased.
 * 
 * @author Zachary Latta
 *
 */
public class ParkingMeter
{
	int parkingTimePurchased;
	
	/**
	 * Sets the meter's amount of parking time purchased to the amount given.
	 * 
	 * @param parkingTimePurchased Amount of parking time purchased
	 */
	ParkingMeter(int parkingTimePurchased)
	{
		setParkingTimePurchased(parkingTimePurchased);
	}

	public int getParkingTimePurchased()
	{
		return parkingTimePurchased;
	}

	public void setParkingTimePurchased(int parkingTimePurchased)
	{
		this.parkingTimePurchased = parkingTimePurchased;
	}
}

/**
 * Simulates a parking ticket. Its responsibilities are as follows:
 * 	-	To report the make, model, color, and license number of the illegally parked car.
 * 	-	To report the amount of the fine, which is $25 for the first hour or part of an hour
 * 		that the car is illegally parked, plus $10 for every additional hour or part of an
 * 		hour that the car is illegally parked.
 * 	-	To report the name and badge number of the police officer issuing the ticket.
 * 
 * @author Zachary Latta
 *
 */
public class ParkingTicket
{
	ParkedCar parkedCar;
	ParkingMeter parkingMeter;
	PoliceOfficer policeOfficer;
	
	/**
	 * Sets the police officer, the parked car, and the parking meter according to the parameters.
	 * 
	 * @param policeOfficer The police officer who issued the ticket
	 * @param parkedCar The illegally parked car
	 * @param parkingMeter The parking meter of the illegally parked car
	 */
	ParkingTicket(PoliceOfficer policeOfficer, ParkedCar parkedCar, ParkingMeter parkingMeter)
	{
		this.policeOfficer = policeOfficer;
		this.parkedCar = parkedCar;
		this.parkingMeter = parkingMeter;
	}
	
	public String getColor()
	{
		return parkedCar.getColor();
	}
	
	public Double getFine()
	{
		int illegalMinutes = parkedCar.getMinutesParked() - parkingMeter.getParkingTimePurchased();
		double fine = 0;
		
		/*
		 * Adds the appropriate amount to the fine and then subtracts
		 * the number of minutes fined from illegalMinutes until
		 * illegalMinutes is equal to, or less than zero.
		 */
		
		if(illegalMinutes >= 60)
		{
			fine += 25.00;
			illegalMinutes -= 60;
		}
		
		while(illegalMinutes > 0)
		{
			if(illegalMinutes >= 60)
			{
				fine += 10.00;
				illegalMinutes -= 60;
			}
			
			else
			{
				fine += 10.00;
				illegalMinutes -= illegalMinutes;
			}
		}
		
		return fine;
	}
	
	public String getLicense()
	{
		return parkedCar.getLicenseNumber();
	}
	
	public String getMake()
	{
		return parkedCar.getMake();
	}
	
	public String getModel()
	{
		return parkedCar.getModel();
	}
	
	public String getOfficerBadgeNumber()
	{
		return policeOfficer.getBadgeNumber();
	}
	
	public String getOfficerName()
	{
		return policeOfficer.getName();
	}
}

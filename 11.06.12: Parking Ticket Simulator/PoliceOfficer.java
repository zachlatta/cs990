/**
 * Simulates a police officer inspecting parked cars. Responsibilities are as follows:
 * 	-	To know the police officer's name and badge number
 * 	-	To examine a ParkedCar object and a ParkingMeter object, and determine whether the car's time has expired
 * 	-	To issue a parking ticket (generate a ParkingTicket object) if the car's time has expired.
 * 
 * @author Zachary Latta
 *
 */
public class PoliceOfficer
{
	private String name, badgeNumber;
	
	PoliceOfficer(String name, String badgeNumber)
	{
		this.name = name;
		this.badgeNumber = badgeNumber;
	}
	
	/**
	 * Checks if a parked car's time parked has exceeded the time
	 * purchased on the parking meter.
	 * 
	 * If the car is parked legally,
	 * "Car's name is legally parked." is printed.
	 * 
	 * If the car is parked
	 * illegally, "Car's name is illegally parked. Ticket issued." is
	 * printed and a new ParkingTicket object is created. The parking ticket's
	 * information is then printed.
	 */
	public void examineParkedCar(ParkedCar parkedCar, ParkingMeter parkingMeter)
	{
		if(parkingMeter.getParkingTimePurchased() < parkedCar.getMinutesParked())
		{
			ParkingTicket parkingTicket = new ParkingTicket(this, parkedCar, parkingMeter);
			
			System.out.println(parkedCar.getModel() + " is illegally parked. Ticket issued.");
			
			// Prints parking ticket's information
			System.out.println("\nParking ticket:");
			System.out.println("Issuing officer's name: " + parkingTicket.getOfficerName());
			System.out.println("Issuing officer's badge number: " + parkingTicket.getOfficerBadgeNumber());
			System.out.println("Fine: $" + parkingTicket.getFine());
		}
		
		else
		{
			System.out.println(parkedCar.getModel() + " is legally parked.");
		}
	}

	public String getBadgeNumber()
	{
		return badgeNumber;
	}

	public String getName()
	{
		return name;
	}
}

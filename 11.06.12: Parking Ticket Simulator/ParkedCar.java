/**
 * Simulates a parked car. Includes members for the car's make, model, color, license number, and
 * the number of minutes the car has been parked.
 * 
 * @author Zachary Latta
 *
 */
public class ParkedCar
{
	private String make, model, color, licenseNumber;
	private int minutesParked;
	
	/**
	 * Constructor for ParkedCar. Sets the car's make, model, color, license number, and minutes parked
	 * from parameters given.
	 * 
	 * @param make The make of the car
	 * @param model The model of the car
	 * @param color The color of the car
	 * @param licenseNumber The car's license number
	 * @param minutesParked The minutes the car has been parked
	 */
	ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked)
	{
		setMake(make);
		setModel(model);
		setColor(color);
		setLicenseNumber(licenseNumber);
		setMinutesParked(minutesParked);
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getLicenseNumber()
	{
		return licenseNumber;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getMinutesParked()
	{
		return minutesParked;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setLicenseNumber(String licenseNumber)
	{
		this.licenseNumber = licenseNumber;
	}
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public void setMinutesParked(int minutesParked)
	{
		this.minutesParked = minutesParked;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
}

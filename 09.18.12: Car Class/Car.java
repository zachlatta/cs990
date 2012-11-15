public class Car {
	private int yearModel, speed;
	private String make;
	
	// Constructor
	public Car(int y, String m)
	{
		yearModel = y;
		make = m;
	}
	
	// Accessors
	public int getYearModel()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	// accelerate method, adds five to speed each time it's called
	public void accelerate()
	{
		speed += 5;
	}
	
	// brake method, subtracts five to speed each time it's called
	public void brake()
	{
		speed -= 5;
	}
}

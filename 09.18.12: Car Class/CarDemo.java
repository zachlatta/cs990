public class CarDemo {
	public static void main(String[] args)
	{
		Car accord = new Car(2012, "Honda");
		
		System.out.println("Accelerating...");
		
		for (int i = 0; i < 5; i++)
		{
			accelerate(accord);
			getSpeedOfCar(accord);
		}
		
		System.out.println("\nBraking...");
		
		for (int i = 0; i < 5; i++)
		{
			brake(accord);
			getSpeedOfCar(accord);
		}
		
	}
	
	public static void getSpeedOfCar(Car c)
	{
		System.out.println(c.getSpeed());
	}
	
	public static void accelerate(Car c)
	{
		c.accelerate();
	}

	public static void brake(Car c)
	{
		c.brake();
	}
}

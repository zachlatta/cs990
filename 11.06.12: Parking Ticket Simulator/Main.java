
public class Main
{
	public static void main(String[] arsg)
	{
		PoliceOfficer andy = new PoliceOfficer("Andy Jones", "LD302");
		ParkedCar accord = new ParkedCar("Honda", "Accord 2011", "black", "PK07LVD", 242);
		ParkingMeter meter = new ParkingMeter(30);
		
		andy.examineParkedCar(accord, meter);
	}
}

import java.io.IOException;


public class NumberArrayDemo
{
	public static void main(String[] args) throws IOException
	{
		NumberArray numberArray = new NumberArray("Numbers.txt");
		
		System.out.printf("Lowest number: %.2f\n", numberArray.getMinimum());
		System.out.printf("Highest number: %.2f\n", numberArray.getMaximum());
		System.out.printf("Total of numbers: %.2f\n", numberArray.getTotal());
		System.out.printf("Average of numbers: %.2f", numberArray.getAverage());
	}
}

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


public class NumberArray
{
	private double[] numbers;
	
	NumberArray(String fileName) throws IOException
	{
		numbers = new double[getLineCount(fileName)];
		readFile(fileName);
	}
	
	public double getTotal()
	{
		double total = 0;
		
		for(int index = 0; index < numbers.length; index++)
		{
			total += numbers[index];
		}
		
		return total;
	}
	
	public double getMinimum()
	{
		double minimum = numbers[0];
		
		for(int index = 0; index < numbers.length; index++)
		{
			if(minimum > numbers[index])
			{
				minimum = numbers[index];
			}
		}
		
		return minimum;
	}
	
	public double getMaximum()
	{
		double maximum = numbers[0];
		
		for(int index = 0; index < numbers.length; index++)
		{
			if(maximum < numbers[index])
			{
				maximum = numbers[index];
			}
		}
		
		return maximum;
	}
	
	public double getAverage()
	{
		return getTotal()/numbers.length;
	}
	
	private void readFile(String fileName) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line;
		
		for(int index = 0; (line = br.readLine()) != null; index++)
		{
			numbers[index] = Double.parseDouble(line);
		}
		
		br.close();
	}
	
	private int getLineCount(String fileName) throws IOException
	{
		InputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
		
	    try
	    {
	        byte[] c = new byte[1024];
	        int count = 0;
	        int readChars = 0;
	        boolean empty = true;
	        while ((readChars = inputStream.read(c)) != -1)
	        {
	            empty = false;
	            
	            for (int i = 0; i < readChars; ++i)
	            {
	                if (c[i] == '\n')
	                {
	                	++count;
	                }
	            }
	        }
	        
	        return (count == 0 && !empty) ? 1 : count;
	    }
	    finally 
	    {
	        inputStream.close();
	    }
	}
}

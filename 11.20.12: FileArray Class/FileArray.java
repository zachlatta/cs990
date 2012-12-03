import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileArray
{
	public static void writeArray(String fileName, int[] array) throws IOException
	{
		FileOutputStream fstream = new FileOutputStream(fileName);
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		for(int index = 0; index < array.length; index++)
		{
			outputFile.writeInt(array[index]);
		}
		
		outputFile.close();
	}
	
	public static void readArray(String fileName, int[] array) throws IOException
	{
		FileInputStream fstream = new FileInputStream(fileName);
		DataInputStream inputFile = new DataInputStream(fstream);
		
		for(int index = 0; index < array.length; index++)
		{
			array[index] = inputFile.readInt();
		}
		
		inputFile.close();
	}
}

import java.io.IOException;


public class FileArrayDemo
{
	public static void main(String[] args) throws IOException
	{
		FileArray fileArray = new FileArray();
		int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] secondArray = new int[10];
		
		System.out.print("Contents of first array: ");
		printArray(firstArray);
		System.out.println("\nWriting to contents of first array into array.bin...");
		FileArray.writeArray("array.bin", firstArray);
		System.out.println("Reading contents of array.bin into second array...");
		FileArray.readArray("array.bin", secondArray);
		System.out.print("Contents of second array: ");
		printArray(secondArray);
	}
	
	public static void printArray(int[] array)
	{
		for(int index = 0; index < array.length; index++)
		{
			System.out.print(array[index]);
		}
	}
}

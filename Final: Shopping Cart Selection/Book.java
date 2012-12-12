import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a book in a book store. Includes methods of accessing the book's name
 * and retail price.
 *
 * @author Zachary Latta
 */
public class Book
{
    /** The book's name */
    private String name;
    /** The book's retail price */
    private double retailPrice;

    /**
     * Set's the book's name and retail price to the values given.
     *
     * @param name The book's name
     * @param retailPrice The book's retail price
     */
    public Book(String name, double retailPrice)
    {
        setName(name);
        setRetailPrice(retailPrice);
    }

    /** Returns the book's name */
    public String getName()
    {
        return name;
    }

    /** Returns the book's retail price */
    public double getRetailPrice()
    {
        return retailPrice;
    }

    /** Sets the book's name to the value given */
    public void setName(String name)
    {
        this.name = name;
    }

    /** Sets the book's retail price to the value given */
    public void setRetailPrice(double retailPrice)
    {
        this.retailPrice = retailPrice;
    }

    /**
     * Loads the contents of BookPrices.txt into an ArrayList
     *
     * @param books The ArrayList of books to be read into.
     * @param fileName The name of the file to be read.
     * @return If loading the file was succsesful or not.
     */
    public static boolean loadBooks(ArrayList<Book> books, String fileName)
    {
        try(Scanner scanner = new Scanner(new File(fileName)))
        {
            String currentLine;
            String deliminators = ", ";
            String[] tokens;

            scanner.useDelimiter(", ");

            while(scanner.hasNext())
            {
                currentLine = scanner.nextLine();
                tokens = currentLine.split(deliminators);
                books.add(new Book(tokens[0], Double.parseDouble(tokens[1])));
            }

            return true;
        }
        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Error opening " + fileName + "! \n\nMake sure that it is in the same directory as the program.",
                    "File Not Found", JOptionPane.ERROR_MESSAGE
            );

            return false;
        }
    }
}

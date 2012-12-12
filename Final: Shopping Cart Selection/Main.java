import javax.swing.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Book> books = new ArrayList<>();

        // Sets the look and feel of the GUI to match the system
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        if(Book.loadBooks(books, "BookPrices.txt"))
        {
            new ShoppingCartSelection(books);
        }
    }
}

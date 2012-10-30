import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TheaterWindow extends JFrame
{
	private JPanel pnlAdultTicketPrice, pnlAdultTicketsSold, pnlChildTicketPrice, pnlChildTicketsSold,
		pnlCalculate, pnlMain;
	private JLabel lblAdultTicketPrice, lblAdultTicketsSold, lblChildTicketPrice, lblChildTicketsSold;
	private JTextField txtAdultTicketPrice, txtAdultTicketsSold, txtChildTicketPrice, txtChildTicketsSold;
	private JButton btnCalculate;
	
	public TheaterWindow()
	{
		// Sets window title
		setTitle("Theater");
		
		// Sets layout to BorderLayout
		setLayout(new GridLayout(5,1));
		
		// Specifies what happens when close button is clicked
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Builds the panels
		buildPanels();
		
		// Add the main panel to the frame's content pane
		add(pnlAdultTicketPrice);
		add(pnlChildTicketPrice);
		add(pnlAdultTicketsSold);
		add(pnlChildTicketsSold);
		add(pnlCalculate);
		
		// Size the frame to fit all of the panels
		pack();
		
		// Display the window
		setVisible(true);
	}
	
	private void buildPanels()
	{
		// Creates labels to display instructions
		lblAdultTicketPrice = new JLabel("Adult ticket price");
		lblChildTicketPrice = new JLabel("Child ticket price");
		lblAdultTicketsSold = new JLabel("Adult tickets sold");
		lblChildTicketsSold = new JLabel("Child tickets sold");
		
		// Creates text fields that are 10 characters wide
		txtAdultTicketPrice = new JTextField(10);
		txtChildTicketPrice = new JTextField(10);
		txtAdultTicketsSold = new JTextField(10);
		txtChildTicketsSold = new JTextField(10);
		
		// Creates button with caption
		btnCalculate = new JButton("Calculate");
		
		// Adds action listener to button
		btnCalculate.addActionListener(new CalcButtonListener());
		
		// Creates panels
		pnlAdultTicketPrice = new JPanel();
		pnlChildTicketPrice = new JPanel();
		pnlAdultTicketsSold = new JPanel();
		pnlChildTicketsSold = new JPanel();
		pnlCalculate = new JPanel();
		pnlMain = new JPanel();
		
		// Adds elements to their proper panels
		pnlAdultTicketPrice.add(lblAdultTicketPrice);
		pnlAdultTicketPrice.add(txtAdultTicketPrice);
		pnlChildTicketPrice.add(lblChildTicketPrice);
		pnlChildTicketPrice.add(txtChildTicketPrice);
		pnlAdultTicketsSold.add(lblAdultTicketsSold);
		pnlAdultTicketsSold.add(txtAdultTicketsSold);
		pnlChildTicketsSold.add(lblChildTicketsSold);
		pnlChildTicketsSold.add(txtChildTicketsSold);
		pnlCalculate.add(btnCalculate);
		
		// Adds all of the above panels to a main panel
		pnlMain.add(pnlAdultTicketPrice);
		pnlMain.add(pnlChildTicketPrice);
		pnlMain.add(pnlAdultTicketsSold);
		pnlMain.add(pnlChildTicketsSold);
		pnlMain.add(pnlCalculate);
	}
	
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Creates object of Theater
			Theater theater = new Theater();
			
			// Sets the member variables of Theater to the user's input
			theater.setAdultTicketPrice(Double.parseDouble(txtAdultTicketPrice.getText()));
			theater.setChildTicketPrice(Double.parseDouble(txtChildTicketPrice.getText()));
			theater.setAdultTicketsSold(Integer.parseInt(txtAdultTicketsSold.getText()));
			theater.setChildTicketsSold(Integer.parseInt(txtChildTicketsSold.getText()));
			
			// Creates DecimalFormat object for rounding
			DecimalFormat dollar = new DecimalFormat("#.##");
			
			// Display the charges.
			JOptionPane.showMessageDialog(null, "Adult ticket gross: $" +
					Double.valueOf(dollar.format(theater.getAdultGross())) + "\n" +
					"Child ticket gross: $" + Double.valueOf(dollar.format(theater.getChildGross())) + "\n" +
					"Adult ticket net: $" + Double.valueOf(dollar.format(theater.getAdultNet())) + "\n" +
					"Child ticket net: $" + Double.valueOf(dollar.format(theater.getChildNet())) + "\n" +
					"Total gross: $" + Double.valueOf(dollar.format(theater.getChildGross())) + "\n" +
					"Total net: $" + Double.valueOf(dollar.format(theater.getTotalNet())));
		}
	}
}

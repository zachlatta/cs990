import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MonthlySalesTaxWindow extends JFrame
{
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField salesTextField;
	private JButton calcButton;
	
	private final double COUNTY_TAX_RATE = 0.02;
	private final double STATE_TAX_RATE = 0.04;
	
	/* Constructor */
	public MonthlySalesTaxWindow()
	{
		// Sets window title
		setTitle("Monthly Sales Tax Calculator");
		
		// Specifies what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Build the panel and add it to the frame.
		buildPanel();
		
		// Adds the panel to the frame's content pane
		add(panel);
		
		// Sets the size of the window
		pack();
		
		// Display the window
		setVisible(true);
	}
	
	// Adds a label, text field, and a button to a panel
	private void buildPanel()
	{
		// Creates a label to display instructions
		messageLabel = new JLabel("Enter the month's sales");
		
		// Creates a text field 10 characters wide
		salesTextField = new JTextField(10);
		
		// Create a button with the caption "Calculate taxes".
		calcButton = new JButton("Calculate");
		
		// Add an action listener to the button.
		calcButton.addActionListener(new CalcButtonListener());
		
		// Creates a JPanel object and let the panel field reference it
		panel = new JPanel();
		
		// Add the label, text field, and button components to the panel.
		panel.add(messageLabel);
		panel.add(salesTextField);
		panel.add(calcButton);
	}
	
	private class CalcButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			String input;
			double countyTax, stateTax, totalTax;
			
			// Store the user's input
			input = salesTextField.getText();
			
			// Calculates the different taxes
			countyTax = Double.parseDouble(input) * COUNTY_TAX_RATE;
			stateTax = Double.parseDouble(input) * STATE_TAX_RATE;
			totalTax = countyTax + stateTax;
			
			// Display the result
			JOptionPane.showMessageDialog(null, "County sales tax: " + countyTax +
					"\nState sales tax: " + stateTax + "\nTotal sales tax: " + totalTax);
			
		}
	}
}

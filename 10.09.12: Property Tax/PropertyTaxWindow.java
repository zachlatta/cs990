import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Class that works in conjunction with the Property class. It creates a window that prompts
 * the user for the property's value. It gets this value and calculates the property's
 * assessment value and property tax. It displays these two quantities in a JOptionPane.
 * 
 * @author Zachary Latta
 *
 */
public class PropertyTaxWindow extends JFrame
{
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField propertyValueTextField;
	private JButton calcButton;
	
	private final String windowName = "Property Tax";

	public PropertyTaxWindow()
	{
		setTitle(windowName);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		pack();
		setVisible(true);
	}
	
	private void buildPanel()
	{
		messageLabel = new JLabel("Enter the property\'s value (in dollars)");
		propertyValueTextField = new JTextField(10);
		calcButton = new JButton("Calculate");
		calcButton.addActionListener(new CalcButtonListener());
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(propertyValueTextField);
		panel.add(calcButton);
	}
	
	public class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Property property = new Property(Double.parseDouble(propertyValueTextField.getText()));
			
			JOptionPane.showMessageDialog(null, "Assessment value: $" + property.getAssessmentValue() +
					"\nProperty tax: $" + property.getPropertyTax());
		}
	}
	
}

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class LongDistanceCallWindow  extends JFrame
{
	private JPanel pnlCallLength, pnlCallTime, pnlCalculate;
	private JLabel lblLengthOfCall;
	private JTextField txtLengthOfCall;
	private JButton btnCalculate;
	private JRadioButton rdbDaytime, rdbEvening, rdbOffPeak;
	private ButtonGroup bgTimeSelection;
	
	// Represents the time of the call. 1 = daytime, 2 = evening, 3 = offpeak
	private int time;
	
	public LongDistanceCallWindow()
	{
		// Sets window title
		setTitle("Long Distance Calls");
		
		// Creates GridLayout manager
		setLayout(new GridLayout(3,1));
		
		// Specifies what happens when close button is clicked
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Builds the panels
		buildPanels();
		
		// Add the panels to the frame's content pane
		add(pnlCallLength);
		add(pnlCallTime);
		add(pnlCalculate);
		
		// Size the frame to fit the panels
		pack();
		
		// Display the window
		setVisible(true);
	}
	
	private void buildPanels()
	{
		// Creates label to display instructions
		lblLengthOfCall = new JLabel("Length of call (in minutes)");
		
		// Creates text field that is 10 characters wide
		txtLengthOfCall = new JTextField(10);
		
		// Creates button with the text "Calculate"
		btnCalculate = new JButton("Calculate");
		
		// Add action listener to calculate button
		btnCalculate.addActionListener(new CalcButtonListener());
		
		// Creates radio buttons with text
		rdbDaytime = new JRadioButton("Daytime (6:00 A.M. through 5:59 P.M.)");
		rdbEvening = new JRadioButton("Evening (6:00 P.M. through 11:59 P.M.)");
		rdbOffPeak = new JRadioButton("Off-Peak (12:00 A.M. through 5:59 A.M.)");
		
		// Group the radio buttons
		bgTimeSelection = new ButtonGroup();
		bgTimeSelection.add(rdbDaytime);
		bgTimeSelection.add(rdbEvening);
		bgTimeSelection.add(rdbOffPeak);
		
		// Add action listener to radio buttons
		rdbDaytime.addActionListener(new TimeSelectionListener());
		rdbEvening.addActionListener(new TimeSelectionListener());
		rdbOffPeak.addActionListener(new TimeSelectionListener());
		
		// Create panels
		pnlCallLength = new JPanel();
		pnlCallTime = new JPanel();
		pnlCalculate = new JPanel();
		
		// Add elements to the appropriate panels
		pnlCallLength.add(lblLengthOfCall);
		pnlCallLength.add(txtLengthOfCall);
		pnlCallTime.add(rdbDaytime);
		pnlCallTime.add(rdbEvening);
		pnlCallTime.add(rdbOffPeak);
		pnlCalculate.add(btnCalculate);
	}
	
	private class CalcButtonListener implements ActionListener
	{	
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// Create LongDistanceCall object
			LongDistanceCall longDistanceCall = new LongDistanceCall();
			
			// Sets the amount of minutes in the long distance call to the user's input
			longDistanceCall.setMinutes(Integer.parseInt(txtLengthOfCall.getText()));
			
			// Create DecimalFormat object to round the cost of the call
			DecimalFormat dollar = new DecimalFormat("#.##");
			
			// Displays the cost of the class
			JOptionPane.showMessageDialog(null, "The cost of the call is $" +
					Double.valueOf(dollar.format(longDistanceCall.getCost(time))));
		}
	}
	
	private class TimeSelectionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == rdbDaytime)
			{
				time = 1;
			}
			
			else if (e.getSource() == rdbEvening)
			{
				time = 2;
			}
			
			else if (e.getSource() == rdbOffPeak)
			{
				time = 3;
			}
		}
	}
}

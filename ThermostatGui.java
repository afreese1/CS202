import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ThermostatGui {

	private JFrame frmThermostat;
	private JTextField textField;
	private ThermostatLogic thermo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThermostatGui window = new ThermostatGui();
					window.frmThermostat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ThermostatGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		thermo = new ThermostatLogic();
		
		frmThermostat = new JFrame();
		frmThermostat.setTitle("Thermostat");
		frmThermostat.setBounds(100, 100, 450, 300);
		frmThermostat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThermostat.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(0, 0, 434, 72);
		frmThermostat.getContentPane().add(textField); //?
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Fahrenheit");
		btnNewButton.setToolTipText("USA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double myF = thermo.convertToFahrenheit(Double.parseDouble(textField.getText()));
				textField.setText(String.valueOf(myF));
			}
		});
		btnNewButton.setBounds(77, 118, 89, 23);
		frmThermostat.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_1.setBounds(165, 195, 89, 23);
		frmThermostat.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Celsius");
		btnNewButton_2.setToolTipText("Canada eh");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double myC = thermo.convertToCelsius(Double.parseDouble(textField.getText()));
				textField.setText(String.valueOf(myC));
			}
		});
		btnNewButton_2.setBounds(251, 118, 89, 23);
		frmThermostat.getContentPane().add(btnNewButton_2);
	}

}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator {

	private JFrame frmAlyssasCalculator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmAlyssasCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlyssasCalculator = new JFrame();
		frmAlyssasCalculator.setTitle("Alyssa's Calculator");
		frmAlyssasCalculator.setBounds(100, 100, 450, 300);
		frmAlyssasCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlyssasCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 414, 43);
		frmAlyssasCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(10, 87, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.setBounds(10, 133, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.setBounds(10, 184, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("5");
		btnNewButton_3.setBounds(89, 133, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.setBounds(89, 87, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("9");
		btnNewButton_5.setBounds(168, 87, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(335, 65, 89, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(335, 99, 89, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(335, 133, 89, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(335, 167, 89, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(335, 228, 89, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("2");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBounds(89, 184, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("6");
		btnNewButton_12.setBounds(168, 133, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("3");
		btnNewButton_13.setBounds(168, 184, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("0");
		btnNewButton_14.setBounds(89, 228, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton(".");
		btnNewButton_15.setBounds(10, 228, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("-");
		btnNewButton_16.setBounds(168, 228, 69, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBounds(335, 194, 89, 23);
		frmAlyssasCalculator.getContentPane().add(btnNewButton_17);
	}

}

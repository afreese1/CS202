import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyFirstApplication {

	private JFrame frame;
	private JTextField nameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstApplication window = new MyFirstApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFirstApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton nameButton = new JButton("Click Me");
		nameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameTextField.setText("Button was clicked");
			}
		});
		nameButton.setToolTipText("Java is Fun");
		nameButton.setBounds(153, 149, 89, 23);
		frame.getContentPane().add(nameButton);
		
		nameTextField = new JTextField();
		nameTextField.setForeground(Color.RED);
		nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		nameTextField.setText("Start");
		nameTextField.setBounds(71, 74, 252, 46);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
	}
}

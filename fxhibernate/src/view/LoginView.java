package view;

/**
 * Vista de login y sus implementaciones
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView {

	private JFrame frame;
	private JTextField username;
	private JLabel UserLabel;
	private JLabel PasswordLabel;
	private JButton LoginButton;
	private JLabel RegisLabel;
	private JButton SingUpButton;
	private JPasswordField PasswordField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 514, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		UserLabel = new JLabel("Username");
		UserLabel.setBounds(46, 31, 71, 16);
		frame.getContentPane().add(UserLabel);

		PasswordLabel = new JLabel("Password");
		PasswordLabel.setBounds(46, 68, 71, 16);
		frame.getContentPane().add(PasswordLabel);

		username = new JTextField();
		username.setBounds(151, 30, 96, 19);
		frame.getContentPane().add(username);
		username.setColumns(10);

		LoginButton = new JButton("Login");
		LoginButton.setBackground(Color.YELLOW);
		LoginButton.setBounds(33, 131, 85, 43);
		frame.getContentPane().add(LoginButton);

		RegisLabel = new JLabel("\u00BFNO TIENES TU CUENTA TODAVIA?    REGISTRATE YA");
		RegisLabel.setBounds(141, 209, 349, 36);
		frame.getContentPane().add(RegisLabel);

		SingUpButton = new JButton("Sing Up");
		SingUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				new RegistraseView();
			}
		});
		SingUpButton.setBackground(Color.YELLOW);
		SingUpButton.setBounds(378, 255, 85, 44);
		frame.getContentPane().add(SingUpButton);

		PasswordField = new JPasswordField();
		PasswordField.setBounds(151, 67, 96, 19);
		frame.getContentPane().add(PasswordField);
	}
}

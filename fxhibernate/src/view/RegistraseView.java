package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.awt.Color;

public class RegistraseView {

	private JFrame frame;
	private JTextField UsernameTxt;
	private JPasswordField password1Field;
	private JPasswordField password2Field;


	public RegistraseView() {
		initialize();

		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel UsernameLb = new JLabel("USERNAME");
		UsernameLb.setBounds(25, 44, 86, 31);
		frame.getContentPane().add(UsernameLb);

		JLabel RegistrarseLb = new JLabel("Sign Up View");
		RegistrarseLb.setBackground(Color.PINK);
		RegistrarseLb.setForeground(Color.RED);
		RegistrarseLb.setFont(new Font("Tahoma", Font.BOLD, 20));
		RegistrarseLb.setBounds(25, 10, 213, 23);
		frame.getContentPane().add(RegistrarseLb);

		JLabel Password1Label = new JLabel("PASSWORD");
		Password1Label.setBounds(25, 94, 84, 13);
		frame.getContentPane().add(Password1Label);

		JLabel Pasword2Label = new JLabel("REPEAT THE PASSWORD");
		Pasword2Label.setBounds(25, 135, 200, 16);
		frame.getContentPane().add(Pasword2Label);

		UsernameTxt = new JTextField();
		UsernameTxt.setBackground(Color.YELLOW);
		UsernameTxt.setBounds(259, 50, 96, 19);
		frame.getContentPane().add(UsernameTxt);
		UsernameTxt.setColumns(10);

		password1Field = new JPasswordField();
		password1Field.setBackground(Color.YELLOW);
		password1Field.setBounds(259, 91, 96, 19);
		frame.getContentPane().add(password1Field);

		password2Field = new JPasswordField();
		password2Field.setBackground(Color.YELLOW);
		password2Field.setBounds(259, 132, 96, 19);
		frame.getContentPane().add(password2Field);

		JButton SignUpBT = new JButton("SIGN UP");
		SignUpBT.setBackground(Color.YELLOW);
		SignUpBT.setForeground(Color.RED);
	
		SignUpBT.setBounds(300, 197, 85, 42);
		frame.getContentPane().add(SignUpBT);
	}
}

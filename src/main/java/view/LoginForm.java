package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				LoginForm frame = new LoginForm();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		setTitle("LOGIN");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 69, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 169, SpringLayout.WEST, contentPane);
		contentPane.add(textField);
		textField.setColumns(20);

		JLabel lblNewLabel = new JLabel("User name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 3, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -29, SpringLayout.WEST, textField);
		contentPane.add(lblNewLabel);

		textField_1 = new JPasswordField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 27, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		contentPane.add(textField_1);
		textField_1.setColumns(20);

		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 3, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = new String(textField_1.getPassword());
				try {

					JOptionPane.showMessageDialog(contentPane, "This user has been login in other place!", "Error",
							JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(contentPane, "Invalid username or password!", "Error",
							JOptionPane.ERROR_MESSAGE);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 21, SpringLayout.SOUTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 40, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -40, SpringLayout.EAST, textField);
		contentPane.add(btnNewButton);

		/*
		 * JButton btnNewButton_1 = new JButton("<click here to create new account>");
		 * sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 188,
		 * SpringLayout.NORTH, contentPane);
		 * sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -6,
		 * SpringLayout.NORTH, btnNewButton_1); btnNewButton_1.addActionListener(new
		 * ActionListener() { public void actionPerformed(ActionEvent arg0) {
		 * RegisterForm register = new RegisterForm(); register.setVisible(true);
		 * dispose(); } }); btnNewButton_1.setOpaque(false);
		 * btnNewButton_1.setContentAreaFilled(false);
		 * btnNewButton_1.setBorderPainted(false);
		 * sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, -20,
		 * SpringLayout.WEST, textField); contentPane.add(btnNewButton_1);
		 */
	}
}

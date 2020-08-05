package view;

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
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class RegisterForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	private JPasswordField textField_2;
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		setTitle("REGISTER");
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
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 25, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		contentPane.add(textField_1);
		textField_1.setColumns(20);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 1, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Register");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 65, SpringLayout.SOUTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, 88, SpringLayout.SOUTH, textField_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = new String(textField_1.getPassword());
				String confirm = new String(textField_2.getPassword());
				if (!password.equals(confirm)) {
					JOptionPane.showMessageDialog(contentPane,
							"Wrong confirm password!",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					
				}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 35, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -35, SpringLayout.EAST, textField);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Confirm Password:");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1_1, 0, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JPasswordField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 1, SpringLayout.NORTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 25, SpringLayout.SOUTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		textField_2.setColumns(20);
		contentPane.add(textField_2);
		
		JButton btnNewButton_1 = new JButton("<< Back");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm l = new LoginForm();
				l.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, -10, SpringLayout.WEST, contentPane);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, contentPane);
		contentPane.add(btnNewButton_1);
	}
}

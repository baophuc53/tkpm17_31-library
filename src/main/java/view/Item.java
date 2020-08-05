package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class Item extends JPanel {

	private JPanel contentPane;
	/**
	 * Create the panel.
	 */
	public Item(Icon icon, String name) {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		contentPane = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, contentPane, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, contentPane, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, contentPane, 0, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, contentPane, 0, SpringLayout.EAST, this);
		add(contentPane);
		SpringLayout sl_LoginPanel = new SpringLayout();
		contentPane.setLayout(sl_LoginPanel);
		
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sl_LoginPanel.putConstraint(SpringLayout.NORTH, lblNewLabel, 5, SpringLayout.NORTH, contentPane);
		sl_LoginPanel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, contentPane);
		sl_LoginPanel.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(name);
		sl_LoginPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.SOUTH, lblNewLabel);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		sl_LoginPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, contentPane);
		sl_LoginPanel.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, contentPane);
		contentPane.add(lblNewLabel_1);
		
		contentPane.addMouseListener(new MouseAdapter() {
			
			@Override	
			public void mouseExited(MouseEvent e) {
				contentPane.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				contentPane.setBackground(null);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				contentPane.setCursor(new Cursor(Cursor.HAND_CURSOR));
				contentPane.setBackground(Color.LIGHT_GRAY);
			}
			
		});
	}
	
	public JPanel getPanel() {
		return contentPane;
	}

}

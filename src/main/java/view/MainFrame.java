package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.SpringLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private Map<String, JPanel> mapTab = new HashMap<String, JPanel>();
	private Item LoginPanel;
	private JPanel MainTab;
	private Item LogoutPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		sl_contentPane.putConstraint(SpringLayout.NORTH, tabbedPane, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, tabbedPane, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tabbedPane, 90, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, tabbedPane, 0, SpringLayout.EAST, contentPane);
		contentPane.add(tabbedPane);
		
		MainTab = new JPanel();
		ImageIcon LoginIcon = new ImageIcon("src/main/resources/login.png");
		ImageIcon LogoutIcon = new ImageIcon("src/main/resources/logout.png");
		tabbedPane.addTab("Thư viện", null, MainTab, null);
		tabbedPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		tabbedPane.setEnabledAt(0, true);
		SpringLayout sl_MainTab = new SpringLayout();
		MainTab.setLayout(sl_MainTab);
		
		LoginPanel = new Item(LoginIcon, "Đăng nhập");
		sl_MainTab.putConstraint(SpringLayout.SOUTH, LoginPanel, 0, SpringLayout.SOUTH, MainTab);
		LoginPanel.getPanel().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				LoginForm l = new LoginForm();
				l.setVisible(true);
				l.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		sl_MainTab.putConstraint(SpringLayout.NORTH, LoginPanel, 0, SpringLayout.NORTH, MainTab);
		
		MainTab.add(LoginPanel);
		
		LogoutPanel = new Item(LogoutIcon, "Đăng xuất");
		sl_MainTab.putConstraint(SpringLayout.WEST, LoginPanel, -75, SpringLayout.WEST, LogoutPanel);
		sl_MainTab.putConstraint(SpringLayout.EAST, LoginPanel, -10, SpringLayout.WEST, LogoutPanel);
		sl_MainTab.putConstraint(SpringLayout.WEST, LogoutPanel, -65, SpringLayout.EAST, MainTab);
		LogoutPanel.getPanel().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(contentPane, "Logout!!!!!", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		});
		sl_MainTab.putConstraint(SpringLayout.NORTH, LogoutPanel, 0, SpringLayout.NORTH, MainTab);
		sl_MainTab.putConstraint(SpringLayout.SOUTH, LogoutPanel, 0, SpringLayout.SOUTH, MainTab);
		sl_MainTab.putConstraint(SpringLayout.EAST, LogoutPanel, 0, SpringLayout.EAST, MainTab);
		MainTab.add(LogoutPanel);
	}
}

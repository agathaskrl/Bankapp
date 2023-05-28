import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Application extends JFrame {

	private JPanel contentPane;

	
	

	public int width;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	
	public Application(String username,String city,String bank,String location) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBounds(10, 10, 467, 585);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBackground(new Color(255, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Τα ραντεβού μου");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBounds(39, 62, 290, 50);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Αιτήσεις");
		btnNewButton_4_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_4_1.setContentAreaFilled(false);
		btnNewButton_4_1.setBounds(39, 122, 290, 50);
		panel_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Ιστορτικό");
		btnNewButton_4_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_4_2.setContentAreaFilled(false);
		btnNewButton_4_2.setBounds(39, 182, 290, 50);
		panel_1.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton("Προφίλ");
		btnNewButton_4_3.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_4_3.setContentAreaFilled(false);
		btnNewButton_4_3.setBounds(39, 242, 290, 50);
		panel_1.add(btnNewButton_4_3);
		
		JButton btnNewButton_4_4 = new JButton("Προσωπικά Δεδομένα");
		btnNewButton_4_4.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_4_4.setContentAreaFilled(false);
		btnNewButton_4_4.setBounds(39, 302, 290, 50);
		panel_1.add(btnNewButton_4_4);
		
		JButton btnNewButton_4_5 = new JButton("Βοήθεια");
		btnNewButton_4_5.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_4_5.setContentAreaFilled(false);
		btnNewButton_4_5.setBounds(39, 362, 290, 50);
		panel_1.add(btnNewButton_4_5);
		
		JButton btnNewButton_4_6 = new JButton("Ρυθμίσεις");
		btnNewButton_4_6.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_4_6.setContentAreaFilled(false);
		btnNewButton_4_6.setBounds(39, 422, 290, 50);
		panel_1.add(btnNewButton_4_6);
		
		JButton btnNewButton_4_6_1 = new JButton("Αποσύνδεση");
		btnNewButton_4_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn li = new LogIn();
				li.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4_6_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_4_6_1.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_4_6_1.setContentAreaFilled(false);
		btnNewButton_4_6_1.setForeground(new Color(0, 128, 255));
		btnNewButton_4_6_1.setBackground(Color.WHITE);
		btnNewButton_4_6_1.setBounds(0, 516, 133, 36);
		panel_1.add(btnNewButton_4_6_1);
		
		lblNewLabel_3 = new JLabel("");
		Image img_6 = new ImageIcon(this.getClass().getResource("/menu.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img_6));
		lblNewLabel_3.setBounds(10, 0, 50, 50);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 136, 467, 449);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		String s1[] = {"-Epilogh Daneiodothshs-", "0-15.000$", "15.000-50.000$", "50.000$ kai anw" };
		JComboBox comboBox = new JComboBox(s1);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBox) {
					String selectedValue = (String) comboBox.getSelectedItem();
					System.out.println("You seleted the loan: " + selectedValue);
				}
			}
		});
		comboBox.setBounds(135, 126, 184, 32);
		panel_2.add(comboBox);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("Δημιουργία Αίτησης");
		textPane.setFont(new Font("Tahoma", Font.BOLD, 16));
		textPane.setBounds(139, 66, 180, 26);
		panel_2.add(textPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 187, 184, 32);
		panel_2.add(textField);
		
		JButton btnNewButton_2_1 = new JButton("Submit");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp", "root", "Omgkai3lol!");
					CallableStatement myStmt1 = con.prepareCall("call insert_application(?,?,?,?,?,?)");
					
					
					myStmt1.setString(1, username);
					myStmt1.setString(2,city);
					myStmt1.setString(3,bank);
					myStmt1.setString(4,location);
					myStmt1.setString(5,(String) comboBox.getSelectedItem());
					myStmt1.setString(6,textField.getText());
					
					System.out.println((String) comboBox.getSelectedItem());
					System.out.println(textField.getText());
					System.out.println("Calling procedure...");
					myStmt1.executeQuery();
					System.out.println("Called procedure...");
				}
				catch(Exception ex) { 
					System.out.println("Couldnt connect to database");
					
				}
				ApplicationOptions ap = new ApplicationOptions(username,city,bank,location);
				ap.setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApplicationOptions ap = new ApplicationOptions(username,city,bank,location);
				ap.setVisible(true);
				dispose();
			}
		});
		Image img_5 = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(img_5));
		btnNewButton_2.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(392, 157, 32, 32);
		panel_2.add(btnNewButton_2);
		
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1.setBackground(SystemColor.textHighlight);
		btnNewButton_2_1.setBounds(155, 268, 143, 37);
		panel_2.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/note.png")).getImage();
		lblNewLabel_2_3.setIcon(new ImageIcon(img4));
		lblNewLabel_2_3.setBounds(93, 187, 32, 32);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/Money.png")).getImage();
		lblNewLabel_2_3_1.setIcon(new ImageIcon(img5));
		lblNewLabel_2_3_1.setBounds(93, 126, 32, 32);
		panel_2.add(lblNewLabel_2_3_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (width==0) {
					width=1;
					panel_1.setBounds(0, 22,400, 563);
					panel_2.setBounds(0, 136, 0, 449);
					System.out.println(width);
				}
				else{
					width=0;
					panel_1.setBounds(0, 22,0, 563);
					panel_2.setBounds(0, 136, 467, 449);
					System.out.println(width);
				}
			}
		});
		Image img_1 = new ImageIcon(this.getClass().getResource("/menu.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img_1));
		btnNewButton.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 22, 50, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		Image img_2 = new ImageIcon(this.getClass().getResource("/profile.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img_2));
		btnNewButton_1.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(347, 22, 50, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Image img_3 = new ImageIcon(this.getClass().getResource("/settings.png")).getImage();
		btnNewButton_1_1.setIcon(new ImageIcon(img_3));
		btnNewButton_1_1.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(407, 22, 50, 50);
		panel.add(btnNewButton_1_1);
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img_4 = new ImageIcon(this.getClass().getResource("/bankapp1.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img_4));
		lblNewLabel.setBounds(171, 22, 95, 113);
		panel.add(lblNewLabel);
	}
}

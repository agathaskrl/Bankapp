import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;





public class MainPage extends JFrame {

	private JPanel contentPane;
	private JTextField city;

	


public int width;

	public MainPage(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(100, 100, 100, 100));
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
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img_6 = new ImageIcon(this.getClass().getResource("/menu.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img_6));
		lblNewLabel_2.setBounds(10, 0, 50, 50);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 148, 467, 437);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		String s2[] = {"-Epilogh Katasthmatos-"};
		JComboBox comboBox_1 = new JComboBox(s2);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBox_1) {
					String selectedValue1 = (String) comboBox_1.getSelectedItem();
					System.out.println("You seleted the location: " + selectedValue1);
				}
			}
		});
		
		comboBox_1.setBounds(135, 121, 184, 32);
		panel_2.add(comboBox_1);
		
		String s1[] = {"-Epilogh Trapezas-" };
		JComboBox comboBox = new JComboBox(s1);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBox) {
					String selectedValue = (String) comboBox.getSelectedItem();
					System.out.println("You seleted the bank: " + selectedValue);
					
					try {
						Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp", "root", "Omgkai3lol!");  
						PreparedStatement myStmt = con.prepareStatement("Select location FROM bank WHERE city ='"+ city.getText() + "' AND bank ='"+ selectedValue +"'" );
						String currentCity = city.getText();
						
						
						ResultSet myRs = myStmt.executeQuery();
						
						while(myRs.next() ) { ;
							if("TrapezaPeiraiws".equals(selectedValue)) {
								System.out.println("The locations are " + myRs.getString("location"));
								String location = myRs.getString("location");
								comboBox_1.addItem(location);				
								}
							if("Ethniki".equals(selectedValue)) {
								System.out.println("The locations are " + myRs.getString("location"));
								String location = myRs.getString("location");
								comboBox_1.addItem(location);
							}
							if("Eurobank".equals(selectedValue)) {
								System.out.println("The locations are " + myRs.getString("location"));
								String location = myRs.getString("location");
								comboBox_1.addItem(location);
							}
							if("AlphaBank".equals(selectedValue)) {
								System.out.println("The locations are " + myRs.getString("location"));
								String location = myRs.getString("location");
								comboBox_1.addItem(location);
							}
							if("-Epilogh Trapezas-".equals(selectedValue)) {
								System.out.println("The locations are " + myRs.getString("location"));
								String location = myRs.getString("location");
								comboBox_1.addItem(location);
							}
							
						}	
					}
					catch(Exception ex) { 
						System.out.println("Couldnt connect to database");
						
					}
					
				}
			}
		});
		comboBox.setBounds(135, 78, 184, 32);
		panel_2.add(comboBox);
		
	
		city = new JTextField();
		city.setBounds(135, 35, 184, 32);
		panel_2.add(city);
		city.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/map.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(10, 164, 447, 214);
		panel_2.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("GO");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankoptions bo = new bankoptions(username,city.getText(),(String) comboBox.getSelectedItem(),(String) comboBox_1.getSelectedItem());
				bo.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(SystemColor.textHighlight);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(156, 389, 143, 37);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp", "root", "Omgkai3lol!");  
					PreparedStatement myStmt = con.prepareStatement("Select distinct bank FROM bank WHERE city='"+ city.getText() + "' group by bank" );
					String currentCity = city.getText();
					
					ResultSet myRs = myStmt.executeQuery();
					
					while(myRs.next() ) { 
						System.out.println("The banks are " + myRs.getString("bank"));
						String bank = myRs.getString("bank");
						comboBox.addItem(bank);
					}	
				}
				catch(Exception ex) { 
					System.out.println("Couldnt connect to database");
					
				}

			}
		});
		Image img_5 = new ImageIcon(this.getClass().getResource("/search.png")).getImage();
		btnNewButton_3.setIcon(new ImageIcon(img_5));
		btnNewButton_3.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(329, 28, 50, 50);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Image img_9 = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		btnNewButton_5.setIcon(new ImageIcon(img_9));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setBounds(425, 394, 32, 32);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (width==0) {
					width=1;
					panel_1.setBounds(0, 22,400, 563);
					panel_2.setBounds(0, 148,0, 437);
					System.out.println(width);
				}
				else{
					width=0;
					panel_1.setBounds(0, 22,0, 563);
					panel_2.setBounds(0, 148, 467, 437);
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

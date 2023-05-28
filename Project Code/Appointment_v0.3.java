import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.SystemColor;

public class Appointment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;


	

	public int width;
	private JLabel lblNewLabel_3;
	
	public Appointment(String username,String city,String bank,String location) {
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
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.BOLD, 16));
		textPane.setText("Δημιουργία Ραντεβού");
		textPane.setBounds(133, 11, 180, 26);
		panel_2.add(textPane);
		
		
		
		
		String s1[] = {"-Epilogh Hmeras-","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		JComboBox comboBox = new JComboBox(s1);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBox) {
					String selectedValue = (String) comboBox.getSelectedItem();
					System.out.println("You seleted the day: " + selectedValue);
				}
			}
		});
		comboBox.setBounds(129, 160, 184, 32);
		panel_2.add(comboBox);
		
		String s2[] = {"-Epilogh Wras-","08:00 - 09:00" , "09:00 - 10:00 " , "10:00 - 11:00" , "11:00-12:00" , "12:00-13:00", "13:00-14:00" };
		JComboBox comboBox_1 = new JComboBox(s2);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBox_1) {
					String selectedValue1 = (String) comboBox_1.getSelectedItem();
					System.out.println("You seleted the hour: " + selectedValue1);
				}
			}
		});
		comboBox_1.setBounds(129, 203, 184, 32);
		panel_2.add(comboBox_1);
		
		String s3[] = {"-Epilogh Diergasias-","Daneio","Tameio" };
		JComboBox comboBox_2 = new JComboBox(s3);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == comboBox_2) {
					String selectedValue2 = (String) comboBox_2.getSelectedItem();
					System.out.println("You seleted the hour: " + selectedValue2);
				}
			}
		});
		comboBox_2.setBounds(129, 246, 184, 32);
		panel_2.add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(129, 289, 184, 32);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/april.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img5));
		lblNewLabel_1.setBounds(143, 48, 143, 101);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/calendar.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(87, 160, 32, 32);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/clock.png")).getImage();
		lblNewLabel_2_1.setIcon(new ImageIcon(img2));
		lblNewLabel_2_1.setBounds(87, 203, 32, 32);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/briefcase.png")).getImage();
		lblNewLabel_2_2.setIcon(new ImageIcon(img3));
		lblNewLabel_2_2.setBounds(87, 246, 32, 32);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/note.png")).getImage();
		lblNewLabel_2_3.setIcon(new ImageIcon(img4));
		lblNewLabel_2_3.setBounds(87, 289, 32, 32);
		panel_2.add(lblNewLabel_2_3);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Επιθυμώ να ενημερωθώ για τυχόν\r\nακυρώσεις πριν το ραντεβού μου");
		textPane_1.setBounds(87, 332, 226, 32);
		panel_2.add(textPane_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(319, 343, 21, 21);
		panel_2.add(chckbxNewCheckBox);
		
		JButton btnNewButton_2_1 = new JButton("Submit");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp", "root", "Omgkai3lol!");
					CallableStatement myStmt1 = con.prepareCall("call  insert_appointment(?,?,?,?,?,?,?,?)"); 
					
					myStmt1.setString(1, username);
					myStmt1.setString(2, city);
					myStmt1.setString(3, bank);
					myStmt1.setString(4, location);
					myStmt1.setString(5, (String) comboBox.getSelectedItem());
					myStmt1.setString(6, (String) comboBox_1.getSelectedItem());
					myStmt1.setString(7, (String) comboBox_2.getSelectedItem());
					myStmt1.setString(8, textField.getText());
					
					System.out.println( username + "  " + city + "  "+ bank + "  "+ location + "  "+ (String) comboBox.getSelectedItem() + "  "+ (String) comboBox_1.getSelectedItem() + "  "+ (String) comboBox_2.getSelectedItem() + "  "+ textField.getText() );
					System.out.println("Calling procedure...");
					myStmt1.executeQuery();
					System.out.println("Called procedure...");
				}
				catch(Exception ex) { 
					System.out.println("Couldnt connect to database");
					
				}
					AppointmentOptions ap = new AppointmentOptions(username,city,bank,location);
					ap.setVisible(true);
					dispose();
			}
		});
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1.setBackground(SystemColor.textHighlight);
		btnNewButton_2_1.setBounds(143, 388, 143, 37);
		panel_2.add(btnNewButton_2_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppointmentOptions ap = new AppointmentOptions(username,city,bank,location);
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
		btnNewButton_2.setBounds(379, 86, 32, 32);
		panel_2.add(btnNewButton_2);
		
		
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

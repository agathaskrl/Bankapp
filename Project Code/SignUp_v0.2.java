import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField name_;
	private JTextField surname;
	private JTextField email;
	private JTextField username;
	private JTextField phone;
	private JPasswordField password_;
	private JPasswordField password_1;

	


	
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 467, 585);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/bankapp.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		lblNewLabel_3.setBounds(146, 11, 174, 205);
		panel.add(lblNewLabel_3);
		
		name_ = new JTextField();
		name_.setHorizontalAlignment(SwingConstants.CENTER);
		name_.setColumns(10);
		name_.setBounds(10, 250, 174, 33);
		panel.add(name_);
		
		surname = new JTextField();
		surname.setHorizontalAlignment(SwingConstants.CENTER);
		surname.setColumns(10);
		surname.setBounds(283, 250, 174, 33);
		panel.add(surname);
		
		email = new JTextField();
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setColumns(10);
		email.setBounds(10, 331, 447, 33);
		panel.add(email);
		
		JLabel lblNewLabel_1 = new JLabel("Όνομα");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 213, 89, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Επίθετο");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(281, 218, 89, 26);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(10, 294, 89, 26);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Username");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(10, 375, 89, 26);
		panel.add(lblNewLabel_1_3);
		
		username = new JTextField();
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setColumns(10);
		username.setBounds(10, 412, 174, 33);
		panel.add(username);
		
		phone = new JTextField();
		phone.setHorizontalAlignment(SwingConstants.CENTER);
		phone.setColumns(10);
		phone.setBounds(283, 412, 174, 33);
		panel.add(phone);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Τηλέφωνο");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(281, 380, 89, 26);
		panel.add(lblNewLabel_1_1_1);
		
		password_ = new JPasswordField();
		password_.setHorizontalAlignment(SwingConstants.CENTER);
		password_.setBounds(10, 493, 174, 33);
		panel.add(password_);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Password");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(10, 456, 89, 26);
		panel.add(lblNewLabel_1_1_2);
		
		password_1 = new JPasswordField();
		password_1.setHorizontalAlignment(SwingConstants.CENTER);
		password_1.setBounds(283, 493, 174, 33);
		panel.add(password_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Confirm Password");
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2_1.setBounds(283, 456, 162, 26);
		panel.add(lblNewLabel_1_1_2_1);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentName = name_.getText();
				String currentSurname = surname.getText();
				String currentEimail = email.getText();
				String currentUsername = username.getText();
				String currentPhone = phone.getText();
				String currentPassword_ = password_.getText();
				String currentPassword_1 = password_1.getText();
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp", "root", "Omgkai3lol!");
					CallableStatement myStmt1 = con.prepareCall("call insert_user(?,?,?,?,?,?)");
					
					myStmt1.setString(1, currentUsername);
					myStmt1.setString(2, currentPassword_);
					myStmt1.setString(3, currentName);
					myStmt1.setString(4, currentSurname);
					myStmt1.setString(5, currentEimail);
					myStmt1.setString(6, currentPhone);
					
					if(password_.getText().equals( password_1.getText())) {
					
						System.out.println(username.getText()+"		"+password_.getText()+"		"+name_.getText()+"		"+surname.getText()+"	"+email.getText()+"		"+phone.getText());
						System.out.println("Calling procedure...");
						myStmt1.executeQuery();
						System.out.println("Called procedure..."); 
						System.out.println("Succesfulled SignUp");
						
						MainPage mp = new MainPage(username.getText());
						mp.setVisible(true);
						dispose();
					}
					else { 
						WrongPassword wp = new WrongPassword();
						wp.setVisible(true);
						dispose();
						System.out.println("Passwords don't match.");
					}
				}
				catch(Exception ex) { 
					System.out.println("Couldnt connect to database");
					
				}
			}
		});
		btnSignUp.setBounds(193, 541, 85, 33);
		panel.add(btnSignUp);
		
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
		btnNewButton_5.setBounds(10, 541, 32, 32);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn li = new LogIn();
				li.setVisible(true);
				dispose();
			}
		});
		btnNewButton_6.setBounds(425, 541, 32, 32);
		Image img_6 = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		btnNewButton_6.setIcon(new ImageIcon(img_6));
		btnNewButton_6.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(Color.WHITE);
		panel.add(btnNewButton_6);
	}
}

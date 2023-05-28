import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LogIn() {
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
		
		JLabel lblNewLabel = new JLabel("Welcome Back !");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(150, 225, 186, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(193, 261, 89, 26);
		panel.add(lblNewLabel_1);
		
		username = new JTextField();
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setColumns(10);
		username.setBounds(150, 294, 174, 33);
		panel.add(username);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(193, 343, 89, 26);
		panel.add(lblNewLabel_1_1);
		
		password = new JPasswordField();
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setBounds(150, 379, 174, 33);
		panel.add(password);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp", "root", "Omgkai3lol!");  
					
					PreparedStatement myStmt = con.prepareStatement("Select * FROM user WHERE username='" + username.getText() + "' AND password_='" + password.getText() +"'"); 
					
					String currentUsername = username.getText(); 
					
					ResultSet myRs = myStmt.executeQuery();
					
					System.out.println(username.getText() + "           " + password.getText());  		
					if(myRs.next() ) { 
						MainPage mp = new MainPage(username.getText());
						mp.setVisible(true);
						dispose();
						System.out.println("Succesfull LogIn");
					}
						
					else {
						LogInFaield lif = new LogInFaield();
						lif.setVisible(true);
						dispose();
						System.out.println("LogIn Failed");
						
					}
					
				}
				catch(Exception ex) { 
					System.out.println("Couldnt connect to database");
					
				}
			}
		});
		btnNewButton.setBounds(197, 432, 85, 33);
		panel.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp su = new SignUp();
				su.setVisible(true);
				dispose();
			}
		});
		btnSignUp.setBounds(197, 541, 85, 33);
		panel.add(btnSignUp);
		
		JLabel lblNewLabel_2 = new JLabel("Not a Member ?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(182, 521, 111, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/bankapp.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		lblNewLabel_3.setBounds(150, 10, 174, 205);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Forgot password ?");
		btnNewButton_1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		btnNewButton_1.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setForeground(new Color(0, 128, 255));
		btnNewButton_1.setBounds(182, 469, 111, 23);
		panel.add(btnNewButton_1);
		
	
		
	}
}

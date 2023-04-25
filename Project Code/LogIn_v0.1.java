import javax.swing.border.EmptyBorder;

import java.awt.*;
import javax.swing.*;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
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
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(150, 294, 174, 33);
		panel.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(193, 343, 89, 26);
		panel.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(150, 379, 174, 33);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setBounds(197, 432, 85, 33);
		panel.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign Up");
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

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class bankoptions extends JFrame {

	private JPanel contentPane;



	public int width;
	private JLabel lblNewLabel_3;
	
	public bankoptions(String username,String city,String bank,String location) {
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
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img_6 = new ImageIcon(this.getClass().getResource("/menu.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img_6));
		lblNewLabel_2.setBounds(10, 0, 50, 50);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 140, 467, 445);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Change");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage mp = new MainPage(username);
				mp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setForeground(new Color(0, 128, 255));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(383, 0, 74, 39);
		panel_2.add(btnNewButton_2);
		
		
		JButton btnNewButton_3 = new JButton("Ραντεβού");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppointmentOptions ap = new AppointmentOptions(username,city,bank,location);
				ap.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(129, 51, 210, 50);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Ενημερώσεις");
		btnNewButton_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_3_1.setContentAreaFilled(false);
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				News ne = new News(username,city,bank,location);
				ne.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3_1.setBounds(129, 111, 210, 50);
		panel_2.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Επικοινωνία");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Communication co = new Communication(username,city,bank,location);
				co.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_3_2.setContentAreaFilled(false);
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3_2.setBounds(129, 171, 210, 50);
		panel_2.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("Αιτήσεις");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApplicationOptions ap = new ApplicationOptions(username,city,bank,location);
				ap.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3_3.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNewButton_3_3.setContentAreaFilled(false);
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3_3.setBounds(129, 231, 210, 50);
		panel_2.add(btnNewButton_3_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/appont.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(69, 51, 50, 50);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/bell.png")).getImage();
		lblNewLabel_1_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1_1.setBounds(69, 111, 50, 50);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/mail.png")).getImage();
		lblNewLabel_1_2.setIcon(new ImageIcon(img3));
		lblNewLabel_1_2.setBounds(69, 171, 50, 50);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/appl.png")).getImage();
		lblNewLabel_1_3.setIcon(new ImageIcon(img4));
		lblNewLabel_1_3.setBounds(69, 231, 50, 50);
		panel_2.add(lblNewLabel_1_3);
		
		
		lblNewLabel_3 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/traffic.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img5));
		lblNewLabel_3.setBounds(0, 287, 457, 158);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setText(city +" , " + bank + " , "+ location);
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 0, 372, 39);
		panel_2.add(lblNewLabel_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage mp = new MainPage(username);
				mp.setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBounds(405, 153, 32, 32);
		Image img_5 = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		btnNewButton_5.setIcon(new ImageIcon(img_5));
		btnNewButton_5.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (width==0) {
					width=1;
					panel_1.setBounds(0, 22,400, 563);
					panel_2.setBounds(0, 140, 0, 445);
					System.out.println(width);
				}
				else{
					width=0;
					panel_1.setBounds(0, 22,0, 563);
					panel_2.setBounds(0, 140, 467, 445);
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

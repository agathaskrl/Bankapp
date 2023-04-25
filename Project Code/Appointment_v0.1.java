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


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appointment frame = new Appointment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Appointment() {
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 22, 0, 563);
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
		btnNewButton_4_6_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_4_6_1.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_4_6_1.setContentAreaFilled(false);
		btnNewButton_4_6_1.setForeground(new Color(0, 128, 255));
		btnNewButton_4_6_1.setBackground(Color.WHITE);
		btnNewButton_4_6_1.setBounds(0, 516, 133, 36);
		panel_1.add(btnNewButton_4_6_1);
		
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
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.BOLD, 16));
		textPane.setText("Δημιουργία Ραντεβού");
		textPane.setBounds(133, 146, 180, 26);
		panel.add(textPane);
		
		JButton btnNewButton_2 = new JButton("New button");
		Image img_5 = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(img_5));
		btnNewButton_2.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(408, 175, 59, 30);
		panel.add(btnNewButton_2);
		
		
		String s1[] = {"-Επιλογή ημέρας-" };
		JComboBox comboBox = new JComboBox(s1);
		comboBox.setBounds(129, 295, 184, 32);
		panel.add(comboBox);
		
		String s2[] = {"-Επιλογή ώρας-" };
		JComboBox comboBox_1 = new JComboBox(s2);
		comboBox_1.setBounds(129, 338, 184, 32);
		panel.add(comboBox_1);
		
		String s3[] = {"-Επιλογή διεργασίας-" };
		JComboBox comboBox_2 = new JComboBox(s3);
		comboBox_2.setBounds(129, 381, 184, 32);
		panel.add(comboBox_2);
		
		textField = new JTextField();
		textField.setText("-Προσθήκη σημείωσης-");
		textField.setBounds(129, 424, 184, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/april.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img5));
		lblNewLabel_1.setBounds(143, 183, 143, 101);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/calendar.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(87, 295, 32, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/clock.png")).getImage();
		lblNewLabel_2_1.setIcon(new ImageIcon(img2));
		lblNewLabel_2_1.setBounds(87, 338, 32, 32);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/briefcase.png")).getImage();
		lblNewLabel_2_2.setIcon(new ImageIcon(img3));
		lblNewLabel_2_2.setBounds(87, 381, 32, 32);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/note.png")).getImage();
		lblNewLabel_2_3.setIcon(new ImageIcon(img4));
		lblNewLabel_2_3.setBounds(87, 424, 32, 32);
		panel.add(lblNewLabel_2_3);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("Επιθυμώ να ενημερωθώ για τυχόν\r\nακυρώσεις πριν το ραντεβού μου");
		textPane_1.setBounds(87, 467, 226, 32);
		panel.add(textPane_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(319, 478, 21, 21);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton_2_1 = new JButton("Submit");
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1.setBackground(SystemColor.textHighlight);
		btnNewButton_2_1.setBounds(143, 523, 143, 37);
		panel.add(btnNewButton_2_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

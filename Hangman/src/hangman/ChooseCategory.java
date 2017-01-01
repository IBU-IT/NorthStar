package hangman;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ChooseCategory {

	private JFrame frame1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseCategory window = new ChooseCategory();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChooseCategory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Scanner scan = new Scanner (System.in);
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 910, 910);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("COUNTRIES");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\buttons\\countries.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuffWeNeed.CAT = 1; // varijabla CAT u klasi StuffWeNeed sluzi da se odredi koja kategorija je izabrana,ako pritisnemo 
				new TheGameBegins();   //prvo dugme, daje joj vrijednost 1, sto cemo u drugoj klasi postaviti kao uslov za biranje rijeci iz kategorije Countries
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(false);
			}
		});
		btnNewButton.setBounds(109, 243, 213, 58);
		frame1.getContentPane().add(btnNewButton);

		
		btnNewButton_1 = new JButton("CITIES");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\buttons\\cities.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuffWeNeed.CAT = 2;
				new TheGameBegins();
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(109, 422, 213, 64);
		frame1.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("VEGETABLES");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\buttons\\vegetables.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuffWeNeed.CAT = 3;
				new TheGameBegins();
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(109, 628, 213, 64);
		frame1.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("MOVIES");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\buttons\\movies.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuffWeNeed.CAT = 4;
				new TheGameBegins();
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(510, 242, 207, 61);
		frame1.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("FRUITS");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\buttons\\fruits.png"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuffWeNeed.CAT = 5;
				new TheGameBegins();
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(false);
			}
		});
		btnNewButton_4.setBounds(501, 422, 216, 64);
		frame1.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("OBJECTS");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\buttons\\objects.png"));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuffWeNeed.CAT = 6;
				new TheGameBegins();
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(504, 628, 213, 64);
		frame1.getContentPane().add(btnNewButton_5);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 153, 255));
		lblNewLabel.setForeground(new Color(46, 139, 87));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\buttons\\category.jpg"));
		lblNewLabel.setBounds(0, 0, 892, 863);
		frame1.getContentPane().add(lblNewLabel);
	}
}
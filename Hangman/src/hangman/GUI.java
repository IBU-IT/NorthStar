package hangman;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI {

	private JFrame frmHangman;
	private JButton btnNewButton;
	private Label label;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
	private final JLabel lblNewLabel_1 = new JLabel("");
	private JTextField textField;
	private JTextField txtChooseACategory;


	public static void main (String[] args)  {
		BufferedImage img;
		MyPanel panel;
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			
				try {
					Font f = Font.createFont(Font.TRUETYPE_FONT,new FileInputStream(new File("file:\\C:\\Users\\Porodica Solo\\Desktop\\buttons\\Overlock-Regular.ttf"))).deriveFont(Font.PLAIN, 20);
					GUI window = new GUI();
					window.frmHangman.setVisible(true);
				 } catch (Exception e) {
					e.printStackTrace();
				  }
				}
			
		});
	
	}


	public GUI() throws IOException {
		initialize();
	}
	private class MyPanel extends JPanel{
		protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        //g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	    }
	}


	private void initialize() throws IOException {
		frmHangman = new JFrame();
		frmHangman.setResizable(false);
		frmHangman.setTitle("Hangman");
		frmHangman.setBackground(Color.GRAY);
		frmHangman.setBounds(100, 100, 900, 900);
		frmHangman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHangman.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(245, 544, 419, 70);
		frmHangman.getContentPane().add(textField);
		textField.setBorder(null);
		textField.setOpaque(false);
		textField.setColumns(10);
		
		txtChooseACategory = new JTextField();
		txtChooseACategory.setForeground(new Color(165, 42, 42));
		txtChooseACategory.setText("ENTER YOUR NAME:");
		txtChooseACategory.setFont(new Font("Kelmscott", Font.PLAIN, 42));
		txtChooseACategory.setBounds(223, 429, 529, 87);
		txtChooseACategory.setOpaque(false);
		txtChooseACategory.setBorder(null);
		frmHangman.getContentPane().add(txtChooseACategory);
		txtChooseACategory.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\bgr\\Design and Art\\begraund.png"));
		lblNewLabel_2.setBounds(0, 0, 894, 865);
		frmHangman.getContentPane().add(lblNewLabel_2);
		//txtEnterYourName.setContentAreaFilled(false);
		
		btnNewButton_1 = new JButton("");
		//btnNewButton_1.addActionListener(new ActionListener() {
			///public void actionPerformed(ActionEvent arg0) {
				
			//}
			
		}
}
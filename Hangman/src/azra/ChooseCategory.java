package azra;


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
public class ChooseCategory {

	private JFrame frame;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JTextField txtLolololo;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseCategory window = new ChooseCategory();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 910, 910);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(109, 249, 223, 64);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(109, 422, 223, 64);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(109, 628, 223, 64);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(501, 249, 223, 64);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(501, 422, 223, 64);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(501, 628, 223, 64);
		frame.getContentPane().add(btnNewButton_5);
		
		txtLolololo = new JTextField();
		txtLolololo.setForeground(new Color(0, 0, 0));
		txtLolololo.setFont(new Font("Kelmscott", Font.BOLD, 44));
		txtLolololo.setText("CHOOSE A CATEGORY");
		txtLolololo.setHorizontalAlignment(SwingConstants.CENTER);
		txtLolololo.setBounds(131, 35, 634, 64);
		txtLolololo.setOpaque(false);
		txtLolololo.setBorder(null);
		frame.getContentPane().add(txtLolololo);
		txtLolololo.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(46, 139, 87));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Porodica Solo\\Desktop\\buttons\\kafi.png"));
		lblNewLabel.setBounds(0, 0, 892, 863);
		frame.getContentPane().add(lblNewLabel);
	}
}

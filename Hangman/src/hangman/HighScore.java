package hangman;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HighScore {

	private JFrame frmHighScore;
	 JLabel headerLabel = new JLabel();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					HighScore window = new HighScore();
					window.frmHighScore.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HighScore() {
		initialize();
	}

	private void initialize() {
		
		frmHighScore = new JFrame();
		frmHighScore.setTitle("High Score\r\n");
		frmHighScore.setBounds(100, 100, 910, 910);
		frmHighScore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHighScore.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(HighScore.class.getResource("/game/image/back.png")));
		btnNewButton.setBounds(10, 808, 143, 52);
		frmHighScore.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(HighScore.class.getResource("/game/image/exit.png")));
		button.setBounds(741, 808, 143, 52);
		frmHighScore.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HighScore.class.getResource("/game/image/HighScore.png")));
		lblNewLabel.setBounds(0, 0, 894, 871);
		frmHighScore.getContentPane().add(lblNewLabel);
	}
}

package game.image;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class YouLost extends JFrame {
    JPanel contentPane;
    JLabel imageLabel = new JLabel();
    JLabel headerLabel = new JLabel();

    public YouLost() {
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            contentPane = (JPanel) getContentPane();
            contentPane.setLayout(new BorderLayout());
            setSize(new Dimension(550, 400));
            setTitle("GAME OVER");
            headerLabel.setFont(new java.awt.Font("Arial MS", Font.BOLD, 16));
            headerLabel.setText("YOU LOST!");
            contentPane.add(headerLabel, java.awt.BorderLayout.NORTH);
            ImageIcon ii = new ImageIcon(this.getClass().getResource(
                    "GameOver.gif"));
            imageLabel.setIcon(ii);
            contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new YouLost();
    }

}
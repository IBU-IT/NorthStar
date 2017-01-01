package hangman;


import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;



public class TheGameBegins{
	private static String categoryArr[] = new String[50];
	private static final String countries[]={"Andorra","Afghanistan","Anguilla","Albania","Armenia","Netherland","Angola","Antarctica","Argentina"
			,"Austria","Australia","Aruba","Azerbaijan","Barbados","Bangladesh","Belgium","Bulgaria"
			,"Bahrain","Burundi","Benin","Bermuda","Brunei","Bolivia","Brazil","Bahamas","Bhutan"
			,"Botswana","Belarus","Belize","Canada","Switzerland","Chile","Cameroon","China","Colombia"
			,"Cuba","Cyprus","Germany","Djibouti","Denmark","Dominica","Algeria","Ecuador","Estonia"
			,"Egypt","Eritrea","Spain","Ethiopia","Finland","Fiji"};
	private static final String cities[]={};
	private static final String vegetables[]={};
	private static final String movies[]={};
	private static final String fruits[]={};
	private static final String objects[]={};
			
	private JFrame frame2;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);

	private int usedNumbers[] = new int [50];       //array koji nece dozvoljavati da se broj ponovi, tj. da ne dobijemo vise puta istu rijec
    private int a = 0;      //varijabla a sluzi kao brojac koji ce se povecavati svaki put, i koristi samo da bi array mogao funkcionisati kako treba
    private int  rndNumber;
    private String pickedWord;
    private int wordLength;
    private char chosenLetter;
    char[] lettersArr = new char[wordLength];
    private JTextField textField_1;
    private JButton button;
    private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheGameBegins window = new TheGameBegins();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public TheGameBegins() {
		initialize();
	}

	
	 // we Initialize the contents of the frame.
	 
	private void initialize() {
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 900, 900);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setForeground(new Color(0, 0, 0));
		textField_3.setColumns(10);
		textField_3.setBounds(630, 229, 128, 75);
		frame2.getContentPane().add(textField_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(81, 37, 690, 86);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new CompoundBorder());
		frame2.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, -3, 56, 89);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(0, 0, 56, 16);
		panel.add(lblNewLabel_12);
		
		label = new JLabel("");
		label.setBounds(336, 13, 0, 0);
		panel.add(label);
		
		label_1 = new JLabel("");
		label_1.setBounds(341, 13, 0, 0);
		panel.add(label_1);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(57, -3, 56, 89);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(114, -3, 56, 89);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(172, -3, 56, 89);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(229, -3, 56, 89);
		panel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(297, -3, 56, 89);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(342, -3, 56, 89);
		panel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(400, -3, 56, 89);
		panel.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(459, -3, 56, 89);
		panel.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(515, -3, 56, 89);
		panel.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(573, -3, 56, 89);
		panel.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(630, -3, 56, 89);
		panel.add(lblNewLabel_11);
		
		textField = new JTextField();
		textField.setBounds(81, 710, 151, 75);
		frame2.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\buttons\\start.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				sortArray();// pozivamo metodu koja provjerava koja je kategorija izabrana
				int num=0;
				checkTheNumber(num);//provjerava da li je rijec vec bila u upotrebi
				if (checkTheNumber(num)==1){
					//ako rijec nije bila u upotrebi,tj ako je metoda vratila broj 1..
					pickedWord = categoryArr[rndNumber]; //nasumice biramo rijec iz niza odredjene kategorije i datu rijec uvrstavamo u PickedWord varijablu
					wordLength = pickedWord.length(); //uzimamo duzinu karaktera u izabranoj rijeci (tj varijabli pickedWord)
					//char[] lettersArr = new char[wordLength];vec je deklarisano gore
					lettersArr = pickedWord.toCharArray(); //sada u niz lettersArray smijestamo izabranu rijec, tako da svaki element je jedno slovo te rijeci.
					checkingLetters();
				}
			}
		});
		btnNewButton.setBounds(67, 167, 135, 34);
		frame2.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 712, 151, 75);
		frame2.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		button = new JButton("START");
		button.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\buttons\\buyletter.png"));
		button.setBounds(67, 214, 151, 34);
		frame2.getContentPane().add(button);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(0, 0, 892, 863);
		frame2.getContentPane().add(label_2);
		label_2.setIcon(new ImageIcon("C:\\Users\\COMTRADE\\Desktop\\thegamebeginsbgr.jpg"));
		label_2.setForeground(new Color(46, 139, 87));
		label_2.setBackground(new Color(255, 153, 255));

}//end of initialize class
	
	private void sortArray() {
		if (StuffWeNeed.CAT==1){
			for (int i=0; i< 50; i++){
				categoryArr[i]=countries[i];
			}
		}
		else if (StuffWeNeed.CAT==2){
			for (int i=0; i< 50; i++){
				categoryArr[i]=cities[i];
			}
		}
		else if (StuffWeNeed.CAT==3){
			for (int i=0; i< 50; i++){
				categoryArr[i]=vegetables[i];
			}
		}
		else if (StuffWeNeed.CAT==4){
			for (int i=0; i< 50; i++){
				categoryArr[i]=movies[i];
			}
		}
		else if (StuffWeNeed.CAT==5){
			for (int i=0; i< 50; i++){
				categoryArr[i]=fruits[i];
			}
		}
		else if (StuffWeNeed.CAT==6){
			for (int i=0; i< 50; i++){
				categoryArr[i]=objects[i];
			}
		}	
	}//end of sortArray class
	
	private int checkTheNumber(int num){

		rndNumber = rand.nextInt(50) + 1; //daje random broj koji ce nam pomoci da nasumice izaberemo jednu od rijeci iz odredjene kategorije
		a += 1;             // brojac (svaki krug ce da bude +1)              
	                        //tako da bi se elementi (koristena slova) mogli ispisivati redom u pozicije 1,2,3,4...itd.    
		for (int i=0; i<usedNumbers.length; i++){
			if (usedNumbers[i]==rndNumber){
				return num; //vraca sebe ako je rijec vec bila u upotrebi, te se time rekurzivno metoda opet zove
			}			
		}
		usedNumbers[a]=rndNumber;
		return 1; //ako rijec nije bila prije, vraca 1 i nastavlja sa igrom
	}
	private void checkingLetters(){
		chosenLetter = scan.next().charAt(0);
		for (int i=0;i<lettersArr.length;i++){
			if(lettersArr[i]==chosenLetter){
				//ovdje sad upisati one promjene, da se lbls mijenjaju u pogo]eno slovo
			}
		}
	}
}

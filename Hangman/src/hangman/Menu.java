package hangman;
import javax.swing.*;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


import java.awt.Component;

import javax.swing.Box;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JSeparator;

import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.FlowLayout;

import javax.swing.border.LineBorder;

import java.util.Random;

@SuppressWarnings("serial")
public class Menu extends JPanel {
		private final ButtonGroup buttonGroup = new ButtonGroup();
		private int chances;
		private int index;
		private String guess="";
		private String temp="";
		private JButton t=new JButton();
		Random rand=new Random();
		private JLabel chancesLabel=new JLabel();
		
		JButton start = new JButton("Start");
		
	

		private JLabel label1=new JLabel();
		private JLabel label2=new JLabel();
		private JLabel label3=new JLabel();
		private JLabel label4=new JLabel();
		private JLabel label5=new JLabel();
		private JLabel label6=new JLabel();
		private JLabel label7=new JLabel();
		private JLabel label8=new JLabel();
		private JLabel label9=new JLabel();
		private JLabel label10=new JLabel();
		private JLabel label11=new JLabel();
		private JLabel label12=new JLabel();
		private JLabel label13=new JLabel();
		private JLabel label14=new JLabel();
		private JLabel label15=new JLabel();
		private JLabel label16=new JLabel();
		
		private JButton Q = new JButton("Q");
		private JButton W = new JButton("W");
		private JButton E = new JButton("E");
		private JButton R = new JButton("R");
		private JButton T = new JButton("T");
		private JButton Y = new JButton("Y");
		private JButton U = new JButton("U");
		private JButton I = new JButton("I");
		private JButton O = new JButton("O");
		private JButton P = new JButton("P");

		private JButton A = new JButton("A");
		private JButton S = new JButton("S");
		private JButton D = new JButton("D");
		private JButton F = new JButton("F");
		private JButton G = new JButton("G");
		private JButton H = new JButton("H");
		private JButton J = new JButton("J");
		private JButton K = new JButton("K");
		private JButton L = new JButton("L");

		private JButton Z = new JButton("Z");
		private JButton X = new JButton("X");
		private JButton C = new JButton("C");
		private JButton V = new JButton("V");
		private JButton B = new JButton("B");
		private JButton N = new JButton("N");
		private JButton M = new JButton("M");

		private JRadioButtonMenuItem Easy = new JRadioButtonMenuItem("Easy");
		private JRadioButtonMenuItem Normal=new JRadioButtonMenuItem("Normal");
		private JRadioButtonMenuItem Hard = new JRadioButtonMenuItem("Hard");

		JMenuItem NewGame = new JMenuItem("New Game");
		JMenu Level = new JMenu("Level");

		private JRadioButtonMenuItem th1 = new JRadioButtonMenuItem("r1");
		private JRadioButtonMenuItem th2 = new JRadioButtonMenuItem("r2");
		private JRadioButtonMenuItem th3 = new JRadioButtonMenuItem("r3");
		private JRadioButtonMenuItem th4 = new JRadioButtonMenuItem("r4");
		
		private static final String countries[]={"Andorra","Afghanistan","Anguilla","Albania","Armenia","Netherland","Angola","Antarctica","Argentina"
			,"Austria","Australia","Aruba","Azerbaijan","Barbados","Bangladesh","Belgium","Bulgaria"
			,"Bahrain","Burundi","Benin","Bermuda","Brunei","Bolivia","Brazil","Bahamas","Bhutan"
			,"Botswana","Belarus","Belize","Canada","Switzerland","Chile","Cameroon","China","Colombia"
			,"Cuba","Cyprus","Germany","Djibouti","Denmark","Dominica","Algeria","Ecuador","Estonia"
			,"Egypt","Eritrea","Spain","Ethiopia","Finland","Fiji","Micronesia","France","France"
			,"Gabon","Grenada","Georgia","Guernsey","Ghana","Gibraltar","Greenland","Gambia","Guinea"
			,"Guadeloupe","Greece","uatemala","Guam","Guyana","HongKong","Honduras","Croatia","Haiti"
			,"Hungary","Indonesia","Ireland","Israel","India","Iraq","Iran","Iceland","Italy","Jersey"
			,"Jamaica","Jordan","Japan","Kenya","Kyrgyzstan","Cambodia","Kiribati","Comoros","North Korea"
			,"South Korea","Kuwait","Kazakhstan","Laos","Lebanon","Liechtenstein","SriLanka","Liberia"
			,"Lesotho","Lithuania","Luxembourg","Latvia","Libya","Morocco","Monaco","Moldova"
			,"Montenegro","Madagascar","Macedonia","Mali","Myanmar","Mongolia","Martinique","Mauritania"
			,"Montserrat","Malta","Mauritius","Maldives","Malawi","Mexico","Malaysia","Namibia"
			,"Niger","Nigeria","Nicaragua","Netherlands","Norway","Nepal","Nauru","Niue","Oman","Panama"
			,"Peru","Philippines","Pakistan","Poland","Portugal","Palau","Paraguay","Qatar","Romania"
			,"Serbia","Russia","Rwanda","Seychelles","Sudan","Sweden","Singapore","Slovenia","Slovakia"
			,"Senegal","Somalia","Suriname","Syria","Swaziland","Chad","Togo","Thailand","Tajikistan"
			,"Tokelau","Turkmenistan","Tunisia","Tonga","Turkey","Tuvalu","Taiwan","Tanzania","Ukraine"
			,"Uganda","Uruguay","Uzbekistan","Venezuela","Vietnam","Vanuatu","Samoa","Yemen","Mayotte"
			,"Zambia","Zimbabwe"};
		
		private static final String name[]=new String[countries.length];
		
		{/*to uppercase */
			for(int i=0;i<name.length;i++)
			name[i]=countries[i].toUpperCase();
		}
		
	
		private final ButtonGroup thGroup = new ButtonGroup();
		/**
		 * Create the panel.
		 */
		
		private UIManager.LookAndFeelInfo[] looks; // look and feels
		private String[] lookNames; // names of look and feels
		
		public Menu() {
			setForeground(Color.RED);
			setToolTipText("");
			setLayout(null);
			
			

			//********************************************************************************
			//themes
			//********************************************************************************
			// get installed look-and-feel information
			looks = UIManager.getInstalledLookAndFeels();
			lookNames = new String[ looks.length ];
			
			// get names of installed look-and-feels
			for ( int i = 0; i < looks.length; i++ )
			lookNames[ i ] = looks[ i ].getName();
			
			th1.setText(lookNames[0]);
			th2.setText(lookNames[1]);
			th3.setText(lookNames[2]);
			th4.setText(lookNames[3]);
			
			ItemHandler handler1=new ItemHandler();
			th1.addItemListener(handler1);
			th2.addItemListener(handler1);
			th3.addItemListener(handler1);
			th4.addItemListener(handler1);
			
			th1.setSelected(true);
			// update components in this application
			SwingUtilities.updateComponentTreeUI( this );		
			
			
			JMenuBar menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 900, 25);
			menuBar.setToolTipText("");
			menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			add(menuBar);
			
			JMenu File = new JMenu("File");
			File.setMnemonic('F');
			menuBar.add(File);
			
			
			NewGame.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					Level.setEnabled(true);
					start.setEnabled(true);
					
					Q.setEnabled(true);
					W.setEnabled(true);
					E.setEnabled(true);
					R.setEnabled(true);
					T.setEnabled(true);
					Y.setEnabled(true);
					U.setEnabled(true);
					I.setEnabled(true);
					O.setEnabled(true);
					P.setEnabled(true);
					
					A.setEnabled(true);
					S.setEnabled(true);
					D.setEnabled(true);
					F.setEnabled(true);
					G.setEnabled(true);
					H.setEnabled(true);
					J.setEnabled(true);
					K.setEnabled(true);
					L.setEnabled(true);
					
					Z.setEnabled(true);
					X.setEnabled(true);
					C.setEnabled(true);
					V.setEnabled(true);
					B.setEnabled(true);
					N.setEnabled(true);
					M.setEnabled(true);
					
					
					for(int i=1;i<=16;i++){
						switch(i){

						case 1:
							label1.setText("");
							break;

						case 2:
							label2.setText("");
							break;

						case 3:
							label3.setText("");
							break;

						case 4:
							label4.setText("");
							break;

						case 5:
							label5.setText("");
							break;

						case 6:
							label6.setText("");
							break;

						case 7:
							label7.setText("");
							break;

						case 8:
							label8.setText("");
							break;

						case 9:
							label9.setText("");
							break;

						case 10:
							label10.setText("");
							break;

						case 11:
							label11.setText("");
							break;

						case 12:
							label12.setText("");
							break;

						case 13:
							label13.setText("");
							break;

						case 14:
							label14.setText("");
							break;

						case 15:
							label15.setText("");
							break;

						case 16:
							label16.setText("");
							break;
							
						}//end switch
						}//end for
					
					
					
					if(Easy.isSelected()){
						chances=10;
						
						chancesLabel.setText(chances+"   ");
						
						}
					
					else if(Normal.isSelected()){
						chances=7;
						
						chancesLabel.setText(chances+"   ");
						
						}
					
					else if(Hard.isSelected()){
						chances=5;
						
						chancesLabel.setText(chances+"   ");
						
						}
					
					chancesLabel.setText(chances+"   ");
				}//end action performed
			});//end btn newgame
			
			File.add(NewGame);
			
			JMenuItem Exit = new JMenuItem("Exit");
			Exit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					System.exit(0);
				}
			});
			
			
			File.add(Level);
			
			JPanel chancesPanel = new JPanel();
			chancesPanel.setBackground(new Color(255, 255, 0));
			chancesPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "CHANCES", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			chancesPanel.setBounds(735, 73, 153, 127);
			add(chancesPanel);
			chancesPanel.setLayout(null);
			
			//final JLabel chancesLabel = new JLabel("10");
			chancesLabel.setBounds(12, 23, 129, 80);
			chancesPanel.add(chancesLabel);
			chancesLabel.setForeground(new Color(0, 128, 0));
			chancesLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
			
			
			Easy.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent event) {
					
					chances=10;	//System.out.println(chances);
					
					chancesLabel.setText(chances+"   ");
					
				}
			});
			buttonGroup.add(Easy);
			Easy.setSelected(true);
			Level.add(Easy);
			
			
			Normal.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent event) {
					chances=7;	//System.out.println(chances);
					
					chancesLabel.setText(chances+"   ");
					
				}
			});
			buttonGroup.add(Normal);
			Level.add(Normal);
			
			
			Hard.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent event) {
					chances=5;	//System.out.println(chances);
				
					chancesLabel.setText(chances+"   ");
					
				}
			});
			buttonGroup.add(Hard);
			Level.add(Hard);
			
			JSeparator separator = new JSeparator();
			File.add(separator);
			File.add(Exit);
			
			Component horizontalStrut = Box.createHorizontalStrut(15);
			menuBar.add(horizontalStrut);
			
			JMenu Settings = new JMenu("Settings");
			Settings.setMnemonic('S');
			menuBar.add(Settings);
			
			JMenu mnLookAndFeel = new JMenu("Themes");
			Settings.add(mnLookAndFeel);
			thGroup.add(th1);
			
			
			mnLookAndFeel.add(th1);
			thGroup.add(th2);
			
			
			mnLookAndFeel.add(th2);
			thGroup.add(th3);
			
			
			mnLookAndFeel.add(th3);
			thGroup.add(th4);
			
			
			mnLookAndFeel.add(th4);
			
			JSeparator separator_2 = new JSeparator();
			Settings.add(separator_2);
			
			JMenu mnFont = new JMenu("Font");
			Settings.add(mnFont);
			
			Component horizontalStrut_1 = Box.createHorizontalStrut(15);
			menuBar.add(horizontalStrut_1);
			
			JMenu Help = new JMenu("Help");
			Help.setMnemonic('H');
			menuBar.add(Help);
			
			JMenuItem help_detail = new JMenuItem("Help");
			help_detail.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					JOptionPane.showMessageDialog(null,"Choose level from file->level\n"+
				"                    Easy    Normal    Hard\n"+
				"chances:     10         7             5\n" +
				"time   :         3:00      2:00        1:00","Help",JOptionPane.INFORMATION_MESSAGE);
				
				}
			});
			Help.add(help_detail);
			
			JMenuItem About = new JMenuItem("About");
			About.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					JOptionPane.showMessageDialog(null,"Programming by\n"
							+"Muhammad Saad\n"
							+"Gik Institute (Topi,Pakistan)\n"
							+"03329198694\n"
							+"muhammad.saad42@yahoo.com","About",JOptionPane.INFORMATION_MESSAGE);
				}
			});
			
			JSeparator separator_1 = new JSeparator();
			Help.add(separator_1);
			Help.add(About);
			
			JPanel zxcvb = new JPanel();
			zxcvb.setBounds(129, 546, 688, 41);
			add(zxcvb);
			
			keyHandler handler=new keyHandler();
			zxcvb.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			
			zxcvb.add(Z);
			Z.addActionListener(handler);
			
			
			zxcvb.add(X);
			X.addActionListener(handler);
			
			
			zxcvb.add(C);
			C.addActionListener(handler);
			
			
			zxcvb.add(V);
			V.addActionListener(handler);
			
			
			zxcvb.add(B);
			B.addActionListener(handler);
			
			
			zxcvb.add(N);
			N.addActionListener(handler);
			
			
			zxcvb.add(M);
			M.addActionListener(handler);
			
			JPanel asdfg = new JPanel();
			asdfg.setBounds(119, 514, 688, 35);
			add(asdfg);
			asdfg.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			
			asdfg.add(A);
			A.addActionListener(handler);
			
			
			asdfg.add(S);
			S.addActionListener(handler);
			
			
			asdfg.add(D);
			D.addActionListener(handler);
			
			
			asdfg.add(F);
			F.addActionListener(handler);
			
			
			asdfg.add(G);
			G.addActionListener(handler);
			
			
			asdfg.add(H);
			H.addActionListener(handler);
			
			
			asdfg.add(J);
			J.addActionListener(handler);
			
		
			asdfg.add(K);
			K.addActionListener(handler);
			
			
			asdfg.add(L);
			L.addActionListener(handler);
			
			JPanel qwerty = new JPanel();
			qwerty.setBounds(119, 483, 688, 35);
			add(qwerty);
			qwerty.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			
			qwerty.add(Q);
			Q.addActionListener(handler);
			
			
			qwerty.add(W);
			W.addActionListener(handler);
			
			
			qwerty.add(E);
			E.addActionListener(handler);
			
			
			qwerty.add(R);
			R.addActionListener(handler);
			
			
			qwerty.add(T);
			T.addActionListener(handler);
			
			qwerty.add(Y);
			Y.addActionListener(handler);
			
			
			qwerty.add(U);
			U.addActionListener(handler);
			
			
			qwerty.add(I);
			I.addActionListener(handler);
			
			
			qwerty.add(O);
			O.addActionListener(handler);
			
			
			qwerty.add(P);
			P.addActionListener(handler);
			
			
			
			
			JPanel wordPanel = new JPanel();
			wordPanel.setBackground(Color.WHITE);
			wordPanel.setForeground(Color.WHITE);
			wordPanel.setBorder(new LineBorder(Color.GREEN, 8, true));
			wordPanel.setBounds(0, 249, 900, 90);
			add(wordPanel);
			
			//final JLabel label1 = new JLabel("");
			label1.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label2 = new JLabel("");
			label2.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label3 = new JLabel("");
			label3.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label4 = new JLabel("");
			label4.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label5 = new JLabel("");
			label5.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label6 = new JLabel("");
			label6.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label7 = new JLabel("");
			label7.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label8 = new JLabel("");
			label8.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label9 = new JLabel("");
			label9.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label10 = new JLabel("");
			label10.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label11 = new JLabel("");
			label11.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label12 = new JLabel("");
			label12.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			//final JLabel label13 = new JLabel("");
			label13.setFont(new Font("Tahoma", Font.PLAIN, 25));
			wordPanel.setLayout(new GridLayout(0, 16, 0, 0));
			wordPanel.add(label1);
			wordPanel.add(label2);
			wordPanel.add(label3);
			wordPanel.add(label4);
			wordPanel.add(label5);
			wordPanel.add(label6);
			wordPanel.add(label7);
			wordPanel.add(label8);
			wordPanel.add(label9);
			wordPanel.add(label10);
			wordPanel.add(label11);
			wordPanel.add(label12);
			wordPanel.add(label13);
			
			//final JLabel label14 = new JLabel("");
			label14.setFont(new Font("Tahoma", Font.PLAIN, 25));
			wordPanel.add(label14);
			
			//final JLabel label15 = new JLabel("");
			label15.setFont(new Font("Tahoma", Font.PLAIN, 25));
			wordPanel.add(label15);
			
			//final JLabel label16 = new JLabel("");
			label16.setFont(new Font("Tahoma", Font.PLAIN, 25));
			wordPanel.add(label16);
			
			start.setBounds(12, 51, 97, 25);
			add(start);
			
			start.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					
					Level.setEnabled(false);
					
					index=rand.nextInt(name.length);
					System.out.println(name[index]);

					for(int i=1;i<=name[index].length();i++){
					switch(i){

					case 1:
						label1.setText("__");
						break;

					case 2:
						label2.setText("__");
						break;

					case 3:
						label3.setText("__");
						break;

					case 4:
						label4.setText("__");
						break;

					case 5:
						label5.setText("__");
						break;

					case 6:
						label6.setText("__");
						break;

					case 7:
						label7.setText("__");
						break;

					case 8:
						label8.setText("__");
						break;

					case 9:
						label9.setText("__");
						break;

					case 10:
						label10.setText("__");
						break;

					case 11:
						label11.setText("__");
						break;

					case 12:
						label12.setText("__");
						break;

					case 13:
						label13.setText("__");
						break;

					case 14:
						label14.setText("__");
						break;

					case 15:
						label15.setText("__");
						break;

					case 16:
						label16.setText("__");
						break;
						
					}//end switch
					}//end for
					
					if(Easy.isSelected()){
						chances=10;
					
						chancesLabel.setText(chances+"   ");
						
					}//end if
					
					start.setEnabled(false);
					chancesLabel.setText(chances+"   ");
					
				}//end start
			});
			
		}
		
	private void process(){
			
			
			String t;
			t=name[index];
			int j=-1;
			boolean found=false;
			for(int i=0;i<t.length();i++){
			j=t.indexOf(guess,i);

			
				if(j>=0){
					//System.out.println("you guessed "+guess+" at index "+j);
					
						if(j==0)
							label1.setText(guess);
						
						else if(j==1)
							label2.setText(guess);
						
						else if(j==2)
							label3.setText(guess);
						
						else if(j==3)
							label4.setText(guess);
						
						else if(j==4)
							label5.setText(guess);
						
						else if(j==5)
							label6.setText(guess);
						
						else if(j==6)
							label7.setText(guess);
						
						else if(j==7)
							label8.setText(guess);
						
						else if(j==8)
							label9.setText(guess);
						
						else if(j==9)
							label10.setText(guess);
						
						else if(j==10)
							label11.setText(guess);
						
						else if(j==11)
							label12.setText(guess);
						
						else if(j==12)
							label13.setText(guess);
						
						else if(j==13)
							label14.setText(guess);
						
						else if(j==14)
							label15.setText(guess);
						
						else if(j==15)
							label16.setText(guess);
						
					j=-1;
					found=true;;
					}//end if
				
			}//end for
			
			if(!found)
				{--chances;
				//System.out.println("Chances in found "+chances);
				}
			//label.setText(temp);
		}//end process
		
		
		//*****************************************************************************
		//key handler class
		//*****************************************************************************
		
		private class keyHandler implements ActionListener{
			public void actionPerformed(ActionEvent event){
				
				guess=event.getActionCommand();
				if(true){
					process();
					t=(JButton) event.getSource();
					t.setEnabled(false);
					chancesLabel.setText(chances+"   ");
					
					if(chances==0){
						NewGame.doClick();
						JOptionPane.showMessageDialog(null, "U Lost The Game\nThe Word Was:\n\t\t"+name[index]);
							
					}//end inner if
					//System.out.println(guess);
					
					else{
						temp="";
						for(int i=0;i<name[index].length();i++){
								switch(i){

								case 0:
									temp+=label1.getText();
									break;

								case 1:
									temp+=label2.getText();
									break;

								case 2:
									temp+=label3.getText();
									break;

								case 3:
									temp+=label4.getText();
									break;

								case 4:
									temp+=label5.getText();
									break;

								case 5:
									temp+=label6.getText();
									break;

								case 6:
									temp+=label7.getText();
									break;

								case 7:
									temp+=label8.getText();
									break;

								case 8:
									temp+=label9.getText();
									break;

								case 9:
									temp+=label10.getText();
									break;

								case 10:
									temp+=label11.getText();
									break;

								case 11:
									temp+=label12.getText();
									break;

								case 12:
									temp+=label13.getText();
									break;

								case 13:
									temp+=label14.getText();
									break;

								case 14:
									temp+=label15.getText();
									break;

								case 15:
									temp+=label16.getText();
									break;
									
								}//end switch
							}//end for
						System.out.println(temp);
						if(temp.equals(name[index])){
							NewGame.doClick();
							JOptionPane.showMessageDialog(null, "Congratulations \n\t\tU Won!!!");	
						}
					
					}//end else
					
					
					
				}//end outer if
			}
		}

		//*********************************************************
		//theme handler
		//*********************************************************
		
		private void changeTheLookAndFeel( int value ){
			try // change look-and-feel
			{
			
				// set look-and-feel for this application
				UIManager.setLookAndFeel( looks[ value ].getClassName() );
				// update components in this application
				SwingUtilities.updateComponentTreeUI( this );		
			
			 } // end try
			 catch ( Exception exception )
			 {
			 exception.printStackTrace();
			 } // end catch
			 } // end method changeTheLookAndFeel
		
		
		private class ItemHandler implements ItemListener
		{
		// process user's look-and-feel selection
		public void itemStateChanged( ItemEvent event ){
		 
		{
		if (event.getSource()==th1)
		{
		changeTheLookAndFeel(0); // change look-and-feel
		 } // end if
		
		else if (event.getSource()==th2)
		{
		changeTheLookAndFeel(1); // change look-and-feel
		 } // end if
		
		else if (event.getSource()==th3)
		{
		changeTheLookAndFeel(2); // change look-and-feel
		 } // end if
		
		else if (event.getSource()==th4)
		{
		changeTheLookAndFeel(3); // change look-and-feel
		 } // end if
		 } // end method itemStateChanged
		 } // end private inner class ItemHandler
		}
	}//end super class



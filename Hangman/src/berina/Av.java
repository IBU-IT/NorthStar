package berina;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Av {
	
@SuppressWarnings("serial")
public class Hang extends JFrame{
		
		private JButton keys1[]=new JButton[10];
		private JButton keys2[]=new JButton[9];
		private JButton keys3[]=new JButton[7];
		
		private  final String line1[]={"Q","W","E","R","T","Y","U","I","O","P"};
		private  final String line2[]={"A","S","D","F","G","H","J","K","L"};
		private  final String line3[]={"Z","X","C","V","B","N","M"};
		
		private  final String name[]={"PAKISTAN","INDIA","AMERICA","SAUDIARABIA","AUSTRALIA","IRAQ","IRAN",
			"CHINA","RUSSIA","AFGHANISTAN","HONGKONG","NORTHKOREA","WESTINDIES","CANADA","LIBIA","YEMEN","AUSTRIA","PHILLIPINES"};
		
		
		private JPanel panel1=new JPanel(new GridLayout(1,line1.length));
		private JPanel panel2=new JPanel(new GridLayout(1,line2.length));
		private JPanel panel3=new JPanel(new GridLayout(1,line3.length));
		
		private JPanel panel=new JPanel(new GridLayout(3,1));
		private JPanel lpanel=new JPanel(new GridLayout(1,10,0,0));
		
		private JButton start;
		private JButton reset;
		private JButton exit;
		private JPanel toppanel=new JPanel(new GridLayout(2,3));
		
		private JButton t;
		
		private JPanel spanel=new JPanel(new GridLayout(6,1));
		private JLabel chance=new JLabel("10");
		private final String level[]={"Easy","Normal","Hard"};
		
		private JRadioButton radio[]=new JRadioButton[3];
		private ButtonGroup group=new ButtonGroup();
		private int chances;
		
		
		private JLabel clabel=new JLabel("Chances");
	    
		private JLabel label[]=new JLabel[15];
	    
	    Random rand=new Random();
		private int index;
	
		private String guess="";
		private String temp="";
		
		private Toolkit tool;
	
		
		public Hang(){
			super("Hang The Man");
			
			
			tool=Toolkit.getDefaultToolkit();
			
			final javax.swing.Timer timer = new javax.swing.Timer(1000, new ActionListener() {
		          public void actionPerformed(ActionEvent e) {
		             // System.out.println("timer");
		             
		          }
		       });
			
			
			

			JLabel lb1=new JLabel("");
			toppanel.add(lb1);
			
			JLabel lb2=new JLabel("");
			toppanel.add(lb2);
			
			start=new JButton("Start");
			start.setFont(new Font("SansSerif",Font.PLAIN,20));
			toppanel.add(start);
			
			start.addActionListener(new ActionListener() {
		          public void actionPerformed(ActionEvent e) {
		             // System.out.println("start");
		              timer.start();
		          }
		       });
			
			exit=new JButton("Exit");
			exit.setFont(new Font("SansSerif",Font.PLAIN,20));
			toppanel.add(exit);
			
			add(toppanel,BorderLayout.NORTH);
			
			//score etc panel
			
			//spanel.add(box);
			Radioclass r=new Radioclass();//itemlistener
			
			for(int i=0;i<level.length;i++){
				if(i==0){
				radio[i]=new JRadioButton(level[i],true);
				radio[i].setFont(new Font("SansSerif",Font.PLAIN,16));
				group.add(radio[i]);
				spanel.add(radio[i]);
				radio[i].addItemListener(r);
				}//end if
				
				else{
					radio[i]=new JRadioButton(level[i],false);
					radio[i].setFont(new Font("SansSerif",Font.PLAIN,16));
					group.add(radio[i]);
					spanel.add(radio[i]);
					radio[i].addItemListener(r);
					}//end else
				}//end for
			
			clabel.setFont(new Font("SansSerif",Font.PLAIN,16));
			spanel.add(clabel);
			
			chance.setFont(new Font("SansSerif",Font.PLAIN,60));
			chance.setForeground(Color.RED);
			spanel.add(chance);
			
			
			add(spanel,BorderLayout.EAST);
			
			Handlerclass handler=new Handlerclass();
			
			
			for(int i=0;i<label.length;i++){
				
				label[i]=new JLabel();
				label[i].setFont(new Font("System",Font.PLAIN,24));
			lpanel.add(label[i]);
			}//end for
			
			add(lpanel,BorderLayout.CENTER);

			start.addActionListener(handler);
			reset.addActionListener(handler);
			exit.addActionListener(handler);	
			
			
			
			
			for(int i=0;i<line1.length;i++){
				keys1[i]=new JButton(line1[i]);
				keys1[i].setFont(new Font("System",Font.PLAIN,20));
				panel1.add(keys1[i]);
				keys1[i].addActionListener(handler);
			}
			
			panel.add(panel1);
			
			for(int i=0;i<line2.length;i++){
				keys2[i]=new JButton(line2[i]);
				keys2[i].setFont(new Font("System",Font.PLAIN,20));
				panel2.add(keys2[i]);
				keys2[i].addActionListener(handler);
			}
			
			panel.add(panel2);
		
			for(int i=0;i<line3.length;i++){
				keys3[i]=new JButton(line3[i]);
				keys3[i].setFont(new Font("System",Font.PLAIN,20));
				panel3.add(keys3[i]);
				keys3[i].addActionListener(handler);
			}
			
			panel.add(panel3);
			
			add(panel,BorderLayout.SOUTH);
			
		}//end constructor
		
		
		private void process(){
			
			
			String t;
			t=name[index];
			int j=-1;
			boolean found=false;
			
			for(int i=0;i<t.length();i++){
			j=t.indexOf(guess,i);
			
				if(j>=0){
					//System.out.println("you guessed "+guess+" at index "+j);
					label[j].setText(guess);
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
			
		
		private class Handlerclass implements ActionListener{
			
			public void actionPerformed(ActionEvent event){
				
				if(event.getSource()==start){		

					index=rand.nextInt(name.length);
					System.out.println(name[index]);


					for(int i=0;i<name[index].length();i++){
						label[i].setText("___ ");
					}//end for
					
					//disable radio buttons
					for(int i=0;i<level.length;i++){
						radio[i].setEnabled(false);
					}//end for
					
					if(radio[0].isSelected()){
						chances=10;
						
						chance.setText(chances+"   ");
						
					}//end if
					
					start.setEnabled(false);
					chance.setText(chances+"   ");
					
				
					}//end start
				
				else if(event.getSource()==reset){
					start.setEnabled(true);

					for(int i=0;i<name[index].length();i++){
						label[i].setText("");
					}//end for
					
					for(int i=0;i<10;i++){
						keys1[i].setEnabled(true);
					}//end for
					
					for(int i=0;i<9;i++){
						keys2[i].setEnabled(true);
					}//end for
					
					for(int i=0;i<7;i++){
						keys3[i].setEnabled(true);
					}//end for
					
					
					//enable radio buttons
					for(int i=0;i<level.length;i++){
						radio[i].setEnabled(true);
					}//end for
					
					if(radio[0].isSelected()){
						chances=10;
						
						chance.setText(chances+"   ");
						
						}
					
					else if(radio[1].isSelected()){
						chances=7;
						
						chance.setText(chances+"   ");
						
						}
					
					else if(radio[2].isSelected()){
						chances=5;
						
						chance.setText(chances+"   ");
						
						}
					
					chance.setText(chances+"   ");
				}//end reset

				else if(event.getSource()==exit){
					System.exit(0);
					//time.decsecond();
					//tlabel.setText(time.printminsec()+"     ");
					//System.out.println(time.sec());
					}//end if
				

				guess=event.getActionCommand();
				if(guess.length()==1){
					process();
					t=(JButton) event.getSource();
					t.setEnabled(false);
					chance.setText(chances+"   ");
					
					if(chances==0){
						tool.beep();
						reset.doClick();
						JOptionPane.showMessageDialog(null, "U Lost The Game\nThe Word Was:\n\t\t"+name[index]);
							
					}//end inner if
					//System.out.println(guess);
					
					else{
						temp="";
						for(int i=0;i<name[index].length();i++)
							temp+=label[i].getText();
						
						if(temp.equals(name[index])){
							tool.beep();
							reset.doClick();
							JOptionPane.showMessageDialog(null, "Congratulations \n\t\tU Won!!!");	
						}
					
					}//end else
					
					
					
				}//end outer if
				

			}//end actionPerformed
		}//end Handlerclass
		
		private class Radioclass implements ItemListener{
			
			public void itemStateChanged(ItemEvent event){
				if(event.getSource()==radio[0]){
					chances=10;	//System.out.println(chances);
					
					chance.setText(chances+"   ");
					
				}//end if
				
				if(event.getSource()==radio[1]){
					chances=7;	//System.out.println(chances);
					
					chance.setText(chances+"   ");
					
				}//end if

				if(event.getSource()==radio[2]){
					chances=5;	//System.out.println(chances);
					
					chance.setText(chances+"   ");
					
				}//end if
			}//end itemStateChanged
		}//end Radioclass
		
	}
}



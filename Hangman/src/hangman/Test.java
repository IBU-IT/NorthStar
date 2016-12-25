package berina;
import javax.swing.JFrame;

public class Test {

public static void main(String  args[]){
			
			Menu a=new Menu();
			
			
			JFrame f=new JFrame();
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.add(a);
			f.setSize(920,700);
			f.setVisible(true);
			f.setTitle("Hang the man Game");
			f.setResizable(false);
		}
	}



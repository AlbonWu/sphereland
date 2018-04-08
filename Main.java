import java.awt.*;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("hello world");
		Dimension d = f.getSize();
		Actions a = new Actions(d.width, d.height);
		
		f.add(a);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 800);
	    
	}

}
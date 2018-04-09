import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Actions extends JPanel implements ActionListener, KeyListener {

	Timer t = new Timer(5, this);
	// used to move the shape
	
	Rectangle2D r;

	double x = 0, y = 0, velx = 0, vely = 0;
	// x, y are the coordinates and velx, vely describe the increments
	int width;
	int height;

	public Actions(int width, int height) {
		t.start();
		// start the timer

		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

		width = this.width;
		height = this.height;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		r = new Rectangle2D.Double(x, y, 40, 40);
		g2.fill(r);
		// draw the rectangle

		Shapes s = new Shapes();
		s.paintComponent(g2);
		// access class Shapes which draws the houses
	}

	public void actionPerformed(ActionEvent e, Graphics g) {

		Shapes s = new Shapes();
		s.house1(g);
		s.house1(g);
		s.house2(g);
		s.house3(g);
		s.square1(g);
		s.square2(g);
		s.square3(g);

	}

	public void up() {
		vely = -2;
		velx = 0;
	}

	public void down() {
		vely = 2;
		velx = 0;
	}

	public void left() {
		velx = -2;
		vely = 0;
	}

	public void right() {
		velx = 2;
		vely = 0;
	}

	public void stop() {
		velx = 0;
		vely = 0;
	}
	// how much in each direction the coordinates should be moved

	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_W) {
			up();
		}
		if (code == KeyEvent.VK_S) {
			down();
		}
		if (code == KeyEvent.VK_A) {
			left();
		}
		if (code == KeyEvent.VK_D) {
			right();
		}
	}
	// detect the keys pressed and increment accordingly

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_W) {
			stop();
		}
		if (code == KeyEvent.VK_S) {
			stop();
		}
		if (code == KeyEvent.VK_A) {
			stop();
		}
		if (code == KeyEvent.VK_D) {
			stop();
		}
	}
	// stop movement when keys are released

	public static boolean isColliding(Rectangle2D rect1, Line2D line2) {
		if (line2 != null) {
			return line2.intersects(rect1);
		}
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (x < 0 || x > 800) {
			velx *= -1;
		}
		
		if (y < 0 || y > 800) {
			vely *= -1;
		}
		
		x += velx;
		y += vely;
		// change the coordinates

		repaint();
		// redraw the square in the incremented positions

	}
}

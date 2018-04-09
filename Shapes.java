import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Shapes extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		house1(g);
		house2(g);
		house3(g);
		square1(g);
		square2(g);
		square3(g);
	}

	public void house1(Graphics g) {
		Polygon p = new Polygon();
		for (int i = 0; i < 5; i++) {
			p.addPoint((int) (200 + 90 * Math.cos(i * 2 * Math.PI / 5)),
					(int) (100 + 90 * Math.sin(i * 2 * Math.PI / 5)));
		}
		Graphics2D g2 = (Graphics2D) g;
		Line2D line2 = new Line2D.Double(127, 46, 127, 130);

		g2.draw(line2);
		g.drawPolygon(p);
	}

	public void house2(Graphics g) {
		Polygon p = new Polygon();
		for (int i = 0; i < 5; i++) {
			p.addPoint((int) (400 + 90 * Math.cos(i * 2 * Math.PI / 5)),
					(int) (200 + 90 * Math.sin(i * 2 * Math.PI / 5)));
		}
		g.drawPolygon(p);
	}

	public void house3(Graphics g) {
		Polygon p = new Polygon();
		for (int i = 0; i < 5; i++) {
			p.addPoint((int) (600 + 90 * Math.cos(i * 2 * Math.PI / 5)),
					(int) (100 + 90 * Math.sin(i * 2 * Math.PI / 5)));
		}
		g.drawPolygon(p);
	}

	public void square1(Graphics g) {
		g.fillRect(195, 30, 40, 40);
	}

	public void square2(Graphics g) {
		g.fillRect(195, 30, 40, 40);
	}

	public void square3(Graphics g) {
		g.fillRect(195, 30, 40, 40);
	}

}

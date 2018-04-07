import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class Shapes extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Polygon p = new Polygon();
		for (int i = 0; i < 5; i++)
		      p.addPoint((int) (100 + 50 * Math.cos(i * 2 * Math.PI / 5)),
		          (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 5)));

		    g.drawPolygon(p);
	}

}

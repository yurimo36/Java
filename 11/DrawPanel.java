import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {

	public void drawLine(int x1, int y1, int x2, int y2){
		Graphics g = this.getGraphics();
		g.drawLine(x1, y1, x2, y2);
	}
 }

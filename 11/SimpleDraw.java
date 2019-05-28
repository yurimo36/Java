import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class SimpleDraw extends JFrame implements MouseListener, MouseMotionListener {

	int lastx=0, lasty=0, newx, newy;
	DrawPanel panel;

	public void mouseMoved(MouseEvent arg0){}
	public void mouseExited(MouseEvent arg0){}
	public void mouseEntered(MouseEvent arg0){}
	public void mouseReleased(MouseEvent arg0){}
	public void mouseClicked (MouseEvent arg0){}
	public void mousePressed(MouseEvent arg0){
		lastx=arg0.getX();
		lasty=arg0.getY()-25;
	}
	public void mouseDragged(MouseEvent arg0) {
		newx=arg0.getX();
		newy=arg0.getY()-25;
	  panel.drawLine(lastx,lasty,newx,newy);
		lastx=newx;
		lasty=newy;
	}

	private void init() {
		this.setTitle("Simple Draw");
		this.setSize(300, 200);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		panel=new DrawPanel();
		this.getContentPane().add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SimpleDraw frame=new SimpleDraw();
		frame.init();
	}

}

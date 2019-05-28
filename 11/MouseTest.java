import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseTest extends JFrame
implements MouseListener, MouseMotionListener{

  public void mouseClicked (MouseEvent e) {
		System.out.println("mouse clicked!");
	}

	public void mouseEntered (MouseEvent e) {
		System.out.println("mouse entered!");
	}

	public void mouseExited (MouseEvent e) {
		System.out.println("mouse exited!");
	}

	public void mousePressed (MouseEvent e) {
		System.out.println("mouse pressed!");
	}

	public void mouseReleased (MouseEvent e) {
		System.out.println("mouse released!");
	}

  public void mouseDragged(MouseEvent e) {
		System.out.println("mouse dragged!");
	}
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouse moved!");
	}

	public static void main(String[] args) {
		MouseTest test =new MouseTest();
		test.setTitle("MouseTest");
		test.addMouseListener(test);
    test.addMouseMotionListener(test);
		test.setSize(400,300);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

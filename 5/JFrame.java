import javax.swing.JFrame;

public class SimpleWindow extends JFrame {

 	void init() {
 	this.setTitle("私が作った最初の窓"); //this.じゃなくてsuper.でもok
 	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(200,100);
	this.setVisible(true);
	}

	public static void main(String args[]) {
		SimpleWindow w = new SimpleWindow();
		w.init();
	}

}

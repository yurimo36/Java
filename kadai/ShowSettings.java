import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class ShowSettings extends JFrame{
  String currentcolor="Black";
	String currentwidth="5px";
  JPanel panel;
  JLabel label1,label2;

  public void setCurrentColor(String currentcolor) {
	  label1.setText("  Color: " + currentcolor);
    panel.add(label1);
	}

	//ペンの太さを変えるためのメソッド
	public void setCurrentWidth(String currentwidth) {
		label2.setText("  Width: " + currentwidth);
    panel.add(label2);
	}

  public void init2(){ // JFrameへのメソッド
		JPanel panel = new JPanel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
		GridLayout layout = new GridLayout(2, 1);
		panel.setLayout(layout);

		this.setTitle("Current Settings");
		this.setSize(200, 100);
		this.setLocation(900,0);
		this.setVisible(true);

		panel.add(label1);
	  panel.add(label2);
	  this.getContentPane().add(panel, BorderLayout.CENTER);
  }

  public static void main(){
    ShowSettings window = new ShowSettings();
    window.init2();
  }
}

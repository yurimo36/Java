import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JTextFieldSample extends JFrame implements ActionListener{
  JButton button1, button2;
  JTextField textleft, textright;

  JTextFieldSample(String title){
    this.setTitle(title);

    button1 = new JButton("left to right");
    button2 = new JButton("clear");

    button1.addActionListener(this);
    button2.addActionListener(this);

    textleft = new JTextField(10);
    textright = new JTextField(10);
    textright.setEditable(false);

    JPanel panel = new JPanel();

    panel.setLayout(new GridLayout(2,2));
		panel.add(textleft);
		panel.add(textright);
		panel.add(button1);
		panel.add(button2);

    Container container = getContentPane();
    container.add(panel);

    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==(button1)){
      textright.setText(textleft.getText());
      textleft.setText("");
    }
    else{
      textright.setText("");
      textleft.setText("");
    }
  }

  public static void main(String[] argv){
    JTextFieldSample sample = new JTextFieldSample("JTextFieldSample");
  }
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleButton extends JFrame implements ActionListener{

  JButton button1, button2;

  public void initialize(){
    this.setTitle("私が作った最初の窓");

    JPanel panel = new JPanel();
    button1 = new JButton("button1");
    button2 = new JButton("button2");

    button1.addActionListener(this);
    button2.addActionListener(this);

    panel.add(button1);
    panel.add(button2);

    Container container = this.getContentPane();
    container.add(panel);

    this.pack();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource()==(button1)){
      System.out.println("Hello");
    }
    else{
      System.out.println("Goodbye");
    }
  }

  public static void main(String argv[]){
    SimpleButton sw = new SimpleButton();
    sw.initialize();
  }
}

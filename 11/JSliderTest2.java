import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.event.*;

public class JSliderTest2 extends JFrame implements ChangeListener{

  JSlider slider;
  JLabel label;

  public static void main(String[] args){
    JSliderTest2 frame = new JSliderTest2();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JSliderTest2(){

    slider = new JSlider();
    slider.addChangeListener(this);

    JPanel p = new JPanel();
    p.add(slider);

    label = new JLabel();
    label.setText("値：" + slider.getValue());

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(label, BorderLayout.PAGE_END);
  }

  public void stateChanged(ChangeEvent e) {
    label.setText("値：" + slider.getValue());
  }
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JColorChooserSample extends JFrame implements ActionListener{
  JButton button;

  JColorChooserSample(String title){
    setTitle(title);

    button = new JButton("choose color");
    button.addActionListener(this);

    JPanel panel = new JPanel();
    panel.add(button);

    Container container = getContentPane();
    container.add(panel);

    this.pack();
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e){
    //JColorChooserクラスのオブジェクトを生成
    JColorChooser colorchooser = new JColorChooser();

    //色を選択するダイアログを表示
    Color color = colorchooser.showDialog(this,"choose a color", Color.blue);

    //ボタンの背景色を設定
    button.setBackground(color);
  }

  public static void main(String[] argv){
    JColorChooserSample sample = new JColorChooserSample("JColorChooserSample");
  }
}

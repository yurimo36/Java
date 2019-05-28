import java.awt.*;
import javax.swing.*;

public class JRadioButtonSample extends JFrame{

	JRadioButtonSample(String title){
		setTitle(title);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

	//JRadioButtonクラスのオブジェクトの作成
		JRadioButton radio1 = new JRadioButton("for here");
		JRadioButton radio2 = new JRadioButton("to go");

		//ボタングループを生成
		ButtonGroup group = new ButtonGroup();

		//ボタングループに追加
		group.add(radio1);
		group.add(radio2);

		panel1.setLayout(new GridLayout(2,1));
		panel2.setLayout(new GridLayout(3,1));

		panel1.add(radio1);
		panel1.add(radio2);

		//JCheckBoxクラスのオブジェクトを生成
		panel2.add(new JCheckBox("Lunch set A"));
		panel2.add(new JCheckBox("Lunch set B"));
		panel2.add(new JCheckBox("Lunch set C"));

		Container container = getContentPane();
		container.add(panel1,BorderLayout.WEST);
		container.add(panel2,BorderLayout.EAST);

		this.pack();
    this.setVisible(true);
   	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] argv){
		JRadioButtonSample sample = new JRadioButtonSample("JRadioButtonSample");
	}
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BorderLayoutSample extends JFrame implements ActionListener{
	JButton[] button;

	BorderLayoutSample(String title){
		setTitle(title);

		button = new JButton[5];
		JPanel panel = new JPanel();

		//レイアウトマネージャーの指定
		panel.setLayout(new BorderLayout());

		//ボタンコンポーネントの配置
		panel.add(button[0] = new JButton("WEST"),BorderLayout.WEST);
		panel.add(button[1] = new JButton("CENTER"),BorderLayout.CENTER);
		panel.add(button[2] = new JButton("EAST"),BorderLayout.EAST);
		panel.add(button[3] = new JButton("NORTH"),BorderLayout.NORTH);
		panel.add(button[4] = new JButton("SOUTH"),BorderLayout.SOUTH);


		for(int i=0;i<5;i++){
			button[i].addActionListener(this);
			button[i].setActionCommand(button[i].getText());
		}

		Container container = getContentPane();
		container.add(panel);

		this.pack();
    	this.setVisible(true);
   		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		System.out.println(e.getActionCommand());
	}

	public static void main(String[] argv){
		BorderLayoutSample border = new BorderLayoutSample("BorderLayoutSample");
	}
}
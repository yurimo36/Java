import java.awt.*;
import javax.swing.*;

public class JListSample extends JFrame{

	JListSample(String title){
		setTitle(title);

		//リストのデータ
		String[] data = {"Iced Coffee", "Iced Tea", "Iced Cafe-latte", "Blended Coffee", "Hot Tea", "Espresso", "Cappuccino"};

		//JListクラスのオブジェクトの作成
		JList list = new JList(data);

		//JScrollPaneクラスのオブジェクトの作成
		JScrollPane scroll = new JScrollPane(list);

		//サイズの指定
		scroll.setPreferredSize(new Dimension(200,100));

		JPanel panel = new JPanel();
		Container container = getContentPane();
		container.add(scroll);

		this.pack();
    	this.setVisible(true);
   		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] argv){
		JListSample sample = new JListSample("ListSample");
	}
}
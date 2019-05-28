import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ComplicatedLayoutSample implements ActionListener{
	public static void main(String[] argv){

		JFrame frame = new JFrame("ComplicatedLayoutSample");

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setLayout(new FlowLayout());
		for(int i=1;i<=3;i++){
			panel1.add(new JButton("NORTH"+i));
		}

		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		for(int i=1;i<=3;i++){
			panel2.add(new JButton("WEST"+i));
		}

		panel3.setLayout(new GridLayout(3,2));
		for(int i=1;i<=6;i++){
			panel3.add(new JButton("CENTER"+i));
		}

		panel4.setLayout(new BorderLayout());
		panel4.add(new JButton("EAST1"), BorderLayout.NORTH);
		panel4.add(new JButton("EAST2"), BorderLayout.SOUTH);

		panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));
		for(int i=1;i<=4;i++){
			panel5.add(new JButton("SOUTH"+i));
		}

		Container container = frame.getContentPane();
		container.add(panel1,BorderLayout.NORTH);
		container.add(panel2,BorderLayout.WEST);
		container.add(panel3,BorderLayout.CENTER);
		container.add(panel4,BorderLayout.EAST);
		container.add(panel5,BorderLayout.SOUTH);

		frame.pack();
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
       System.out.println(e.getActionCommand());
        }
}
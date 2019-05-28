import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SimpleDraw extends JFrame
implements MouseListener, MouseMotionListener, ActionListener, ChangeListener, ItemListener{
	int lastx=0, lasty=0, newx, newy;
	DrawPanel panel;
	JFileChooser fileChooser;
	JFrame f;
	JLabel l;
	JSlider slider;
	String currentcolor="Black";
	String currentwidth="5px";
	JPanel p;
	JLabel label1;
	JLabel label2;
	String s1;
	String s2;

	//マウスの動きについて
	public void mouseMoved(MouseEvent arg0){}
	public void mouseExited(MouseEvent arg0){}
	public void mouseEntered(MouseEvent arg0){
		Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().getImage("s_pen.gif"), new Point(0,0), "Temp");
		setCursor(cursor);
	}
	public void mouseReleased(MouseEvent arg0){}
	public void mouseClicked (MouseEvent arg0){}
	public void mousePressed(MouseEvent arg0){
		lastx=arg0.getX();
		lasty=arg0.getY()-20;
	}
	public void mouseDragged(MouseEvent arg0) {
		newx=arg0.getX();
		newy=arg0.getY()-20;
	  panel.drawLine(lastx,lasty,newx,newy);
		lastx=newx;
		lasty=newy;
	}
	public void stateChanged(ChangeEvent e){
		l.setText("Width: " + slider.getValue() + "px");
	}
	public void itemStateChanged(ItemEvent e){}

	//メニュー追加を簡略化するためのメソッドを作成
	private void addMenuItem(JMenu targetMenu, String itemName, String actionName, ActionListener listener) {
			JMenuItem menuItem = new JMenuItem(itemName);
			menuItem.setActionCommand(actionName);
			menuItem.addActionListener(listener);
			targetMenu.add(menuItem);
	}
	//メニュー作成
	private void makeMenu(){
    //JMenuBar クラスのオブジェクトの作成
    JMenuBar menubar = new JMenuBar();

    //JMenu クラスのオブジェクトの作成
	JMenu menu1 = new JMenu("FILE");
    JMenu menu2 = new JMenu("COLOR");
    JMenu menu3 = new JMenu("WIDTH");
    JMenu menu4 = new JMenu("ERASER");
	JMenu menu5 = new JMenu("TOOL");

    //メニュー項目を作成
		this.addMenuItem(menu1,"Clear","Clear",this);
		this.addMenuItem(menu1,"Open","Open",this);
		this.addMenuItem(menu1,"Save","Save",this);
		this.addMenuItem(menu2,"Red","Red",this);
		this.addMenuItem(menu2,"Blue","Blue",this);
		this.addMenuItem(menu2,"Yellow","Yellow",this);
		this.addMenuItem(menu2,"Green","Green",this);
		this.addMenuItem(menu2,"Black","Black",this);
		this.addMenuItem(menu2,"More…","more1",this);
		this.addMenuItem(menu3,"1px","1px",this);
		this.addMenuItem(menu3,"5px","5px",this);
		this.addMenuItem(menu3,"10px","10px",this);
		this.addMenuItem(menu3,"20px","20px",this);
		this.addMenuItem(menu3,"More…","more2",this);
		this.addMenuItem(menu4,"Small","Small",this);
		this.addMenuItem(menu4,"Medium","Medium",this);
		this.addMenuItem(menu4,"Large","Large",this);
		this.addMenuItem(menu5,"Oval","Oval",this);

    //メニューバーにメニューを追加
	    menubar.add(menu1);
		menubar.add(menu2);
	    menubar.add(menu3);
		menubar.add(menu4);
		menubar.add(menu5);
		this.setJMenuBar(menubar);
  }

	//コマンドを受け取った後の動作
	public void actionPerformed(ActionEvent e){
		String command = e.getActionCommand();
		if(command != null){
			if(command=="Clear"){
				panel.clearBuffer();
				System.out.println("Clear Buffer");
			}
			if(command=="Open"){
			 	fileChooser = new JFileChooser();
			 	int returnVal = fileChooser.showOpenDialog(this);
	      		if(returnVal == JFileChooser.APPROVE_OPTION) {
	      			panel.openFile(fileChooser.getSelectedFile());
	     		}
				System.out.println("Open File");
			}
			if(command=="Save"){
			  	fileChooser = new JFileChooser();
			  	int returnVal = fileChooser.showSaveDialog(this);
	      		if(returnVal == JFileChooser.APPROVE_OPTION){
	      			panel.saveFile(fileChooser.getSelectedFile());
				}
				System.out.println("Save File");
	   	 	}
			if(command=="Red"){
				currentcolor=command;
				panel.setPenColor(Color.red);
				System.out.println("Current Color: " + currentcolor);
			}
			if(command=="Blue"){
				currentcolor=command;
				panel.setPenColor(Color.blue);
				System.out.println("Current Color: " + currentcolor);
			}
			if(command=="Yellow"){
				currentcolor=command;
				panel.setPenColor(Color.yellow);
				System.out.println("Current Color: " + currentcolor);
			}
			if(command=="Green"){
				currentcolor=command;
				panel.setPenColor(Color.green);
				System.out.println("Current Color: " + currentcolor);
			}
			if(command=="Black"){
				currentcolor=command;
				panel.setPenColor(Color.black);
				System.out.println("Current Color: " + currentcolor);
			}
			if(command=="more1"){
				//JColorChooserクラスのオブジェクトを生成
		    	JColorChooser colorchooser = new JColorChooser();

		    	//色を選択するダイアログを表示
		    	Color color = colorchooser.showDialog(this,"Palette", panel.currentColor);

		    	//ボタンの背景色を設定
		    	panel.setPenColor(color);
				currentcolor=color.toString();
				System.out.println("Current Color: " + currentcolor);
			}
			if(command=="1px"){
				currentwidth=command;
				panel.setPenWidth(1);
				System.out.println("Current Width: " + currentwidth);
			}
			if(command=="5px"){
				currentwidth=command;
				panel.setPenWidth(5);
				System.out.println("Current Width: " + currentwidth);
			}
			if(command=="10px"){
				currentwidth=command;
				panel.setPenWidth(10);
				System.out.println("Current Width: " + currentwidth);
			}
			if(command=="20px"){
				currentwidth=command;
				panel.setPenWidth(20);
				System.out.println("Current Width: " + currentwidth);
			}
			if(command=="more2"){
				f = new JFrame();
				slider = new JSlider(0, 30);
				JPanel pa = new JPanel();
				l = new JLabel();
				JButton b = new JButton("OK");

    			slider.addChangeListener(this);
				slider.setMajorTickSpacing(5);
				slider.setMinorTickSpacing(1);
				slider.setPaintTicks(true);
  				slider.setPaintLabels(true);
				b.addActionListener(this); b.setActionCommand("OK");
    			pa.add(slider);
				pa.add(b);
    			l.setText("Width: " + slider.getValue() + "px");

    			f.getContentPane().add(pa, BorderLayout.CENTER);
    			f.getContentPane().add(l, BorderLayout.PAGE_END);
				f.setTitle("Width Slider");
				f.pack();
				f.setVisible(true);
			}
			if(command==("OK")){
				currentwidth=Integer.toString(slider.getValue())+"px";
				panel.setPenWidth(slider.getValue());
				f.setVisible(false);
				System.out.println("Current Width: " + currentwidth);
			}
			if(command=="Small"){
				currentcolor="White";
				currentwidth="5px";
				panel.setPenColor(Color.white);
				panel.setPenWidth(5);
				System.out.println("Current Color: " + currentcolor);
				System.out.println("Current Width: " + currentwidth);
			}
			if(command=="Medium"){
				currentcolor="White";
				currentwidth="15px";
				panel.setPenColor(Color.white);
				panel.setPenWidth(15);
				System.out.println("Current Color: " + currentcolor);
				System.out.println("Current Width: " + currentwidth);
			}
			if(command=="Large"){
				currentcolor="White";
				currentwidth="30px";
				panel.setPenColor(Color.white);
				panel.setPenWidth(30);
				System.out.println("Current Color: " + currentcolor);
				System.out.println("Current Width: " + currentwidth);
			}
			if(command=="Oval"){
				panel.drawOval(lastx,lasty,newx,newy);
			}
		}
		//label1.setText("Current Color: " + currentcolor);
		label2.setText("Current Width: " + currentwidth);
		p.add(label1);
		p.add(label2);
		this.getContentPane().add(p);
  }

	//フレームに適応
	public void init1(){
		this.setTitle("Paint");
		this.setSize(800,600);
		this.makeMenu();
		panel = new DrawPanel();
		ShowSettings window = new ShowSettings();
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.getContentPane().add(panel).setBackground(Color.white);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init2(){ // JFrameへのメソッド
		p = new JPanel();
    	label1 = new JLabel();
    	label2 = new JLabel();
		//String s1 = "1";
		//String s2 = "2";
		GridLayout layout = new GridLayout(2, 1);
		p.setLayout(layout);

		this.setTitle("Current Settings");
		this.setSize(200, 100);
		this.setLocation(900,0);
		this.setVisible(true);

		label1.setText("Current Color: " + currentcolor);
	  	label2.setText("Current Width: " + currentwidth);

		p.add(label1);
	  	p.add(label2);
	  	this.getContentPane().add(p);
  }

	//メイン部分
	public static void main(String[] args) {
		SimpleDraw frame = new SimpleDraw();
		frame.init1();
		SimpleDraw window = new SimpleDraw();
		window.init2();
	}

}

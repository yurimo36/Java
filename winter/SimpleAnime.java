import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Thread;

class Animator implements Runnable, ActionListener {
	Graphics g;
	int xdelta =5;

	public void setGraphics(Graphics animeG) {
		g=animeG;
	}
			
	public void actionPerformed(ActionEvent e) { 
		String command = e.getActionCommand(); 
		if(command !=null) { 
			System.out.println(command); 
		} 
		if(command=="red") g.setColor(Color.red); 
		if(command=="blue") g.setColor(Color.blue); 
		if(command=="yellow") g.setColor(Color.yellow); 
		if(command=="fast") if(xdelta>0) xdelta=30; else xdelta=-30; 
		if(command=="slow") if(xdelta>0) xdelta=5; else xdelta=-5; 
	} 
	
	public void run() {
		int x=0;
		while(true) {
			g.fillOval(x,80,50,50);
			try{Thread.sleep(50);}catch(Exception e){}
			g.clearRect(x, 80, 52,52);
			x+=xdelta;
			if(x>250) xdelta=-xdelta;
			if(x<0) xdelta=-xdelta;
		}
	}
}

class SimpleAnime extends JFrame  {
	JPanel panel;
	Graphics g;
	Animator animator;
	 
	private void makeMenu() { 
		JMenuBar menubar = new JMenuBar(); 
		JMenu menu = new JMenu("color"); 
		JMenu menuSpeed = new JMenu("speed"); 
		 
		JMenuItem item1 = new JMenuItem("red"); 
		item1.addActionListener(animator); 
		item1.setActionCommand("red"); 
		JMenuItem item2 = new JMenuItem("blue"); 
		item2.addActionListener(animator); 
		item2.setActionCommand("blue"); 
		JMenuItem item3 = new JMenuItem("yellow"); 
		item3.addActionListener(animator); 
		item3.setActionCommand("yellow"); 
		menu.add(item1); 
		menu.add(item2); 
		menu.add(item3); 
		 
		JMenuItem item4 = new JMenuItem("fast"); 
		item4.addActionListener(animator); 
		item4.setActionCommand("fast"); 
		JMenuItem item5 = new JMenuItem("slow"); 
		item5.addActionListener(animator); 
		item5.setActionCommand("slow"); 
		menuSpeed.add(item4); 
		menuSpeed.add(item5); 
	 
		menubar.add(menu); 
		menubar.add(menuSpeed); 
		this.setJMenuBar(menubar);
	} 
	
	private void init() {
		animator = new Animator();
		this.setTitle("SimpleAnime");
		this.setSize(300,200);
		this.makeMenu();
		panel = new JPanel();
		this.getContentPane().add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g=panel.getGraphics();
		
		animator.setGraphics(g);
		new Thread(animator).start();
	}

	public static void main(String[] args) {
		SimpleAnime frame = new SimpleAnime();
		frame.init();
		
		for(int i=0;;i++) {
			System.out.println(i);
			try {Thread.sleep(500);}catch(Exception e){}
		}
	}
}
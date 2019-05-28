import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;

public class DrawPanel extends JPanel{
	BufferedImage bufferImage=null;
	Graphics2D bufferGraphics=null;
	Color currentColor = Color.black;
	int currentWidth = 5;

	private void createBuffer() {
	  //バッファ用のImageとGraphicsを用意する
		bufferImage = new BufferedImage(2650, 1600, BufferedImage.TYPE_INT_BGR);
		bufferGraphics=bufferImage.createGraphics(); //getGraphicsと似ているが、戻り値がGraphics2D。
		bufferGraphics.setBackground(Color.white);
		bufferGraphics.clearRect(0, 0, 2650, 1600); //バッファクリア
	}

	public void openFile(File file2open){
		BufferedImage pictureImage;
		try{
			pictureImage = ImageIO.read(file2open);
		}
		catch(Exception e){
			System.out.println("Error: reading file = " + file2open.getName());
			return;
		}
		// 画像に合わせたサイズでbufferImageとbufferGraphicsを作り直して画像を読み込む
		//ImageIO.readの戻り値をbufferImageに代入するのではだめみたいです
		this.createBuffer();
		bufferGraphics.drawImage(pictureImage, 0, 0, this);
		repaint(); // 画像を表示するためにpaintComponentを呼ぶ
	}

	public void saveFile(File file2save){
		try{
			ImageIO.write(bufferImage, "jpg", file2save);
		}
		catch(Exception e){
			System.out.println("Error: writing file = " + file2save.getName());
			return;
		}
	}

	//バッファを真っ白にする
	public void clearBuffer(){
		if(null == bufferGraphics){
			this.createBuffer();
		}
		bufferGraphics.clearRect(0, 0, 2560, 1600);
		repaint();
	}

	//ペンの色を変えるためのメソッド
	public void setPenColor(Color newColor) {
	 	currentColor = newColor;
	}

	//ペンの太さを変えるためのメソッド
	public void setPenWidth(int newWidth) {
		currentWidth = newWidth;
	}

	//線を描く
	public void drawLine(int x1, int y1, int x2, int y2){
		if(null == bufferGraphics){
			this.createBuffer(); // バッファをまだ作ってなければ作る
		}
		bufferGraphics.setColor(currentColor);
		bufferGraphics.setStroke(new BasicStroke(currentWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
		bufferGraphics.drawLine(x1, y1, x2, y2); // バッファに描画する
		repaint(); // 再描画するためpaintComponentを呼び出す
	}

	//楕円を描く
	public void drawOval(int x1, int y1, int x2, int y2){
		bufferGraphics.setColor(currentColor);
		bufferGraphics.setStroke(new BasicStroke(currentWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
		bufferGraphics.drawOval(x1, y1, x2, y2);
		repaint();
	}

	//四角を描く
	public void drawRect(int x1, int y1, int x2, int y2){
		bufferGraphics.setColor(currentColor);
		bufferGraphics.setStroke(new BasicStroke(currentWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
		bufferGraphics.drawRect(x1, y1, x2, y2);
		repaint();
	}

	public void drawString(String str,float x,float y){

	}

	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		super.paintComponent(g2d); // 他に描画するものがあるかもしれないので親を呼んでおく
		if(null != bufferImage) g2d.drawImage(bufferImage, 0, 0, this); // バッファを表示する
	}

 }

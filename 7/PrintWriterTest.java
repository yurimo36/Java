import java.io.*;

public class PrintWriterTest{
	public static void main(String[] args) {
		try {
		//writer.txtというファイルを作って文字を書き込む
			FileWriter fwriter = new FileWriter("writer.txt");
			PrintWriter pwriter = new PrintWriter(fwriter);
			pwriter.println("java 教科書" + 2001 );
			pwriter.close();			
		//writer.txtのファイルの中身をSystem.out.printlnで表示する
			FileReader freader = new FileReader("writer.txt");
			BufferedReader breader = new BufferedReader(freader);
			String tmp;
			while( (tmp=breader.readLine() ) != null) {
				System.out.println(tmp);
			}
			breader.close();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
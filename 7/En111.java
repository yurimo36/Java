import java.io.*;

public class En111 {
	public static void main (String[] args) {
		int i;
		try {
			FileOutputStream fout = new FileOutputStream ("dout.dat");
			DataOutputStream dout = new DataOutputStream(fout);
			for(i=1;i<101;i++) dout.writeInt(i);
			dout.close();
			
			FileInputStream fin = new FileInputStream ("dout.dat");
			DataInputStream din = new DataInputStream(fin);
			
			for(i=1;i<101;i++) System.out.println(din.readInt());
			din.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
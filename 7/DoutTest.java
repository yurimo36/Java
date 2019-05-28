import java.io.*;

public class DoutTest {
	public static void main (String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("dout.dat");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(100);
			dout.close();
			}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
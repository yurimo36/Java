import java.io.*;
import java.net.*;

public class URLJpeg{
	public static void main (String argv[]){
		try{
			URL targetURL = new URL("http://siio.jp/cat.jpg");
      InputStream istream = targetURL.openStream();

      FileOutputStream fout = new FileOutputStream("cat.jpg");

			int aData;
			while((aData  = istream.read()) != -1) //条件の中に書いてあることは実行してくれる
      fout.write(aData);

			istream.close();
			fout.close();
    }
    catch(IOException e){
      System.out.println("Error in opening the URL.");
    }
  }
}

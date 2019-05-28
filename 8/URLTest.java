import java.io.*;
import java.net.*;

public class URLTest{
	public static void main (String argv[]){
		try{
			URL targetURL = new URL("http://www.ocha.ac.jp/");
			InputStream istream = targetURL.openStream();
			InputStreamReader isreader = new InputStreamReader(istream);
			BufferedReader breader = new BufferedReader(isreader);

			String line;
			while((line=breader.readLine()) != null) System.out.println(line);
      }
      catch(IOException e){
			System.out.println("Error in opening the URL.");
		}
	}
}

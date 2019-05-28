import java.io.*;

public class En112 {
public static void main(String[] args) {
	try{
		InputStreamReader ireader = new InputStreamReader(System.in);
		BufferedReader breader = new BufferedReader(ireader);
		String line = breader.readLine();
		System.out.println(line);
		breader.close();
		
		FileWriter fwriter = new FileWriter("writer.txt");
		PrintWriter pwriter = new PrintWriter(fwriter);
		pwriter.println(line);
		pwriter.close();
		
		FileReader freader = new FileReader("writer.txt");
		BufferedReader breader2 = new BufferedReader(freader);
		System.out.println(breader2.readLine());
		breader2.close();
		
	}catch(IOException e){
		System.out.println(e);	
	}		
}
}
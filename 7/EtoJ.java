import java.util.*;

public class EtoJ{

	public static void main(String args[]) {
		HashMap<String,String> map = new HashMap<String,String>();
	
		map.put("apple","りんご");
		map.put("banana","バナナ");
		map.put("orange","みかん");
		map.put("pineapple","パイナップル");
		map.put("grape","ぶどう");
		map.put("peach","もも");
		map.put("melon","メロン");
		map.put("lemon","レモン");
		
		try {
		System.out.println(map.get(args[0]));
		}
		catch(Exception e) {
		System.out.println("Please input an English word");
		}

	}
}	
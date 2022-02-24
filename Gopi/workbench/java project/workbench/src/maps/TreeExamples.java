package maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeExamples {

	public static void main(String[] args) {
		
		
		Map<String,String> mp = new TreeMap<>();
		
		mp.put("B", "BANANA");
		mp.put("C", "CAT");
		mp.put("D", "DOG");
		
		mp.put("D", "DOG");
		mp.put("A", "APPLE");
		mp.put("E", "EGG");
		
	    System.out.println(mp);
	}

}

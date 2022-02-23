package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExamples {

	public static void main(String[] args) {
		
		
	     Map<String,String> surnames = new LinkedHashMap<>();
	      
	     surnames.put("anil", "ulli");
	     surnames.put("srinu", "thirumalasetti");
	     surnames.put("gopi", "kambala");
	     surnames.put("naresh", "kambala");
	     surnames.put("venki", "asula");
	     surnames.put("anil", "ulli");
	     System.out.println(surnames);
	     System.out.println(surnames.values());
	     System.out.println(surnames.keySet());
	     System.out.println(surnames.containsKey("gopi"));
	     System.out.println(surnames.containsValue("ulli"));
	     Set<Entry<String,String>> s = surnames.entrySet();
	     Iterator itr = s.iterator();
	     while(itr.hasNext()) {
	     Entry entry = (Entry) itr.next();
	     
         System.out.println(entry.getKey());
        
         System.out.println(entry.getValue());

	     }
	    
	     
	   

	}

}

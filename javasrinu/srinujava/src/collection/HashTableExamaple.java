package collection;

import java.util.HashMap;
///////import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExamaple {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String> frds  = new Hashtable<>();
		frds.put(01,"pavan");
		frds.put(02, "gopi");
		frds.put(03, "anil");
		frds.put(04, "venki");
		frds.put(01, "pavan");
	
		System.out.println(frds);
		Map<Customers,Integer> Details = new HashMap<>();
		 Details.put(new Customers(01,"naresh"),01);
		 Details.put( new Customers(02,"anil"),02);
		 Details.put( new Customers(03,"venki"),03);
		 Details.put( new Customers(04,"gopi"),04);
		 Details.put(new Customers(05,"nari"),05);
		
		System.out.println(Details);
		Set<Entry<Customers, Integer>> ss = Details.entrySet();
		Iterator itr = ss.iterator();
		while(itr.hasNext()) {
			Entry entry = (Entry) itr.next();
	       //System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
		 
	    
	}
	

}

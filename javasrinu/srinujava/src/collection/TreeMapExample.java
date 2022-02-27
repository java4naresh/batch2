package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
	
		Map<Integer,String> names = new TreeMap<>();
		
		names.put(01, "srinu");
		names.put(02, "anil");
		names.put(03, "venki");
		names.put(04, "gopi");
		names.put(05, "naresh");
		System.out.println(names);
		
		Map<Client,Integer> clientDetails = new TreeMap<>();
		Client  client1 = new Client(01,"srinu",25);
		Client  client2 = new Client(02,"gopi",25);
		Client  client3 = new Client(03,"venki",29);
		Client  client4 = new Client(04,"anil",29);
		Client  client5 = new Client(05,"naresh",29);
		clientDetails.put(client1, 1);
		clientDetails.put(client2, 2);
		clientDetails.put(client3, 3);
		clientDetails.put(client4, 4);
		clientDetails.put(client5, 5);
		System.out.println(clientDetails);
		Set<Entry<Client,Integer>> cs = clientDetails.entrySet();
		Iterator itr = cs.iterator();
		while (itr.hasNext()){
			Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		

	}

}

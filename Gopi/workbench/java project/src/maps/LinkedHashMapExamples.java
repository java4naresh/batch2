package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExamples {

	public static void main(String[] args) {
		
	/*	Map<String,String> mp = new LinkedHashMap<>();
		mp.put("k", "GOPI");
		mp.put("T", "SRINU");
		mp.put("U", "Anile");
		mp.put("null", "Naresh");
		System.out.println(mp);
       System.out.println( mp.hashCode());
       System.out.println(mp.get("U"));
       System.out.println(mp.isEmpty());
       System.out.println( mp.keySet());
       System.out.println(mp.values());
       System.out.println(mp.size());    */
		
		Map<ClientExamples,Character> clients = new LinkedHashMap<>();
		ClientExamples ce1 = new ClientExamples(1,"Gopi",25);
		ClientExamples ce2 = new ClientExamples(2,"Srinu",28);
		ClientExamples ce3 = new ClientExamples(3,"Gopi",30);
		ClientExamples ce4 = new ClientExamples(4,"Anile",35);
		ClientExamples ce5 = new ClientExamples(5,"Naresh",39);
		clients.put(ce3, 'B');
		clients.put(ce5, 'E');
		clients.put(ce2, 'A');
		clients.put(null, 'D');
		clients.put(ce1, 'C');
		System.out.println(clients);
		System.out.println(clients.keySet());
		System.out.println(clients.values());
		System.out.println(clients.containsKey(ce5));
		
	}

}

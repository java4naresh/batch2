package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapExamples {

	public static void main(String[] args) {
		
		
		/*Map<Integer,Integer> mp = new HashMap<>();
		mp.put(4, 40);
		mp.put(2, 20);
		mp.put(3, 30);
		
		mp.put(5, 40);
		mp.put(4, 40);
		mp.put(6, 40);
		mp.put(null, 30);
		mp.put(1, 10);
		System.out.println(mp);   */
		
		
		Map<ClientExamples,Integer> mp = new HashMap<>();
		ClientExamples ce1 = new ClientExamples(1,"Gopinadh",25);
		ClientExamples ce2 = new ClientExamples(2,"Srinu",28);
		ClientExamples ce3 = new ClientExamples(3,"Gopi",30);
		ClientExamples ce4 = new ClientExamples(4,"Anile",35);
		ClientExamples ce5 = new ClientExamples(5,"Naresh",39);
		mp.put(ce5, 5);
		mp.put(ce3, 3);
		mp.put(ce1, 1);
		mp.put(ce4, 4);
		mp.put(ce2, 2);
		mp.put(null, 5);
		System.out.println(mp);
		
		}
		
		}

	


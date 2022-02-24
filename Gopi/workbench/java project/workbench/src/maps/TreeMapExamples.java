package maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeMapExamples {

	public static void main(String[] args) {
		

		
		Map<ClientExamples,Integer > client = new TreeMap<>();
		ClientExamples ce1 = new ClientExamples(1,"Gopinadh",25);
		ClientExamples ce2 = new ClientExamples(2,"Srinu",27);
		ClientExamples ce3 = new ClientExamples(3,"Naresh",29);
		ClientExamples ce4 = new ClientExamples(4,"Anile",30);
		ClientExamples ce5 = new ClientExamples(5,"Venky",35);
		client.put(ce5,5);
		client.put(ce2,2);
		client.put(ce3,3);
		//client.put(null,4);
		client.put(ce1,1);
		System.out.println(client);
	//	System.out.println(client.containsKey(ce6));
		System.out.println(client.containsKey(ce4));
		System.out.println(client.containsValue(5));
		System.out.println(client.containsValue(2));
		


		
		
}
}
package collection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List <String>list = new LinkedList();
		Batch2 b2 = new Batch2("venki","nari","anil");
	
		list.add("srinu");
		list.add("gopi");
		list.add("java");
		list.add("srinu");
		
	
	
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
	}

}

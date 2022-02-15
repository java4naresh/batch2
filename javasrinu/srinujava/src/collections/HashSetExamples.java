package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExamples {
	
	public static void main(String[] args) {
		
		Set<String> hashset = new HashSet<>();
		System.out.println(hashset.add("srinu"));
		System.out.println(hashset.add("srinu"));
		System.out.println(hashset);
		hashset.add("gopi");
		hashset.add("anil");
		hashset.add("venki");
		System.out.println(hashset);
		Iterator <String> itr = hashset.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		Set<Batch2> batch2 = new HashSet<>();
		Batch2 b1 = new Batch2("sai","pavan","nari");
		Batch2 b2 = new Batch2("sai","pavan","nari");
		batch2.add(b1);
		batch2.add(b2);
		System.out.println(batch2);

}
}

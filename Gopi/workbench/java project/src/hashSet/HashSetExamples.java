package hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) {
		
		
		Set<Integer> number = new HashSet<>();
		number.add(50);
		number.add(40);
		number.add(30);
		number.add(20);
		number.add(10);
		number.add(0);
		number.add(10);
		number.add(null);
		//number.clear();
	//	System.out.println(number.iterator());
		
		System.out.println(number);
		
		Set<Character> ch = new HashSet<>();
		ch.add('g');
		ch.add('f');
		ch.add('a');
		ch.add('c');
		System.out.println(ch);

	}

}

package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

	public static void main(String[] args) {
		
		
		List<String> names = new ArrayList<>();
		names.add("Yellow");
		names.add("Red");
		names.add("Black");
		names.add("Green");
		names.add("White");
		names.add("Red");
		//names.add(null);
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		Collections.emptyListIterator();
		//Collections.enumeration(names);
		System.out.println(names);
	
	}
}

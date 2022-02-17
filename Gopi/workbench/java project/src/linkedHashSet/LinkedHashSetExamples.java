package linkedHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExamples {

	public static void main(String[] args) {
		
		
	//	Set<String> names = new LinkedHashSet<>();
	/*	Set<String> names = new HashSet<>();
		names.add("Gopi");
		names.add("Mahi");
		names.add("Kittu");
		names.add("Gopal");
		names.add("Gopi");
		names.add("Mahi");
		System.out.println(names);*/
		
		List<String> names = new ArrayList<>();
		
		names.add("Gopi");
		names.add("Mahi");
		names.add("Kittu");
		names.add("Gopal");
		names.add("Gopi");
		names.add("Mahi");
		Set<String> names1 = new HashSet<>(names);
		System.out.println(names1);

	}

}

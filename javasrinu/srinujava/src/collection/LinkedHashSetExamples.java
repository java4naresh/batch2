package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetExamples {

	public static void main(String[] args) {
		
		//Set<String>names = new LinkedHashSet<>();
       
		 List<String> names = new ArrayList<>();
		names.add("srinu");
		names.add("gopi");
		names.add("anil");
		names.add("venki");
		names.add("nari");
		names.add("srinu");
		System.out.println(names);
		Set<String>uniqueNames = new HashSet<>(names);
		System.out.println(uniqueNames);
		Set<String>uniqueNames1 = new LinkedHashSet<>(names);
		
		 System.out.println(uniqueNames1);
		
		 Set<User> user = new LinkedHashSet<>();
		 User ur1 = new User(01,"srinu");
		 User ur2 = new User(02,"srinu");
		 User ur3 = new User(01,"srinu");
		 
		 user.add(ur1);
		 user.add(ur2);
		// user.add(ur3);
		 System.out.println(user);
   
	}

}

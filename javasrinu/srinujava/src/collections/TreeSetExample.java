package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//Set<String> names = new TreeSet<>();
		Set<String> names = new HashSet<>();
		
		//Set<String> names  = new LinkedHashSet<>();
		
		
		names.add("srinu");
		names.add("anil");
		names.add("venki");
		names.add("gopi");
		names.add("naresh");
		names.add(null);
		System.out.println(names);
		
		Set<Integer> numbers = new TreeSet<>();
		
		numbers.add(60);
		numbers.add(50);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10);
		numbers.add(30);
		System.out.println(numbers);
		
		Set<Customers> customers = new TreeSet<>();
		 
		Customers cst1 = new Customers(01,"srinu");
		Customers cst2 = new Customers(02,"pavan");
		Customers cst3 = new Customers(03,"gopi");
		Customers cst4 = new Customers(04,"anil");
		
		
		customers.add(cst1);
		customers.add(cst2);
		customers.add(cst3);
		customers.add(cst4);
		System.out.println(customers);
	}
}

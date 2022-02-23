package collections;

import java.util.HashMap;
import java.util.Map;

             
public class HashMapExamples {

	public static void main(String[] args) {
		
		Map<String,Integer> details =  new HashMap<>();
		details.put("srinu", 20);
		details.put("gopi", 25);
		details.put("anil", 29);
		details.put("sai", 22);
		details.put("srinu", 25);
		System.out.println(details);
		details.putIfAbsent("venki", 28);
		System.out.println(details);
		Map<Employee,Integer> ids =  new HashMap<>();
		Employee emp1 = new Employee(01,"srinu",25);
		Employee emp2 = new Employee(02,"gopi",25);
		Employee emp3 = new Employee(03,"naresh",25);
		Employee emp4 = new Employee(04,"venki",25);
		Employee emp5 = new Employee(02,"gopi",25);
		ids.put(emp1, 01);
		ids.put(emp2, 02);
		ids.put(emp3, 03);
		ids.put(emp4, 04);
		ids.put(emp5, 05);
		
		System.out.println(ids);
		
		
		
		
		
		
		
		
	}
}

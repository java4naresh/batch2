package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample2 {
	
	public static void main(String[] args) {
		
	
	
	
	List list = new ArrayList<>();
	
	Student s1 = new Student(01,"srinu",25,2000);
	Student s2 = new Student(02,"gopi",25,2000);
	Student s3 = new Student(03,"anil",29,2000);
	Student s4 = new Student(04,"venki",28,2000);
	Student s5 = new Student(05,"veerababau",26,2000);
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	list.add(new Student(06,"srinivas",25,2000));
	System.out.println(list);
	boolean flag = false;
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		Student s =(Student) itr.next();
		if (s.getStId() == 3) {
			list.remove(s);
			break;
		 //flag = true;
		
		}
		
	}
	
	
	/*if (flag)System.out.println("student 3 is  present");
	else System.out.println("student 3 is not present");*/
	System.out.println(list);
	
	ListIterator litr = list.listIterator();
	
	while(litr.hasNext()) {
		Student s =(Student) litr.next();
		System.out.println(s);
	}
	
	while ( litr.hasPrevious()) {
		Student s = (Student) litr.previous();
		System.out.println(s);

	}
	
}


}

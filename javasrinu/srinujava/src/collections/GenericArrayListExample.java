package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GenericArrayListExample {

	
	public static void main(String[] args) {
		
		
		List list = new ArrayList<>();
		
		Employee emp = new Employee(1,"srinu",25);
		
		Student s = new Student (1,"gopi",25,2000);
		Student s1 = new Student (2,"srinu",25,2000);
		
		//list.add(emp);
		list.add(s);
		list.add(s1);
		System.out.println(list);
		list.remove(new Student (2,"srinu",25,2000));
		System.out.println(list);
		/*List<Student>Iterator litr = list.listIterator();
		while (litr.hasNext()){
		Object obj = litr.next();
		if (obj instanceof Employee ) {
			Employee em = (Employee) obj;
			System.out.println(em);
			if(em.geteID()  == 1  ) {
				System.out.println("employee id 1 is pesent");
			}
			
		}else if (obj instanceof Student){
			Student st = (Student) obj;
			System.out.println(st);
			if(st.getStId()  == 2 ) {
			System.out.println("Student id 1 is pesent");
		}

		

		}
		}*/
		
		
		/*ListIterator<Student> litr = list.listIterator();
		while (litr.hasNext()) {
		Student st = litr.next();
	     System.out.println(st);
		
		if (st.getStId() == 1) {
			System.out.println("Student id 2 is pesent");
		}//else System.out.println("Student id 2 is not pesent");
		}	*/
		

}
}
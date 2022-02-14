package collections;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("srinu");
		list.add('M');
		list.add("kistapuram");
		list.add(10);
		list.add(5.5f);
        System.out.println(list);
		System.out.println(list.indexOf("kistapuram"));
		//System.out.println(list.remove(2));//index remove
		list.remove("kistapuram");//index value remove
		System.out.println(list);
		List list2 = new ArrayList();
		list2.add("anil");
		list2.add("gopi");
		System.out.println(list2);
		System.out.println(list.contains(list2));
		list2.add(1, "srinu thirumalasetti");
		System.out.println(list2);
		System.out.println(list.get(2));
		
		
		System.out.println(list.equals(list2));
		list2.addAll(list);
		System.out.println(list2);
	//	list2.removeAll(list);//only adding removeing
		//System.out.println(list2);
		list.clear();
		System.out.println(list);
		list.isEmpty();
		System.out.println(list.isEmpty());
		List list3 = new ArrayList<>();
		list3.add("anil");
		list3.add("gopi");
		list3.add(1, "srinu thirumalasetti");
		//list3.add('F');
		System.out.println(list3);
		list3.containsAll(list2);
		System.out.println( list2.containsAll(list3));
		list2.lastIndexOf(5.5f);
		System.out.println	(list2.lastIndexOf(5.5f));//index num
		list3.size();
		System.out.println(list3.size());
		List list4 = list2.subList(2, 5);
		System.out.println(list4);
		Iterator itr = list2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	
		
		
		
	}

}

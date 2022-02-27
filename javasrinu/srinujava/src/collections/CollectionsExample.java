package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsExample {
	
	public static void main(String[] args) {
		
	
	
	//List<String> names = new ArrayList<>();
	Set<String> names = new HashSet<>();
	names.add("anil");
	names.add("srinu");
	names.add("venki");
	names.add("gopi");
	names.add("srinivas");
	System.out.println(names);
	List<String> nameslist = new ArrayList<>(names);
	Collections.sort(nameslist);
	System.out.println(nameslist);
	List<Client> details = new ArrayList<>();
	Client client1 = new Client(01,"srinu",25);
	Client client2 = new Client(02,"gopi",24);
	Client client3 = new Client(03,"naresh",26);
	Client client4 = new Client(04,"venki",28);
	Client client5 = new Client(05,"anil",29);
    details.add(client1);
	details.add(client2);
	details.add(client3);
	details.add(client4);
	details.add(client5);
	System.out.println(details);
	List<AddharDetailsForClients> details1 = new ArrayList<>();
	AddharDetailsForClients adc1 = new AddharDetailsForClients(01,"srinu",1234);
	AddharDetailsForClients adc2 = new AddharDetailsForClients(02,"gopi",3214);
	AddharDetailsForClients adc3 = new AddharDetailsForClients(03,"anil",5421);
	AddharDetailsForClients adc4 = new AddharDetailsForClients(04,"venki",3250);
	AddharDetailsForClients adc5 = new AddharDetailsForClients(05,"mahi",1123);
	details1.add(adc1);
	details1.add(adc2);
	details1.add(adc3);
	details1.add(adc4);
	details1.add(adc5);
	System.out.println(details1);
	Collections.sort(details1, new AddharDetailsForClientsSNoSorting());
	System.out.println(details1);
	Collections.sort(details1, new AddharDetailsForClientsaNumSorting());
	System.out.println(details1);
	Collections.sort(details1, new AddharDetailsForClientssNamesorting());
	System.out.println(details1);
	
}
}

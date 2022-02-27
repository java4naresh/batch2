package collections;

import java.util.Comparator;

public class AddharDetailsForClientssNamesorting implements Comparator<AddharDetailsForClients> {

	@Override
	public int compare(AddharDetailsForClients o1, AddharDetailsForClients o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
	

}

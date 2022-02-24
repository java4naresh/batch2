package collections;

import java.util.Comparator;

public class AddharDetailsForClientsSNoSorting implements Comparator<AddharDetailsForClients> {

	@Override
	public int compare(AddharDetailsForClients o1, AddharDetailsForClients o2) {
		
		return o1.getsNum().compareTo(o2.getsNum());
	}

}

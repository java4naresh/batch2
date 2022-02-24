package collections;

import java.util.Comparator;

public class AddharDetailsForClientsaNumSorting implements Comparator<AddharDetailsForClients> {

	@Override
	public int compare(AddharDetailsForClients o1, AddharDetailsForClients o2) {
		
		return o1.getaNum().compareTo(o2.getaNum());

}
}
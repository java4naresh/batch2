package inheritence2;

import java.util.Arrays;

import inheritence.Child1;
import inheritence.Child2;

public class ChildCleint {
	
	public static void main(String[] args) {
		String[] parentNames = {"B", "S"};
		int[] parentAges = {70, 70};
		float[] parentHeights = {5.8f, 5.5f};
		Child1 ch1 = new Child1("Rama", 50, 6.0f, 'M', parentNames, parentAges, parentHeights);
		Child2 ch2 = new Child2("P", 50, 5.5f, 'F', parentNames, parentAges, parentHeights);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(Arrays.toString(ch1.getParentsDesignation()));
		System.out.println(Arrays.toString(ch2.getParentsDesignation()));
		System.out.println(ch1.getChild1Designation());
		System.out.println(ch2.getChild2Designation());
	}

}

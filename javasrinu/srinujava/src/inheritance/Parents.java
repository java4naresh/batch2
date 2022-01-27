package inheritance;

import java.util.Arrays;

public class Parents {
 public String [] parentsNames;
 public int [] parentsAges;
 public float [] parentsHeight;
 
 public Parents(String [] parentsNames,int [] parentsAges,float [] parentsHeight) {
	 
	 this. parentsNames =  parentsNames;
	 this. parentsAges = parentsAges;
	 this. parentsHeight = parentsHeight;
 }

@Override
public String toString() {
	return "Parents [parentsNames=" + Arrays.toString(parentsNames) + ", parentsAges=" + Arrays.toString(parentsAges)
			+ ", parentsHeight=" + Arrays.toString(parentsHeight) + "]";
}

public String [] parentsDesignation() {
	return new String[]  {"farmer","housewife"};
}
 
}

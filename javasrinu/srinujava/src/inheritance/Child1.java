package inheritance;

import java.util.Arrays;

public class Child1 extends Parents {
  public String c1Name;
  public int c1Age;
  public float c1Height;
  
  public Child1 (String c1Name,int c1Age,float c1Height,String [] parentsNames,int [] parentsAges,float [] parentsHeight ) {
	  super( parentsNames,parentsAges,parentsHeight);
	    this. c1Name =  c1Name;
	    this. c1Age = c1Age;
	    this. c1Height = c1Height;
  }

@Override
public String toString() {
	return "Child1 [c1Name=" + c1Name + ", c1Age=" + c1Age + ", c1Height=" + c1Height + ", parentsNames="
			+ Arrays.toString(parentsNames) + ", parentsAges=" + Arrays.toString(parentsAges) + ", parentsHeight="
			+ Arrays.toString(parentsHeight) + "]";
}
public String child1Designation() {
	return "saftware";
}
  
}

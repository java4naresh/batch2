package inheritance;

import java.util.Arrays;

public class Child2  extends Parents {
	 public String c2Name;
	  public int c2Age;
	  public float c2Height;
	  
	  public Child2 (String c2Name,int c2Age,float c2Height,String [] parentsNames,int [] parentsAges,float [] parentsHeight) {
		  super(parentsNames,parentsAges,parentsHeight);
		  this.c2Name = c2Name;
		  this. c2Age =  c2Age;
		  this.c2Height = c2Height;
		  
	  }

	@Override
	public String toString() {
		return "Child2 [c2Name=" + c2Name + ", c2Age=" + c2Age + ", c2Height=" + c2Height + ", parentsNames="
				+ Arrays.toString(parentsNames) + ", parentsAges=" + Arrays.toString(parentsAges) + ", parentsHeight="
				+ Arrays.toString(parentsHeight) + "]";
	}
	  public String child2Designation() {
		  return "saftware";
	  }
}

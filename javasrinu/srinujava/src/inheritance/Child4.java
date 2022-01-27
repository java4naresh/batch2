   package inheritance;

import java.util.Arrays;

public class Child4  extends Child1 {
	 public String c4Name;
	  public int c4Age;
	  public float c4Height;
	  
	  public Child4 (String c4Name,int c4Age,float c4Height,String c1Name,int c1Age,float c1Height,String [] parentsNames,int [] parentsAges,float [] parentsHeight) {
		  super( c1Name,c1Age,c1Height,parentsNames,parentsAges,parentsHeight);
		  this. c4Name =  c4Name;
		  this. c4Age = c4Age;
		  this. c4Height = c4Height;
	  }
	  
	  
	  @Override
	public String toString() {
		return "Child4 [c4Name=" + c4Name + ", c4Age=" + c4Age + ", c4Height=" + c4Height + ", c1Name=" + c1Name
				+ ", c1Age=" + c1Age + ", c1Height=" + c1Height + ", parentsNames=" + Arrays.toString(parentsNames)
				+ ", parentsAges=" + Arrays.toString(parentsAges) + ", parentsHeight=" + Arrays.toString(parentsHeight)
				+ "]";
	}


	public String child4Designation(){
		  return "playboy1";
	  }
}

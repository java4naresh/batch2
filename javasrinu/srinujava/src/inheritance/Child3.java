package inheritance;

import java.util.Arrays;

public class Child3 extends Child1  {
	  public String c3Name;
	  public int c3Age;
	  public float c3Height;

	  
	  public  Child3(String c3Name,int c3Age, float c3Height,String c1Name,int c1Age,float c1Height,String [] parentsNames,int [] parentsAges,float [] parentsHeight) {
		  super( c1Name,c1Age,c1Height,parentsNames,parentsAges,parentsHeight);
		  this.c3Name = c3Name;
		  this.c3Age = c3Age;
		  this.c3Height = c3Height;
	  }
	  
	  
	  @Override
	public String toString() {
		return "Child3 [c3Name=" + c3Name + ", c3Age=" + c3Age + ", c3Height=" + c3Height + ", c1Name=" + c1Name
				+ ", c1Age=" + c1Age + ", c1Height=" + c1Height + ", parentsNames=" + Arrays.toString(parentsNames)
				+ ", parentsAges=" + Arrays.toString(parentsAges) + ", parentsHeight=" + Arrays.toString(parentsHeight)
				+ "]";
	}


	public String child3Designation() {
	  return "playboy";
}  
}




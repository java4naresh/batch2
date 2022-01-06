package inheritance;

import java.util.Arrays;

public class Child5  extends Child2 {
	 public String c5Name;
	  public int c5Age;
	  public float c5Height;
	  
	  public Child5(String c5Name,int c5Age,float c5Height,String c2Name, int c2Age, float c2Height, String [] parentsNames,int [] parentsAges,float [] parentsHeight) {
		  super(c2Name,c2Age,c2Height,parentsNames,parentsAges,parentsHeight);
	  }
	  

	  @Override
	public String toString() {
		return "Child5 [c5Name=" + c5Name + ", c5Age=" + c5Age + ", c5Height=" + c5Height + ", c2Name=" + c2Name
				+ ", c2Age=" + c2Age + ", c2Height=" + c2Height + ", parentsNames=" + Arrays.toString(parentsNames)
				+ ", parentsAges=" + Arrays.toString(parentsAges) + ", parentsHeight=" + Arrays.toString(parentsHeight)
				+ "]";
	}


	public String child5Designation() {
		  return "playboy2";
	  }
}

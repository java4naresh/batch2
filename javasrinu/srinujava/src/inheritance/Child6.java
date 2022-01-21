package inheritance;

import java.util.Arrays;

public class Child6  extends Child2 {
	 public String c6Name;
	  public int c6Age;
	  public float c6Height;
	  
public Child6 (String c6Name,int c6Age, float c6Height,String c2Name,int c2Age,float c2Height,String [] parentsNames,int [] parentsAges,float [] parentsHeight){
	super(c2Name,c2Age,c2Height,parentsNames,parentsAges,parentsHeight);
	this.c6Name = c6Name;
	this.c6Age = c6Age;
	this.c6Height = c6Height;
}


@Override
public String toString() {
	return "Child6 [c6Name=" + c6Name + ", c6Age=" + c6Age + ", c6Height=" + c6Height + ", c2Name=" + c2Name
			+ ", c2Age=" + c2Age + ", c2Height=" + c2Height + ", parentsNames=" + Arrays.toString(parentsNames)
			+ ", parentsAges=" + Arrays.toString(parentsAges) + ", parentsHeight=" + Arrays.toString(parentsHeight)
			+ "]";
}


public  String child6Designation() {
	return "palyboy3";
}

}
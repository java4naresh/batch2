package inheritance1;

import java.util.Arrays;



import inheritance.Child1;
import inheritance.Child2;
import inheritance.Child3;
import inheritance.Child4;
import inheritance.Child5;
import inheritance.Child6;

public class ChildClient {
public static void main(String[] args) {
	String [] parentsName = {"ganesh","anu"};
	int [] parentsAge = {50,45};
	float [] parentHeight = {5.8f, 5.3f};
	Child1 c1 = new Child1("suresh",25,5.5f,parentsName,parentsAge,parentHeight);
	System.out.println(c1);
	Child2 c2 = new Child2("ramesh",25,5.5f,parentsName,parentsAge,parentHeight);
	System.out.println(c2);
	
	System.out.println(c2.child2Designation());
	System.out.println(c1.child1Designation());
	System.out.println(Arrays.toString(c1.parentsDesignation()));
	System.out.println(Arrays.toString(c2.parentsDesignation()));
	
	Child3 c3 = new Child3("mahesh",2,2.5f,"suresh",25,5.5f,parentsName,parentsAge,parentHeight);
	Child4 c4 = new Child4("anudeep",2,2.5f,"suresh",25,5.5f,parentsName,parentsAge,parentHeight);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(Arrays.toString(c3.parentsDesignation()));
	System.out.println(Arrays.toString(c4.parentsDesignation()));
	System.out.println(c3.child3Designation());
	System.out.println(c4.child4Designation());
	Child5 c5 = new Child5("kanth",3,2.5f,"ramesh",25,5.5f,parentsName,parentsAge,parentHeight);
	Child6 c6 = new Child6("mandeep",3,2.5f,"ramesh",25,5.5f,parentsName,parentsAge,parentHeight);
	System.out.println(c5);
	System.out.println(c6);
	System.out.println(Arrays.toString(c5.parentsDesignation()));
	System.out.println(Arrays.toString(c6.parentsDesignation()));
	System.out.println(c5. child5Designation());
	System.out.println(c6.child6Designation());
	

}
}

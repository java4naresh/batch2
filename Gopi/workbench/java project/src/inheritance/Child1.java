package inheritance;

import java.util.Arrays;

public class Child1 extends Son1 {
	String name1;
	int age1;
	float height1;
	char gender1;
	public Child1(String name1,int age1,float height1,char gender1,String name,int age,float height,char gender,String[] names,int[] ages,float[] heights) {
		super( name, age,height,gender,names,ages,heights);
		this.name1 = name1;
		this.age1 = age1;
		this.height1 = height1;
		this.gender1 = gender1;
		
	}
	
	public String toString() {
		return "Child1 [name1=" + name1 + ", age1=" + age1 + ", height1=" + height1 + ", gender1=" + gender1 + ", name="
				+ name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", names="
				+ Arrays.toString(names) + ", ages=" + Arrays.toString(ages) + ", heights=" + Arrays.toString(heights)
				+ "]";
	}

}

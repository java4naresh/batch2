package inheritance;

import java.util.Arrays;

public class Son1 extends Parents {
	
	String name;
	int age;
	float height;
	char gender;
	public  Son1(String name,int age,float height,char gender,String[] names,int[] ages,float[] heights) {
		
		super( names, ages,heights);
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Son1 [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", names="
				+ Arrays.toString(names) + ", ages=" + Arrays.toString(ages) + ", heights=" + Arrays.toString(heights)
				+ "]";
	}
	
	
	
	

}

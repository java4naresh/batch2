package inheritance;

import java.util.Arrays;

public class Child4 extends Son2{
	String name4;
	int age4;
	float height4;
	char gender4;
public  Child4(String name4,int age4,float height4,char gender4,String name,int age,float height,char gender,String[] names,int[] ages,float[] heights) {
		super( name,age,height,gender,names, ages,heights);
		this.name4 = name4;
		this.age4 = age4;
		this.height4 = height4;
		this.gender4= gender4;
     }
@Override
public String toString() {
	return "Child4 [name4=" + name4 + ", age4=" + age4 + ", height4=" + height4 + ", gender4=" + gender4 + ", name="
			+ name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", names=" + Arrays.toString(names)
			+ ", ages=" + Arrays.toString(ages) + ", heights=" + Arrays.toString(heights) + "]";
}


    
}

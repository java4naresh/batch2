package inheritance;

import java.util.Arrays;

public class Child3 extends Son2{
	
	String name3;
	int age3;
	float height3;
	char gender3;
public  Child3(String name3,int age3,float height3,char gender3,String name,int age,float height,char gender,String[] names,int[] ages,float[] heights) {
		super( name,age,height,gender,names, ages,heights);
		this.name3 = name3;
		this.age3 = age3;
		this.height3 = height3;
		this.gender3= gender3;
     }
@Override
public String toString() {
	return "Child3 [name3=" + name3 + ", age3=" + age3 + ", height3=" + height3 + ", gender3=" + gender3 + ", name="
			+ name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", names=" + Arrays.toString(names)
			+ ", ages=" + Arrays.toString(ages) + ", heights=" + Arrays.toString(heights) + "]";
}


       

}

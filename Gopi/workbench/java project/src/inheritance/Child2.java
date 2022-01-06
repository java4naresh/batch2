package inheritance;

import java.util.Arrays;

public class Child2 extends Son1 {
     
	String name2;
	int age2;
	float height2;
	char gender2;
	public Child2(String name2,int age2,float height2,char gender2,String sName,int sAge,float sHeight,char sGender,String[] pNames,int[] pAges,float[] pHeights) {
		super( sName, sAge,sHeight,sGender,pNames,pAges,pHeights);
		this.name2 = name2;
		this.age2 = age2;
		this.height2 = height2;
		this.gender2 = gender2;
		
	}
	/*@Override
	public String toString() {
		return "Child2 [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", names="
				+ Arrays.toString(names) + ", ages=" + Arrays.toString(ages) + ", heights=" + Arrays.toString(heights)
				+ "]";
	}*/
	@Override
	public String toString() {
		return "Child2 [name2=" + name2 + ", age2=" + age2 + ", height2=" + height2 + ", gender2=" + gender2 + ", name="
				+ name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", names="
				+ Arrays.toString(names) + ", ages=" + Arrays.toString(ages) + ", heights=" + Arrays.toString(heights)
				+ "]";
	}
	
	
	
	
}

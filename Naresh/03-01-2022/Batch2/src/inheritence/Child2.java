package inheritence;

import java.util.Arrays;

public class Child2 extends Parents {

	public String name;
	
	public int age;
	
	public float height;
	
	public char gender;
	
	public Child2(String name, int age, float height, char gender, String[] parentsName, int[] parentAges, float[] parentHeights) {
		super(parentsName, parentAges, parentHeights);
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Child2 [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", parentsName="
				+ Arrays.toString(parentsName) + ", parentAges=" + Arrays.toString(parentAges) + ", parentHeights="
				+ Arrays.toString(parentHeights) + "]";
	}
	
	public String getChild2Designation() {
		return "Businessman";
	}
	
}

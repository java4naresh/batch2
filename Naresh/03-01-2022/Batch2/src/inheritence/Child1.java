package inheritence;

import java.util.Arrays;

public class Child1 extends Parents {
	
	public String name;
	
	public int age;
	
	public float height;
	
	public char gender;
	
	/*public Child1() {
		
		System.out.println("Child1 Cons");
	}*/
	
	public Child1(String name, int age, float height, char gender, String[] parentsName, int[] parentAges, float[] parentHeights) {
		super(parentsName, parentAges, parentHeights);
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
		}

	@Override
	public String toString() {
		return "Child1 [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + ", parentsName="
				+ Arrays.toString(parentsName) + ", parentAges=" + Arrays.toString(parentAges) + ", parentHeights="
				+ Arrays.toString(parentHeights) + "]";
	}
	
    public String getChild1Designation() {
    	return "Developer";
    }
}

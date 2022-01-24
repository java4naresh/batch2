package encapsulation;

public class Parent {
	

	
	private  String name;
	
	private int age;
	
    private float height;

	 Parent(String name, int age, float height) {
		
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void setName( String name  ) {
	
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		
	}
	public int getAge() {
		return this.age;
	}
	public void setHeight(float height) {
		
		
	}
	public float getHeight() {
		return this.height;
	}
	

	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	
	
}
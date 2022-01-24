package encapsulation;

public class Daughter extends Parent  {

	
	private String dName;
	
	private int dAge;
	
	private float dHeight;

	public Daughter(String name, int age, float height, String dName, int dAge, float dHeight) {
		super(name, age, height);
		this.dName = dName;
		this.dAge = dAge;
		this.dHeight = dHeight;
	}
	
	
	@Override
	public String toString() {
		return "Daughter [dName=" + dName + ", dAge=" + dAge + ", dHeight=" + dHeight + ", "
				+ super.toString() + "]";
	}


	public void setDName(String dName) {
		
	}
	public String getDName() {
		
	return this.dName;
	}
	
	public void setDAge(int dAge) {
		
	}
	public int getDAge() {
		return this.dAge;
	}
	public void setDHeight(float dHeight) {
		
	}
	public float getDHeight() {
		return this.dHeight ;
	}
}

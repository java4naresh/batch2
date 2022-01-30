package encapsulation;

public class Son extends Parent {
	
    private  String sName;
	
	private int sAge;
	
	private float sHeight;

	public Son(String name, int age, float height, String sName, int sAge, float sHeight) {
		super(name, age, height);
		this.sName = sName;
		this.sAge = sAge;
		this.sHeight = sHeight;
	}
	
    
	


	@Override
	public String toString() {
		return "Son [sName=" + sName + ", sAge=" + sAge + ", sHeight=" + sHeight + ", " + super.toString()
				+ "]";
	}





	public void setSName(String sName ) {
		this.sName = sName;
     }
     public String getSName() {
    	 return this.sName;
     }
     public void setSAge(int sAge) {
    	 this.sAge = sAge;
     }
     public int getSAge() {
    	 return this.sAge;
     }
     public void setSHeight(float sHeight) {
    	 this.sHeight = sHeight;
     }
     public float getSHeight() {
    	 return this.sHeight;
     }


	

	

}

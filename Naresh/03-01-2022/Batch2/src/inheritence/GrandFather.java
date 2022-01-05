package inheritence;

public class GrandFather {
	
	public String gfName;
	
	public int gfAge;
	
	public float gfHeight;
	
	public GrandFather(String gfName, int gfAge, float gfHeight) {
		this.gfName = gfName;
		this.gfAge = gfAge;
		this.gfHeight = gfHeight;
	}
	
	public String getGFDesignation() {
		return "farmer";
	}

	@Override
	public String toString() {
		return "GrandFather [gfName=" + gfName + ", gfAge=" + gfAge + ", gfHeight=" + gfHeight + "]";
	}
	
	

}

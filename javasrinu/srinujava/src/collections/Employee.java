package collections;

public class Employee {
	
	private Integer eID;
	
	private String eName;
	
	private Integer eAge;
	
	

	public Employee(Integer eID, String eName, Integer eAge) {
		super();
		this.eID = eID;
		this.eName = eName;
		this.eAge = eAge;
	}

	public Integer geteID() {
		return eID;
	}

	public void seteID(Integer eID) {
		this.eID = eID;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Integer geteAge() {
		return eAge;
	}

	public void seteAge(Integer eAge) {
		this.eAge = eAge;
	}

	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", eName=" + eName + ", eAge=" + eAge + "]";
	}
	
	
	
}

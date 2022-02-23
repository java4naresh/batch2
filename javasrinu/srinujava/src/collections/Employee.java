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
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eAge == null) ? 0 : eAge.hashCode());
		result = prime * result + ((eID == null) ? 0 : eID.hashCode());
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eAge == null) {
			if (other.eAge != null)
				return false;
		} else if (!eAge.equals(other.eAge))
			return false;
		if (eID == null) {
			if (other.eID != null)
				return false;
		} else if (!eID.equals(other.eID))
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		return true;
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

package collections;

public class Student {
	
	private Integer  stId;
	
	private String stName;
	
	private Integer age;
	
	
	private Integer stFee;
	
@ Override	
public int hashCode() {
	return stId;
}
 public boolean equals(Object obj) {
	 Student std = (Student) obj;
	 
	 if(std.getStId() == this.stId && std.getStName().equals(this.getStName())) {
		 
		 return true;
		
	 } return false;
	
 }

	public Student(Integer stId, String stName, Integer age, Integer stFee) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.age = age;
		this.stFee = stFee;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getStId() {
		return stId;
	}

	public void setStId(Integer stId) {
		this.stId = stId;
	}

	public Integer getStFee() {
		return stFee;
	}

	public void setStFee(Integer stFee) {
		this.stFee = stFee;
	}

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", age=" + age + ", stFee=" + stFee + "]";
	}

	
	
	

}

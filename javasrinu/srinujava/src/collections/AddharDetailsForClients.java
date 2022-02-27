package collections;

public class AddharDetailsForClients {

	
	private Integer sNum;
	private String name;
	private Integer aNum;
	
	public AddharDetailsForClients(Integer sNum, String name, Integer aNum) {
		super();
		this.sNum = sNum;
		this.name = name;
		this.aNum = aNum;
	}
	
	public Integer getsNum() {
		return sNum;
	}
	public void setsNum(Integer sNum) {
		this.sNum = sNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getaNum() {
		return aNum;
	}
	public void setaNum(Integer aNum) {
		this.aNum = aNum;
	}

	@Override
	public String toString() {
		return "AddharDetailsForClients [sNum=" + sNum + ", name=" + name + ", aNum=" + aNum + "]";
	}
	
	
}

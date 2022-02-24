package collection;

public class Client implements Comparable <Client>{

	private Integer id;
	private String name;
	private Integer age;
	
	public Client(Integer id, String name, Integer age) {		
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return id;
	}
	public boolean equals(Object obj) {
		Client cnt = (Client) obj;
		if(cnt.getId() == this.id && cnt.getName().equals(this.getName()) && cnt.getAge() == this.getAge()) {
		return true;
		}
		return false;
			
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Client c) {


		//return this.name.compareTo(((Client) o).getName());
		return this.id.compareTo(c.getId());
	}
	
	
}

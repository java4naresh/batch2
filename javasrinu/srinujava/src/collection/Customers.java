package collection;

public  class Customers implements Comparable <Customers>{
	
	private Integer id;
	
	private String name;
	
	
	

	public Customers(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Customers o) {
		//return this.name.compareTo(o.getName());
		return this.id.compareTo(o.getId());
		//return 0;
	}

	
	
	
	

}

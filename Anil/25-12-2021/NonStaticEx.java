
public class NonStaticEx {
	String name=" naresh ";
	{
		name = "anil naidu";
		name = getName();
		name = getName();
	}
	public String getName() {
		name =" yashnasrihita";
		return name ;
	
	}
	public String  getNum2() {
		name = getNum3();
		return name;
	}
	public String getNum3() {
		
	
		return "guntur";
	}
	public static  void main(String args[]) {
		NonStaticEx ne = new NonStaticEx();
		System.out.println(ne.name);
		ne.getName();
	}

}
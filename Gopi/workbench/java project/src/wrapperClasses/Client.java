package wrapperClasses;

public class Client  {

	

	public static void main(String[] args) {
		Variables v = new Variables("gopi",24,'m',9160423363l,5.4f,10000);
		System.out.println(v);
		System.out.println("====================");
		v.setName("Krishna Kumari");
		v.setAge(45);
		v.setGender('f');
		v.setNumber(9848876360l);
		v.setWeight(5.1f);
		v.setSalary(50000);
		v.getName();
		v.getAge();
		v.getGender();
		v.getNumber();
		v.getWeight();
		v.getSalary();
		System.out.println(v);
	}
}

package wrapperClasses;

public class WrapperTest {

	private  String name;
	private int age;
	private char gender;
	private long number;
	private float weight;
	private double salary;
	
	private  String name1;
	private  Integer age1;
	private  Character gender1;
	private  Long number1;
	private  Float weight1;
	private  Double salary1;
	
	
   /*public WrapperTest() {
	   
   }*/
	

	@Override
	public String toString() {
		return "WrapperTest [name=" + name + ", age=" + age + ", gender=" + gender + ", number=" + number + ", weight="
				+ weight + ", salary=" + salary + ",] =="+ "[ name1=" + name1 + ", age1=" + age1 + ", gender1=" + gender1
				+ ", number1=" + number1 + ", weight1=" + weight1 + ", salary1=" + salary1 + "]";
	}
	
	

}

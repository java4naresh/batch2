package clone_examples;

public class CloneClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		    Employee e = new Employee();
		    e.setName("srinu");
		    e.setEmpid("sim002");
		    e.setHeight(5.5f);
		    e.setAge(25);
		    /*   System.out.println(e);
		    Employee e1 = e;//shallow cloneing
		    System.out.println(e1);
		    System.out.println(e);
		    e1.setName("Srinivas"+" "+"thirumalasetti");
		    System.out.println(e1);
		    System.out.println(e);*/
		    Employee e2 = (Employee) e.clone();
		    System.out.println(e);
		    System.out.println(e2);
		    e2.setName("srinivas");
		    System.out.println(e);
		    System.out.println(e2);
	}

}

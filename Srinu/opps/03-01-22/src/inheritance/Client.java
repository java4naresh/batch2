package inheritance;

public class Client {
	
	public static void main(String[] args) {
		
		Customer cu = new Customer();
	    cu.saleCar();
	    cu.price();
	    System.out.println(cu.cName);
	    System.out.println(cu.name);
	    System.out.println(cu.price);
	    System.out.println(cu.model);
	    
	}
}

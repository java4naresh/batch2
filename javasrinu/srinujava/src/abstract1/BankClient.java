package abstract1;

public class BankClient {

	public static void main(String[] args) {
		
		Bank c1 = new Customer1();
		c1. bankName();
		c1. branchName();
		c1. customerName();
		c1.customerAccountNum();
		c1.customerAddress();
		c1.customerPhoneNum();
		System.out.println("======================");
		
		Bank c2 = new Customer2();
		c2. bankName();
		c2. branchName();
		c2. customerName();
		c2.customerAccountNum();
		c2.customerAddress();
		c2.customerPhoneNum();
		System.out.println("======================");
		
		Bank c3 = new Customer3();
		c3. bankName();
		c3. branchName();
		c2. customerName();
		c3.customerAccountNum();
		c3.customerAddress();
		c3.customerPhoneNum();
		
	}
}

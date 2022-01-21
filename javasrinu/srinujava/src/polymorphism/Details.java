package polymorphism;

public class Details {
	
	public void srinu(String BankName) {
		System.out.println("String BankName");
		
	}
	public void srinu(String Name , int Age) {
		System.out.println("String Name , int Age");
	
	}
	public void srinu (int accountNum,double accountBalance) {
		System.out.println("int accountNum,double accountBalance");
	}
	public void srinu (long PhoneNum,String Address) {
		System.out.println("long PhoneNum,String Address");
	}
  
	public static void main(String[] args) {
		Details d = new Details();
		d.srinu("sbi");
		d.srinu("Srinu",25);
		d.srinu(1234566,2000.00);
		d.srinu(9010432734l,"kistapuram");
	}
}

public class Customer 
{
	public String name;

	public String accountNumber;

	public String phoneNumber;

	public String mailId;

	public String aadharNumber;

	public char gender;

	public Address address;

	public Bank bank;

	public Customer(String name, String accountNumber, String phoneNumber, String mailId, String aadharNumber, char gender, Address address, Bank bank) {
	this.name = name;
    this.accountNumber = accountNumber;
	this.phoneNumber = phoneNumber;
	this.mailId = mailId;
	this.aadharNumber = aadharNumber;
	this.gender = gender;
    this.address = address;
	this.bank = bank;
	}

	public String toString() {
	return "Customer[name="+name+", accountNumber="+accountNumber+", phoneNumber="+phoneNumber+
		", mailId="+mailId+", aadharNumber="+aadharNumber+", gender="+gender+", address="+address+", bank="+bank+"]";
	}
}

public class Bank 
{
	public String bankName;
    
	public String ifscCode;

    public String manager;

    public Address branch;

	public Bank(String bankName, String ifscCode, String manager, Address branch) {
	this.bankName = bankName;
	this.ifscCode = ifscCode;
	this.manager = manager;
	this.branch = branch;
	}

	public String toString() {
	return "Bank[bankName="+bankName+", ifscCode="+ifscCode+", manager="+manager+", branch="+branch+"]";
	}

}

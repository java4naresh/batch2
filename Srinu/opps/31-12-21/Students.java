class Students  
{
	String name;
	int rollNum;
	char gender;
	String DOB;
	String school;
	long phone;
    
	Address add;
	
	public Students(String name,int rollNum,char gender,String DOB,String school,long phone,Address add){
		this.name=name;
		this.rollNum=rollNum;
	    this.gender=gender;
		this.DOB=DOB;
		this.school=school;
		this.phone=phone;
		this.add=add;


	}
	public static void main(String[] args) 
	{
		Address add=new Address("kpm"," kprm"," kistapuram","chinthalapalam","suryapet","telangana",508246);
		Students st= new Students("srinivas",123,'M',"20-07-1996","vennela",9010432734l,add);
		System.out.println(st.name+" "+st.gender+" "+st.rollNum+" "+st.DOB+" "+st.school+" "+st.phone+" "+st.add.adderss1+" "+st.add.adderss2+" "+st.add.village+" "+st.add.mandal+" "+st.add.dist+" "+st.add.state+" "+st.add.pincode+" "+st.add.country);
	 Students st1= new Students("anil",54,'M',"15-05-1991","pragathi",9542242273l,add);
	 		System.out.println(st1.name+" "+st1.gender+" "+st1.rollNum+" "+st1.DOB+" "+st1.school+" "+st1.phone+" "+st1.add.adderss1+" "+st1.add.adderss2+" "+st1.add.village+" "+st1.add.mandal+" "+st1.add.dist+" "+st1.add.state+" "+st1.add.pincode+" "+st.add.country);
      MethodReference mr= new MethodReference();
      mr.doMethod(st);
	  System.out.println(st1);
	} 
	public String toString(){
	
	return "students[name="+name+",rollNum="+rollNum+",gender="+gender+",DOB="+DOB+",school="+school+",phone="+phone+",Address="+add+"]";


	}
}

package inheritance;

public class Son extends Father {
	String sName;
	 int sAge;
	 float sHeight;
	 
	
	 
	 public Son (String name,int age, float height,String fName,int fAge,float fHeight,String gfname,int gfage,float gfheight,String gfSurName ) {
		 super (fName,fAge,fHeight,gfname,gfage,gfheight,gfSurName);
		 this.sName = name;
		 this.fAge = age;
		 this.fHeight = height;
		  }



	@Override
	public String toString() {
		return "Son [sName=" + sName + ", sAge=" + sAge + ", sHeight=" + sHeight + ", fName=" + fName + ", fAge=" + fAge
				+ ", fHeight=" + fHeight + ", gfName=" + gfName + ", gfAge=" + gfAge + ", gfHeight=" + gfHeight
				+ ", surName=" + surName + "]";
	}
	 


	public String getSonDesignation() {
		return "saftware";
	}
}

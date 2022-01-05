package inheritance;

public class GrandFather {
	 String gfName;
	 int gfAge;
	 float gfHeight;
	 String surName;
	 
	 public GrandFather  (String gfname,int gfage,float gfheight,String gfSurName){
		 this.gfName = gfname;
		 this.gfAge = gfage;
		 this.gfHeight =gfheight;
		 this.surName = gfSurName;
	 }

	@Override
	public String toString() {
		return "GrandFather [gfName=" + gfName + ", gfAge=" + gfAge + ", gfHeight=" + gfHeight + ", surName=" + surName
				+ "]";
	}
			
	public String getGFDesignation() {
		return "farter";
	}
}

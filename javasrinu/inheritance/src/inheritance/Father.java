package inheritance;

public class Father extends GrandFather {
	 String fName;
	 int fAge;
	 float fHeight;
	 
	 
	 public Father  (String fName,int fAge,float fHeight,String gfName,int gfAge,float gfHeight,String gfSurName){
		 super(gfName,gfAge,gfHeight,gfSurName);
		 this.fName = fName;
		 this.fAge = fAge;
		 this.fHeight =fHeight;
	 }
	
		 
	






	@Override
	public String toString() {
		return "Father [fName=" + fName + ", fAge=" + fAge + ", fHeight=" + fHeight + ", gfName=" + gfName + ", gfAge="
				+ gfAge + ", gfHeight=" + gfHeight + ", surName=" + surName + "]";
	}









	public String getFDesignation() {
		return "farter";
	}
}

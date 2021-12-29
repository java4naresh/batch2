class Mobile 
{
	String band="nokia";
    int IMEI=154682;
	float cast=1100;
	String madeIn="india";

	public static void main(String[] args) 
	{
		Mobile m=new Mobile();
		System.out.println(m.band);
		System.out.println(m.IMEI);
		System.out.println(m.cast);
		System.out.println(m.madeIn);
        System.out.println("===========");
	    m.band="realme";
		m.IMEI=1462654;
		m.cast=15000;
		m.madeIn="chaina";
		System.out.println(m.band);  
		System.out.println(m.IMEI);
		System.out.println(m.cast);
		System.out.println(m.madeIn);
	}
}

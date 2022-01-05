package inheritance;

class Staticnonstatic {
	int num = 10;
	static int num1 = 20;
	static {
		
		num1 = 30;
		System.out.println("static1");
	}
	{
		num = 30;
		System.out.println("non static");
	}
	static String name = "getName()";
     String name1 = "getName1()";
     public static String getName() {
    	 System.out.println("kambala");
    	 return "gopi";
     }
     public  String getName1() {
    	 System.out.println("pspk");
    	 return "nadh";
     }
     
     public static void main(String[] args) {
    	 Staticnonstatic sns = new Staticnonstatic();
    	System.out.println(sns.num);
    	 System.out.println(sns.num1);
    	 System.out.println(Staticnonstatic.getName());
    	 System.out.println(sns.getName1());
     }

}

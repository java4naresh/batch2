package inheritance; 

public class User2 {
	public static void main(String[] args) {
		Son s = new Son("Gopi",24,5.5f,"srinu",45,6.0f,"narasayya",60,6.6f,"kambala");
		
		//String results = s.gitNum2();
		
		System.out.println(s.name);
		String name = s.getNum();
		System.out.println(name);
	
	
	}
	

}
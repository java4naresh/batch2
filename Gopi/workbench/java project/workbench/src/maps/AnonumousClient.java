package maps;

public class AnonumousClient {

	public static void main(String[] args) {
		
		
		 MyInterface mm = new  MyInterface() {

			public void print1to100() {
				
				for(int i=1;i<101;i++) {
					System.out.println(i);
				}
			}

			public void print101to200() {
				for(int i=101;i<201;i++) {
					System.out.println(i);
				}
			}
			
			 
		 };
		 
		 mm.print1to100();
		 mm.print101to200();
            
		
	}

}

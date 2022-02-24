package anonumous;

public class AnonumousClient {

	public static void main(String[] args) {



		MyInterface mi = new MyInterface() {

			@Override
			public void print1to100() {
				for(int i = 0; i<=100 ; i++) {
					System.out.println(i);
				}
			}

			@Override
			public void print100to200() {

				for(int i = 100; i<=200 ; i++) {
					System.out.println(i);
				}
            
            


			}
		};
		mi.print1to100();
		mi.print100to200();
	}
}
package abstractclasses;

public class KTMClient {
	
	public static void main(String[] args) {
		KTM duke = new Duke250();
		duke.wheels();
		duke.engineSpareParts();
		
		KTM rc200 = new RC200();
		rc200.wheels();
		rc200.engineSpareParts();
	}

}

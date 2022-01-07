package Interface;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Programs p = new Programs();
		int results = p.additions(5,7,6);
		System.out.println(results);
		p.doAddAndPrint(4,3,2,1);
		int results1 = p.multifiction(2,3,4);
		System.out.println(results1);
		p.doMulAndPrint(4,2,5);
		
	}

}

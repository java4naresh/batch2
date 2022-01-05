package inheritance;

public class FindOut {

	public static void main(String[] args) {
		String[] parents = new String[] {"Narasayya,Maha Lakshmi"};
		int[] ages = new int[] {67,64};
		float[] heights = new float[] {5.7f,5.5f};
		Child1 c1 = new Child1("GOPI",25,5.6f,'m',"Srinu",53,5.8f,'m',parents,ages,heights);
		 Child2 c2 = new Child2("Ramya",23,5.4f,'f',"Srinu",53,5.8f,'m',parents,ages,heights);
         System.out.println(c1);
         System.out.println(c2);
         Child3 c3 = new Child3("Ram",25,5.6f,'m',"Koteswaravo",59,5.9f,'m',parents,ages,heights);
		 Child4 c4 = new Child4("Triveni",23,5.4f,'f',"Koteswaravo",59,5.9f,'m',parents,ages,heights);
         System.out.println(c3);
         System.out.println(c4);
	}

}

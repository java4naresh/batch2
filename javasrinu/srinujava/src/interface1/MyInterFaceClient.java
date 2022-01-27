package interface1;

public class MyInterFaceClient {

	public static void main(String[] args) {
		 MyInterFace mi = new  MyImplementation();
		 int sum = mi.add(10,10);
		 System.out.println(sum);
		 System.out.println(mi.multiply(10,10));
		 System.out.println(mi.sub(15,10));
		 System.out.println(mi.division(15,3));
		 System.out.println(mi.rem(10,5));
		mi.addPrint(10,5);
		mi.multiplyPrint(10,5);
		mi.subPrint(25,20);
		mi.divisionPrint(45,9);
		 mi.remPrint(55,11);
		 System.out.println(mi.multiply1(10,10,10));
		 System.out.println(mi.add1(15,10,15));
		 System.out.println(mi. Armstrong(153));
		 

	}

}

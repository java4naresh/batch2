package typecasting;

import polymorphism.SubClass;
import polymorphism.SuperClass;

public class TypeCastingClient {

	public static void main(String[] args) {

		SuperClass sc = new SubClass();//up casting
		SubClass sub = (SubClass) sc; // down casting
		//SubClass sub2 = (SubClass) new SuperClass();// not possible
		
	}

}

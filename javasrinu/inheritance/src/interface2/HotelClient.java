package interface2;

import interface1.*;

public class HotelClient {

	public static void main(String[] args) {
	
		//Hotel babai = new BabaiHotel ();
		//Hotel1 babai1 = new BabaiHotel();
		BabaiHotel babai = new BabaiHotel ();
		System.out.println("veg & nonveg");
		System.out.println("Babai Hotel");
		System.out.println("idly ="+babai.idly());
		System.out.println("poori ="+babai.poori());
		System.out.println("plainDosa ="+babai.plainDosa());
		System.out.println("masalaDosa ="+babai.masalaDosa());
		System.out.println("bonda  ="+babai.bonda ());
		System.out.println(" punugu ="+babai. punugu());
		System.out.println("chapathi="+babai.chapathi());
		System.out.println("parota ="+babai.parota());
		System.out.println("uthapa ="+babai.uthapa());
		System.out.println("eggDosa ="+babai.eggDosa());
		//System.out.println("eggDosa ="+babai1.eggDosa());
		System.out.println("=====================================");
		Hotel raghavendra = new RaghavendraHotel ();
		System.out.println("veg");
		System.out.println("Raghavendra  Hotel");
		System.out.println("idly ="+raghavendra.idly());
		System.out.println("poori ="+ raghavendra.poori());
		System.out.println("plainDosa ="+ raghavendra.plainDosa());
		System.out.println("masalaDosa ="+ raghavendra.masalaDosa());
		System.out.println("bonda  ="+ raghavendra.bonda ());
		System.out.println(" punugu ="+ raghavendra. punugu());
		System.out.println("chapathi="+ raghavendra.chapathi());
		System.out.println("parota ="+ raghavendra.parota());
		System.out.println("uthapa ="+ raghavendra.uthapa());
		
		
		
	}

}

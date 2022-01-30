package oops.interfaceexamples;

public class HotelClient {

	public static void main(String[] args) {
         Hotel amogha = new Amogha();
         System.out.println(amogha.idly());
         System.out.println(amogha.dosa());
         System.out.println(amogha.poori());
         System.out.println(amogha.vada());
         System.out.println(amogha.sambarIdly());
         
         Hotel novatel = new Novatel();
         System.out.println(novatel.idly());
         System.out.println(novatel.dosa());
         System.out.println(novatel.poori());
         System.out.println(novatel.vada());
         System.out.println(novatel.sambarIdly());
	}

}

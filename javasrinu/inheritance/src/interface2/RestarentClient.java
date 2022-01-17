package interface2;

import interface1.*;

public class RestarentClient {

	public static void main(String[] args) {

   VegRestarent  santosh = new SantoshDaba ();
   System.out.println("Santosh Daba & veg"); 
   System.out.println("pannerBiryani ="+santosh.pannerBiryani());
   System.out.println("pannerButterMasala ="+santosh.pannerButterMasala());
   System.out.println("vegManchurianDry ="+santosh.vegManchurianDry());
   System.out.println("kajuPanner ="+santosh.kajuPanner());
   System.out.println("kajuBiryani ="+santosh.kajuBiryani());
   System.out.println("kajuButterMasala ="+santosh.kajuButterMasala());
   System.out.println("chilliPannerDry ="+santosh.chilliPannerDry());
   System.out.println("vegSpringRoll ="+santosh.vegSpringRoll());
   System.out.println("jeeraRice ="+santosh.jeeraRice());
   System.out.println("vegBiryani ="+santosh.vegBiryani());
   System.out.println("butterNon ="+santosh.butterNon());
   System.out.println(" dalFry ="+santosh. dalFry());
   System.out.println("mushroom65 ="+santosh.mushroom65 ());
   System.out.println("handiBiryani ="+santosh.handiBiryani());
   System.out.println("mushroomMasala ="+santosh.mushroomMasala());
   System.out.println("kadaiVegMasala="+santosh.kadaiVegMasala());
  System.out.println("=========================================");
  
     NonVegRestarent krishna = new KrishnaTungaRestarent ();
     System.out.println("Krishna Tunga Restarent & NonVeg");
     System.out.println("splChikenBiryani ="+krishna.splChikenBiryani());
     System.out.println("kheemaBiryani ="+krishna.kheemaBiryani());
     System.out.println("fbSplChikenBiryani ="+krishna.fbSplChikenBiryani());
     System.out.println("potChikenBiryani ="+krishna.potChikenBiryani());
     System.out.println(" fryPieceChikenBiryaniBone  ="+krishna. fryPieceChikenBiryaniBone ());
     System.out.println("ragiMuddaNatukodiPulusu ="+krishna.ragiMuddaNatukodiPulusu());
     System.out.println(" muttonBiryani ="+krishna. muttonBiryani());
     System.out.println("apolloFish ="+krishna.apolloFish());
     System.out.println("payaSoup ="+krishna.payaSoup());
     System.out.println("naatukodiBiryani ="+krishna.naatukodiBiryani());
     System.out.println("chikenBiyani  ="+krishna.chikenBiyani ());
     System.out.println("paya  ="+krishna.paya ());
     System.out.println("natukodiPulusu ="+krishna.natukodiPulusu());
     System.out.println("==================================================");
     
     MultiRestarent multi = new MultiRestarent ();
     System.out.println("Multi Restarent");
     System.out.println("pannerBiryani ="+multi.pannerBiryani());
     System.out.println("pannerButterMasala ="+multi.pannerButterMasala());
     System.out.println("vegManchurianDry ="+multi.vegManchurianDry());
     System.out.println("kajuPanner ="+multi.kajuPanner());
     System.out.println("kajuBiryani ="+multi.kajuBiryani());
     System.out.println("kajuButterMasala ="+multi.kajuButterMasala());
     System.out.println("chilliPannerDry ="+multi.chilliPannerDry());
     System.out.println("vegSpringRoll ="+multi.vegSpringRoll());
     System.out.println("jeeraRice ="+multi.jeeraRice());
     System.out.println("vegBiryani ="+multi.vegBiryani());
     System.out.println("butterNon ="+multi.butterNon());
     System.out.println(" dalFry ="+multi. dalFry());
     System.out.println("mushroom65 ="+multi.mushroom65 ());
     System.out.println("handiBiryani ="+multi.handiBiryani());
     System.out.println("mushroomMasala ="+multi.mushroomMasala());
     System.out.println("kadaiVegMasala="+multi.kadaiVegMasala());
     System.out.println("splChikenBiryani ="+multi.splChikenBiryani());
     System.out.println("kheemaBiryani ="+multi.kheemaBiryani());
     System.out.println("fbSplChikenBiryani ="+multi.fbSplChikenBiryani());
     System.out.println("potChikenBiryani ="+multi.potChikenBiryani());
     System.out.println(" fryPieceChikenBiryaniBone  ="+multi. fryPieceChikenBiryaniBone ());
     System.out.println("ragiMuddaNatukodiPulusu ="+multi.ragiMuddaNatukodiPulusu());
     System.out.println(" muttonBiryani ="+multi. muttonBiryani());
     System.out.println("apolloFish ="+multi.apolloFish());
     System.out.println("payaSoup ="+multi.payaSoup());
     System.out.println("naatukodiBiryani ="+multi.naatukodiBiryani());
     System.out.println("chikenBiyani  ="+multi.chikenBiyani ());
     System.out.println("paya  ="+multi.paya ());
     System.out.println("natukodiPulusu ="+multi.natukodiPulusu());
	}

}

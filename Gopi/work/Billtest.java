class CurrentBillTest {
public static void main(String[] args){

String customerName = "subbarao";
int reading = 350;

if(reading >100 && reading<200) {
   System.out.println(customerName+" "+"Currentbill"+" "+(reading*1.2));

} else if(reading >200 && reading<300) {
   System.out.println(customerName+" "+"Currentbill"+" "+(reading*3.5));

} else if(reading >300 && reading<400) {
   System.out.println(customerName+" "+"Currentbill"+" "+(reading*4));

} else if(reading >400 && reading<500) {
   System.out.println(customerName+" "+"Currentbill"+" "+(reading*5.5));

}else {
    System.out.println("worng");
}
}


}


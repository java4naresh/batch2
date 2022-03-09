class PowerBill {
public static void main(String[] args) {
int consumerNumber = 252020;
String consumerName = "GNANA VIKAS";
double usageUnits = 130.00;
double perUnit = 2.00;
double totalBill = 0.00;
if(consumerNumber == 25202) {
System.out.println(consumerName +(usageUnits * perUnit));
} else if ((usageUnits>100 * 2.50) ||(usageUnits<120 *2.00 ) ){
System.out.println(consumerName +" "+ totalBill);
}
else {
System.out.println("Something Went Wrong");
}
}
}
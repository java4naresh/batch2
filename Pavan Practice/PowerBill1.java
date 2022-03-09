class PowerBill1{
public static void main(String[] args) {
int consumerNumber = 16012022;
String name = "PARDHU";
double units = 700.00;
double perUnit = 2.00;
double total = 0.00;
if(units ==500){
total = units * perUnit;
System.out.println(name + total);
} else if(units>100 && units<200) {
total = units*3;
System.out.println(name + total);
} else if(units>300 && units<800) {
total = units*5;
System.out.println(name + total);
} 
}
}
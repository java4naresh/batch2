class ATMPin {

public static void main(String[] args) {

int atmPin = 8616;
double withDrawAmount = 40000.00;
double balAmount = 50000.00;
if(atmPin == 8616) {
if(withDrawAmount % 100 == 0) {
if(balAmount >= withDrawAmount) {
System.out.println("Please Take Your Amount");
System.out.println("Your Current Balance is :"+ (balAmount - withDrawAmount));
System.out.println("Please Visit Again");

} else {
System.out.println("Insufficient Funds");
System.out.println("Your Current Balance is :"+balAmount); 

}
} else {
System.out.println("Ivalid Amount!");

}

} else {

System.out.println("Invalid Pin");

}



}

}
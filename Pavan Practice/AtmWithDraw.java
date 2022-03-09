class AtmWithDraw {
public static void main (String[] args) {
int atmPin = 2020;
double balanceAmount = 50000.00;
double withDrawAmount = 40000.00;
if(atmPin == 2020) {
if(withDrawAmount%100 == 0){
if(balanceAmount >= withDrawAmount) {
System.out.println("Please Take Your amount");
System.out.println("Please Visit again");
} else {
System.out.println("Insufficient Funds");
}
} else {
System.out.println("Invalid Amount");
}
} else {
System.out.println("Invalid pin");
}
}
}
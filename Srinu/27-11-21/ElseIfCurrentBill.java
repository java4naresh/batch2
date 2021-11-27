class ElseIfCurrentBill{

public static void main(String[] args){

String name="Srinivas";
float currentBillUnits=650f;

if(currentBillUnits>700){

System.out.println(name+" "+"currentbill"+" "+ (currentBillUnits*5));

}else if(currentBillUnits>600&&currentBillUnits<700){

System.out.println(name+" "+"currentbill"+" "+ (currentBillUnits*4.5));

}else if(currentBillUnits>500&&currentBillUnits<600){

System.out.println(name+" "+"currentbill"+" "+ (currentBillUnits*4));

}else if(currentBillUnits>400&&currentBillUnits<500){

System.out.println(name+" "+"currentbill"+" "+ (currentBillUnits*3));

}else if(currentBillUnits>300&&currentBillUnits<400){

System.out.println(name+" "+"currentbill"+" "+ (currentBillUnits*3));
}
else{
System.out.println("worng");
}
}
}
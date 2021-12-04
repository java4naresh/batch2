class MixedPractice{

public static void main(String[] args){

//String name = "srinivas";

/*if (name=="srinivas"){

System.out.println(name+"is a good boy");

}else {

System.out.println(name+"is a bad boy");
}
int a=10;
int b=20;
int c=30;

if(a==15){

System.out.println("a=10");
}
if(b==45){
System.out.println("b=20");
}
if(c==15){
System.out.println("c=30");
}
else {

System.out.println("invalid");


}
int num =4582;
int rem =num%2;
if(rem==0){
System.out.println(num+" "+"is a even number   ");
}
else if(rem==1){
System.out.println(num+" "+"is a odd number   ");
}
else {
System.out.println(num+" "+"is not a even number   ");

}*/
int num=4;
switch (num){
case 1:
String name = "srinu";
String study = "10th class";
int rollNum = 249;
float percentage = 75.25f;
if (name=="srinu"){
System.out.println("Student name is"+name);

}if  (study== "10th class"){

System.out.println(study);
 
}if (rollNum==249){

System.out.println(rollNum);


}if (percentage>70){

System.out.println(percentage);

}else {

System.out.println("invaild");

}break;
case 2:
int a=7582;
int rem=a%2;
if (rem==0){

System.out.println(a+" "+" is a even num");
}
if(rem==1){

System.out.println(num+" "+" is a even num");

}else {


}break;

case 3:
//lg tv=50000to60000
//samsung=40000to50000
//mi=30000to40000
//oppo=20000to30000
//realme=10000to20000

double price=55000d;

if(price>60000){

System.out.println("This price tv is LG tv");

}else if(price>50000&price<60000){
System.out.println("This price tv is samsung tv");
}else if(price>40000&price<50000){
System.out.println("This price tv is mi tv");
}else if(price>30000&price<40000){
System.out.println("This price tv is oppo tv");
}else if(price>20000&price<30000){
System.out.println("This price tv is realme tv");
}
else {
System.out.println("There is no TV in this price");


}break;
case 4:
int b=10;
System.out.println(b++ + ++b +--b+ ++b - ++b);//32
                   

}


}

}
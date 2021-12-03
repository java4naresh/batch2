class IfStatementTest {

public static void main(String[] args){
float percentage = 35.00f;
String name = "mahi";
if(percentage>70){
System.out.println(name+" "+"got a First class");
} else if(percentage>60 && percentage<70){
System.out.println(name+" "+"got a second class");
} else if(percentage>50 && percentage<60){
System.out.println(name+" "+"got a third class");
} else if(percentage>40){
System.out.println(name+" "+"got a fourth class");
}
  else{
  System.out.println(name+" "+"fail");

}


}


}
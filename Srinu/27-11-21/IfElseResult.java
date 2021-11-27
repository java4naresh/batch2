class IfElseResult{

public static void main(String[] args){

String name="srinivas";

float percentage=65.25f;

if(percentage>70){

System.out.println(name+" "+"got a first class");

}else if(percentage>60&&percentage<70){

System.out.println(name+" "+"got a second class");

}else if(percentage>50&&percentage<60){

System.out.println(name+" "+"got a third class");

}else if(percentage>40&&percentage<50){

System.out.println(name+" "+"got a fourth class");

}else {

System.out.println(name+" "+"got failed");

}
}
}
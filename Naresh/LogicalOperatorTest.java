class LogicalOperatorTest {

public static void main(String[] args) {

int num1 = 13;
int num2 = 21;

/*if(num1++ % 2 == 0 && ++num2 % 2 == 0) {
System.out.println("Given Numbers are Even");

} else {
System.out.println("Given Numbers are not Even");

}*/
if(num1++ % 2 != 0 && num2++ % 2 == 0) {
System.out.println("Given Numbers are Even");

} else {
System.out.println("Given Numbers are not Even");

}

System.out.println(num1);//12,12,12

System.out.println(num2);//21,21,21

}


}
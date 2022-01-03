package inheritance1;

public class PublicExample {

 public String name;
 public long num;
 
 
 public void sum(int num1,int num2) {
	 int add = num1+num2;
	 System.out.println(add);
 }
 public PublicExample(String name,long num) {

	 this.name = name;
	 this.num = num;
	 
}
 public String toString() {
	 return "PublicExample[name="+name+",num="+num+"]";
 }
}

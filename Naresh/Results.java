class Results {

public static void main(String[] args) {

float percentage = 30.01f;
String name = "Naresh";

if(percentage > 70) System.out.println(name+ " got First Class");
else if(percentage > 60 && percentage < 70) System.out.println(name+ " got Second Class");
else if(percentage < 60 && percentage > 50) System.out.println(name+ " got Third Class");
else if(percentage > 40 && percentage < 50) System.out.println(name+ " got Fourth Class");
else System.out.println(name+ " got Failed");


}


}
class Results {
public static void main (String[] args) {
float percentage = 79f;
String name = "PARDHU";
if (percentage>80) {
System.out.println(name +"First Class");
} else if (percentage>70 && percentage<80) {
System.out.println(name +"Second Class");
} else if (percentage>60 && percentage<70) {
System.out.println(name +"Third Class");
} else if (percentage>35 && percentage<60) {
System.out.println(name +"Fourth Class");
} else {
System.out.println(name +"Got Failed");
}
}
}
class Village
{
    String name;
    String mandal;
    String district;
    String state;
    String pincode;
 public static void main(String[] args)
{
    Village v = new Village();

System.out.println(v.name);
System.out.println(v.mandal);
System.out.println(v.district);
System.out.println(v.state);
System.out.println(v.pincode);
  System.out.println("================");

v.name="Gangireddypalem";
v.mandal="Bellamkonda";
v.district="Guntur";
v.state="AP";
v.pincode="522411";

System.out.println(v.name);
System.out.println(v.mandal);
System.out.println(v.district);
System.out.println(v.state);
System.out.println(v.pincode);

  }

 }
  
package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;



public class SerializationClient {

	public static void main(String[] args) {
		
	  	  try {
	  		Student s = new Student();
	  		s.setStudentName("srivas");
	  		s.setAge(25);
	  		s.setCourses(new String[]{"java","phyton"});
		FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		System.out.println("file created");
	} catch (FileNotFoundException e) {
	  e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}
	  	  
	}

}

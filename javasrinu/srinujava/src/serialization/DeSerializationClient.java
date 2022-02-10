package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationClient {

	public static void main(String[] args) {
		
		try {
			//Student s = new Student();
			
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student) ois.readObject();
			System.out.println(s);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
          e.printStackTrace();
		}
	}
}

package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class FilesTask {
	
    private String fastName;

	private String lastName;
	
	private char gender;
	
	private Integer age;
	
    private double salary;
	
	private float height;
	
	
	
   
	

	public String getFastName() {
		return fastName;
	}
	public void setFastName(String fastName) {
		this.fastName = fastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "FilesTask [fastName=" + fastName + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age
				+ ", salary=" + salary + ", height=" + height + "]";
	}
	
	

	
	
	
		
	
	
	public static void main(String[] args) {

		
       String fileName = "C:\\\\Users\\\\ADMIN\\\\Desktop\\\\simple.txt";

		/*try {
			File file = new File(fileName);
			FileWriter	fw = new FileWriter(file,true);
			PrintWriter pw = new PrintWriter(fw);
			pw.write("Srinu");
			pw.write(" Thirumalasetti");
			pw.print( " " +'M');
			pw.print(" " + 25);
			pw.print(" " + 10000);
			pw.print( " "+5.5f);
			pw.println();
			pw.write("Naresh");
			pw.write(" Kambala");
			pw.print( " " +'M');
			pw.print(" " + 30);
			pw.print(" " + 50000);
			pw.print( " "+5.7f);
			pw.println();
			pw.write("Gopi");
			pw.write(" Kambala");
			pw.print( " " +'M');
			pw.print(" " + 25);
			pw.print(" " + 10000);
			pw.print( " "+5.5f);
			pw.println();
			pw.write("Anil");
			pw.write(" ulli");
			pw.print( " " +'M');
			pw.print(" " + 28);
			pw.print(" " + 300000);
			pw.print( " "+5.7f);
			pw.println();
			pw.write("Venki");
			pw.write(" Asula");
			pw.print( " " +'M');
			pw.print(" " + 28);
			pw.print(" " + 30000);
			pw.print( " "+5.7f);
			pw.println();
			pw.flush();
			System.out.println("created");
		} catch (IOException e) {
	
			e.printStackTrace();
		}*/
		
	
		try {
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			/*String name = br.readLine();S
			System.out.println(name);*/
			String name = null;
			while ((name = br.readLine())!= null){
			
			
			String s = name;
			String[]  array = s.split(" ");
			System.out.println(Arrays.toString(array));
			
			FilesTask ft = new FilesTask();
			
			ft.setFastName(array[0]);
			ft.setLastName(array[1]);
			ft.setGender(array[2].charAt(0));
			ft.setAge(Integer.parseInt(array[3]));
			ft.setSalary(Double.parseDouble(array[4]));
			ft.setHeight(Float.parseFloat(array[5]));
			
			System.out.println(ft.toString());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}

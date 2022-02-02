package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Employee {

	public void writeFileUsingPrintWriter(String fileName) {
		
		
		
		try {
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
		}
		
	}
	public static void main(String[] args) {
		
		 Employee e = new  Employee();
		 e.writeFileUsingPrintWriter("C:\\Users\\ADMIN\\Desktop\\simple.txt");
		 
	}
}

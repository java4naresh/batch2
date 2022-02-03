package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilesExample {

	public static void main(String[] args) {
		
		FilesExample fe = new FilesExample();
		/*try {
		fe.readFile("E:\\batch2\\javasrinu\\srinujava\\src\\files\\simple.txt");
		}catch (IOException e) {
			e.printStackTrace();
		}*/
		/*try {
			fe.readFile1("E:\\batch2\\javasrinu\\srinujava\\src\\files\\simple.txt");
			}catch (IOException e) {
				e.printStackTrace();
			}*/
		//fe.directory("simple.txt");
		//fe.writeFileForUsingFileWriter("C:\\Users\\ADMIN\\Desktop\\folder1");
		//fe.fileReadUsingBuffered("E:\\batch2\\javasrinu\\srinujava\\src\\files\\simple.txt");
		//fe.fileWriterUsingBufferedWriter("C:\\Users\\ADMIN\\Desktop\\simple.txt");
		fe.writeFileUsingPrintWriter("C:\\Users\\ADMIN\\Desktop\\simple.txt");
	}
	
	public void readFile(String fileName) throws IOException {
		
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		/*char ch = (char) fr.read();
		System.out.println(ch);*/
		
		int numchar;
		while(( numchar = fr.read()) !=-1) {
			System.out.print((char)numchar);
		}
	
	}
	public void readFile1(String fileName1) throws IOException {
		File file = new File(fileName1);
		FileReader fr = new FileReader(file);
		/*char ch = (char) fr.read();
		System.out.println(ch);*/
		int numchar;
		for (numchar = fr.read(); numchar!= -1; numchar = fr.read())  {
			System.out.print((char)numchar);
		}
	}
	public void directory(String fileName) {
		File file = new File("folder1");
		boolean created = file.mkdir();
		System.out.println(created);  
	}
	public void writeFileForUsingFileWriter(String fileName) {


		try {
			File file = new File(fileName);
			FileWriter fw = new FileWriter(file,true);
			fw.write("Srinu");
			fw.write("Thirumalasetti");
			fw.write("\n");
			fw.write("Naidu");
			fw.flush();
			 System.out.println("file is created");
		} catch (IOException e) {
        
			e.printStackTrace();
		}

	}
	public void fileReadUsingBuffered(String fileName) {
		
		FileReader fr;
		try {
			File file = new File(fileName);
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			/*String name = br.readLine();
			System.out.println(name);
			String name2 = br.readLine();
			System.out.println(name2);*/
			String name = null;
			while ((name = br.readLine())!= null){
			System.out.println(name);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void fileWriterUsingBufferedWriter(String fileName) {
		
		
		try {
			
			File file = new File(fileName);
			FileWriter 	fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Srinu");
			bw.newLine();
			bw.write("Thirumalasetti");
			bw.newLine();
			bw.write(65);
			bw.flush();
			System.out.println("created");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
	}
	public void writeFileUsingPrintWriter(String fileName) {
		
		
	
		try {
			File file = new File(fileName);
			FileWriter	fw = new FileWriter(file,true);
			PrintWriter pw = new PrintWriter(fw);
			pw.write("srinu");
			
			pw.print("25");
			pw.flush();
			System.out.println("created");
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
	}
}
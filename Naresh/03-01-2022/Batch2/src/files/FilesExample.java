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

		//fe.readFile("E:\\Eclipse\\batch2\\Batch2\\src\\files\\sample.txt");
        //fe.writeFile("C:\\Users\\lenovo\\Desktop\\sample.txt");
        //fe.readFileUsingBufferedReader("C:\\Users\\lenovo\\Desktop\\sample.txt");
	    //fe.writeFileUsingBufferedWriter("C:\\Users\\lenovo\\Desktop\\sample.txt");
	    fe.writeFileUsingPrintWriter("C:\\Users\\lenovo\\Desktop\\sample.txt");
	}
	
	public void readFileUsingFileReader(String fileName) {
		File file = null;
		FileReader fr = null;
		try {
		file = new File(fileName);
		fr = new FileReader(file);
		/*char ch = (char) fr.read();
		System.out.println(ch);*/
		int numChar;
		while((numChar = fr.read()) != -1) {
			System.out.print((char)numChar);//Naresh
		}
		
		/*for(numChar = fr.read(); numChar != -1; numChar = fr.read()) {
			System.out.print((char)numChar);
		}*/
		/*System.out.println((char)fr.read());//N
		System.out.println((char)fr.read());//a
		System.out.println((char)fr.read());//r
		System.out.println((char)fr.read());//e
		System.out.println((char)fr.read());//s
		System.out.println((char)fr.read());//h
		System.out.println((char)fr.read());//-1
*/		} catch(FileNotFoundException fe) {
			fe.printStackTrace();
		} catch(IOException io) {
			io.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void writeFileUsingFileWriter(String fileName) {
		// to create directory
		/*File file = new File("C:\\Users\\lenovo\\Desktop\\folder1");
		boolean isFolderCreated = file.mkdir();
		System.out.println(isFolderCreated);*/
		
		
		try {
			File file = new File(fileName);
			FileWriter fw = new FileWriter(file, true);
			fw.write("Naresh");
			fw.write("\n");
			fw.write("Kambala");
			fw.flush();
			System.out.println("File Write Completed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readFileUsingBufferedReader(String fileName) {
		try {
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		/*String name = br.readLine();
		System.out.println(name);
		String name2 = br.readLine();
		System.out.println(name2);*/
		String name = null;
		while((name = br.readLine()) != null) {
			System.out.println(name);
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeFileUsingBufferedWriter(String fileName) {
		
		try {
			File file = new File(fileName);
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Naresh dsfghgdjdjhdcjhghgcg gjghghhhg");
			bw.write(" Kambala dvsdsfffdsfdsfdfd");
			bw.newLine();
			bw.write("Hyderabad");
			bw.newLine();
			bw.write(65);
			bw.flush();
			System.out.println("File Written Completed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeFileUsingPrintWriter(String fileName) {
		
		try {
			File file = new File(fileName);
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.write("Naresh");
			pw.write(" Kambala");
			pw.print(30);
			pw.flush();
			System.out.println("File Written Completed");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

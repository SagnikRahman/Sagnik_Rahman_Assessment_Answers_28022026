package file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\SAGNIK//test.txt");
		File f1 = new File("C:\\Users\\SAGNIK//test1.txt");
//		f.createNewFile();
//		System.out.println(f.createNewFile());
//		System.out.println(f.exists());
//		System.out.println(f.delete());
		
//		FileInputStream fis = new FileInputStream(f);
//		System.out.println(fis.read());
//		
//		int count;
//		while ((count = fis.read()) != -1) {
//			System.out.print((char)count);
		
//		Scanner sc = new Scanner(f);
//		while(sc.hasNext()) {
//			System.out.println(sc.nextLine());
//		}
//		sc.close();
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		System.out.println("File copied successfully");
		br.close();
		bw.close();
	}
}

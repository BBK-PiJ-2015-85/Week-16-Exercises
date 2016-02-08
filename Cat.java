import  java.io.File;
import java.util.Scanner;
import java.lang.AutoCloseable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Cat {
	public static void main (String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the file name: ");
		String str = scan.nextLine();
		File file = new File(str);
		
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			} 
		} catch (FileNotFoundException ex) {
			System.out.println("File " + file + " does not exist.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}		
	}
}
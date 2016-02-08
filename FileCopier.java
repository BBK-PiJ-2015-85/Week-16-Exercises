import  java.io.File;
import java.util.Scanner;
import java.lang.AutoCloseable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class FileCopier {
	private static final String NEW_LINE = System.getProperty("line.separator");
	
	public static void main (String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first file name: ");
		String str = scan.nextLine();
		File file1 = new File(str);
		System.out.println("Please enter the second file name: ");
		str = scan.nextLine();
		File file2 = new File(str);
		
		try (BufferedReader in = new BufferedReader(new FileReader(file1));
		     PrintWriter   out = new PrintWriter(file2)) {
			
			String line;
			StringBuilder sb = new StringBuilder();
			while((line = in.readLine()) != null) {
				sb.append(line);
				sb.append(NEW_LINE);				
			}
			System.out.println("Would you like to overwrite this file? Y or N");
			str = scan.nextLine();
			if (str.equals("Y")) {
				out.write(sb.toString());
			}						
		} catch (FileNotFoundException ex) {
			System.out.println("File " + str + " does not exist.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
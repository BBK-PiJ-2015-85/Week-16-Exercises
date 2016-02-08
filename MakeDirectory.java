import  java.io.File;
import java.util.Scanner;

public class MakeDirectory {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the new directory: ");
		String str = scan.nextLine();
		File file = new File(str);
		System.out.println(file.mkdir());
		
	}
}
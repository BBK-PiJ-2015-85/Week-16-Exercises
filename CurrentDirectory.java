import  java.io.File;

public class CurrentDirectory {
	public static void main(String[] args) {
		File file = new File("\\My Documents\\PiJ Work\\Week-15-Exercises");
		String[] list = file.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
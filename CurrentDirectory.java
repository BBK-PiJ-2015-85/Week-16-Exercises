import  java.io.File;

public class CurrentDirectory {
	private static final String AbsFileName = "\\My Documents\\PiJ Work\\Week-15-Exercises";
	
	public static void main(String[] args) {
		File file = new File(AbsFileName);
		String[] list = file.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
	}
}
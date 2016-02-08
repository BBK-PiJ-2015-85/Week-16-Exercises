import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TemperatureAverages {
	private static final String FILE_NAME = "\\My Documents\\PiJ Work\\Week-16-Exercises\\Temperatures.csv";
	
	public static void main(String[] args) {
		File file = new File(FILE_NAME);				
		int runningTotal = 0;
		int numTemps = 0;
		int lineCount = 0;
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			
			String line;
			while ((line = in.readLine()) != null) {
				int lineTotal = 0;
				int numTotal = 0;
				int marker = 0;
				StringBuilder sb = new StringBuilder();
				sb.append(line);
				String str = sb.toString();
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == ',') {						
						lineTotal += Integer.parseInt(str.substring(marker, i));						
						numTotal++;
						numTemps++;
						marker = i + 2;
					}
				}
				lineCount++;
				runningTotal += lineTotal;
				int average = lineTotal / numTotal;
				System.out.println("Average for line " + lineCount + " " + average + ".");
			}			
			System.out.println("Total average: " + runningTotal / numTemps);
		} catch (FileNotFoundException ex) {
			System.out.println("File not found.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
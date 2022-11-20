package EightLecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTester {

	public static void main(String[] args) {
		
		File inpFile=new File("J:/Java/test.inp");
		File outFile=new File("J:/Java/testClass.out");
		
		try {

			FileReader fileReader = new FileReader(inpFile);

			try {
				FileWriter fileWriter = new FileWriter(outFile);
				// Scanner scanner=new Scanner(fileReader);

				System.out.println("Please type something for write a file: ");
				Scanner scanner = new Scanner(System.in);

				while (scanner.hasNext()) {
					String tempString = scanner.nextLine();

					// System.out.println(tempString);
					fileWriter.write(tempString + "\n");
				}
				fileReader.close();
				fileWriter.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			System.out.println("File not Found");
		}
		
		

	}

}

package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class checkexception {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("D:\\Pratima\\myfile.txt");
			int k;
			// read():read a character
			while ((k = fis.read()) != -1)// -1 to check End of file
			{
				System.out.print((char) k);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error:path is wrong for file,check the path..." + e);

		}
	}

}

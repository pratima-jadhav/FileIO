package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\Pratima\\myfile.txt");
		int i;
		while ((i = fr.read()) != -1) {//End of file(-1)
			System.out.print((char) i);
		}
	}

}

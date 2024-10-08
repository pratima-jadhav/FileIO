package FileIO;
//using try and catch
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckExceptionDemo1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Pratima\\myfile.txt");
			int k;
			// read():read a character
			while ((k = fis.read()) != -1)// -1 to check End of file
			{
				System.out.print((char) k);
			}
			fis.close();
		} catch (IOException e) {
			System.out.println("the path of file is wrong given");
			System.out.println(e.getMessage());

		}

	}

}

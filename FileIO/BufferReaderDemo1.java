package FileIO;

//using try and catch
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo1 {

	public static void main(String[] args) throws IOException {
		try {

			File file = new File("D:\\Pratima\\myfile.txt");
			int i;
			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr, 200);
			// 200:number of ch to read //obj
			String str;
			while ((str = br.readLine()) != null) {
				// to read a line:200 ch
				System.out.println(str);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("the path of file is wrong given");
			System.out.println(e.getMessage());

		}

	}

}

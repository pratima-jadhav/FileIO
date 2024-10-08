package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		//File file = new File("D:\\Pratima\\myfile.txt");
		FileReader fr = new FileReader("D:\\Pratima\\myfile.txt");

		BufferedReader br= new BufferedReader(fr,200);
		//200:number of ch to read				//obj
		String str;
		while((str=br.readLine())!=null ){
		//to read a line:200 ch
		System.out.println(str);
		
	}

	}
}

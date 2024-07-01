package p0701;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_C {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/save/abc.txt");
			BufferedReader br = new BufferedReader(fr); //1줄씩 가져오기
			while(true) {
				String line = br.readLine(); //한줄을 가져오기
				if(line==null) break;
				System.out.println(line);
			}
			fr.close();
			br.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		

		
		
	}//m

}//c

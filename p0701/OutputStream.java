package p0701;

import java.io.File;
import java.io.IOException;

public class OutputStream {
	public static void main(String[] args)  //throws Exception //파일생성, 폴더생성
	    {
		String str = "c:/save1";
		File folder = new File(str);
		File file = new File(str+"/13.txt");
		try {
			if(!(folder.exists())) { //폴더, 파일존재 학인
				System.out.println("폴더를 생성했습니다.");
				folder.mkdir();//폴더생성
		}
			file.createNewFile(); //파일생성
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일이 생성되었습니다.");
	
	}
}



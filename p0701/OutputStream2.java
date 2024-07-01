package p0701;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream2 {

	public static void main(String[] args) throws FileNotFoundException  {

			//1byte씩 저장
			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
			String str = "s0001,홍길동,100,100,100,300,100.0,0\r\n"; //\r 제일 끝에 커서 오게 하는 거
			str += "s0002,유관순,50,50,50,150,50.0,0\r\n";
			byte[] bytes = str.getBytes();
			for(byte b : bytes) {//단순for문
				fos.write(b);
			}	
	
		//try catch 문
//		try {
//			//1byte씩 저장
//			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
//			String str = "s0001,홍길동,100,100,100,300,100.0,0\r\n"; //\r 제일 끝에 커서 오게 하는 거
//			str += "s0002,유관순,50,50,50,150,50.0,0\r\n";
//			byte[] bytes = str.getBytes();
//			for(byte b : bytes) {//단순for문
//	
//					fos.write(b);
//				}	
////			for(int i=0; i<bytes.length; i++) {			
////					fos.write(bytes[i]);
////			}
////			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
//		System.out.println("파일에 글이 저장되었습니다");

	}
}

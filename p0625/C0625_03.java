package p0625;
import java.util.*; //모든 클래스패스를 합침
//import java.util.Date;
//import java.util.Scanner;

public class C0625_03 {

	public static void main(String[] args) {
		Date d = new Date();
		//java.util.Date -> 클래스패스 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("안녕"); //import 생략가능 -> java.lang 패키지여서..
	}

}

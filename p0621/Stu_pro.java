package p0621_01;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Stu_pro {
	static Scanner scan = new Scanner(System.in);
	
	int screen(){
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("---------------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		scan.nextLine(); //enter키 때문
		return choice;
		
	}
}

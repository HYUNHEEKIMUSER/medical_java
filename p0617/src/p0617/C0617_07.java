package p0617;

import java.util.Scanner;

public class C0617_07 {

	public static void main(String[] args) {
		//2개의 문자열을 입력받아서 
		//숫자이면 정수타입으로 변경해서 두 수를 더하는 프로그램구현
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("첫 번째 문자를 입력하세요");
		String str = scan.next(); // next():사이띄우기 전까지 문자열입력, nextLine(): 전부 받을 수 있음
		char ch = str.charAt(0); // charAt(): 문자열을 문자로 변환
		
		System.out.println("두 번째 문자를 입력하세요");
		String str2 = scan.next(); // next():사이띄우기 전까지 문자열입력, nextLine(): 전부 받을 수 있음
		char ch2 = str.charAt(0); // charAt(): 문자열을 문자로 변환
		
		if((ch>='0' && ch <='9') && (ch2 >='0' && ch2 <='9')) {
			int num = ch -'0'; //문자 숫자를 정수형으로 변경
			//int n = Integer.parseInt(str); //문자열을 정수형으로 변경
			int num2 = ch2 -'0';
			System.out.println(num+num2);
		}else {
			System.out.printf("%c, %c \n",ch,ch2);
		}
		
	}

}

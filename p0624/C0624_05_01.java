package p0624;

import java.util.Scanner;

public class C0624_05_01 {

	public static void main(String[] args) {
		//두 개의 수와 1개의 사칙연산 + - * / 을 입력받아 결과값을 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int x = scan.nextInt();
		System.out.println("숫자 입력하세요");
		int x2 = scan.nextInt();
		System.out.println("사칙연산을 입력하세요");
		String str = scan.next();
		
		Calculate cal = new Calculate();
		int result = cal.cal(x,x2,str);
		
	}//M

}//C

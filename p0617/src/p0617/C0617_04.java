package p0617;

import java.util.Scanner;

public class C0617_04 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int n = scan.nextInt();
//		System.out.println("숫자를 입력하세요");
//		int n2 = scan.nextInt();
//		System.out.println("두수의 합: "+(n+n2));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String str = scan.nextLine();
		//string 참조형 변수
		int n = Integer.parseInt(str); // 문자열을 정수형으로 변환
		System.out.println("숫자를 입력하세요");
		String str2 = scan.nextLine();
		int n2 = Integer.parseInt(str2);
		
		System.out.println("두수의 합: "+(n+n2));

	}

}

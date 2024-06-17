package p0614;

import java.util.Scanner;

public class C0614_14 {

	public static void main(String[] args) {
		int a = 10;
		if (a>0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		//-------------------------------------------
		int b = 10;
		if (b==10) {
			System.out.println("10이다");
		}else {
			System.out.println("10이 아니다");
		}
		//-------------------------------------------
		// 입력한 숫자가 양수, 음수인지 출력하고 0은 양수로 출력하기
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		if (num>=0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		
		
	}

}

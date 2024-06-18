package p0618;

import java.util.Scanner;

public class C0618_01_01 {

	public static void main(String[] args) {
		// 주민번호를 입력받아 나이를 출력하시오 1,2 =1900 / 3,4 =2000년생 2024-1988 = 36 /880101-1011111
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String input = scan.nextLine();
		// 7, 0과 2
		String birthN = input.substring(7,8);
		String birthY = input.substring(0,2);
		
		int age = 0;		
		switch(birthN) {
			case "1":
			case "2":
				System.out.println("1900년대 생");
				age = 2024- Integer.parseInt("19"+birthY);
				break;
			case "3":
			case "4":
				System.out.println("2000년대 생");
				age = 2024-Integer.parseInt("20"+birthY);
				break;
		}
		System.out.println("당신의 나이: "+age);
	}

}

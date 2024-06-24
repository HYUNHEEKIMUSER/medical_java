package p0624;

import java.util.Scanner;

public class C0624_05_cal {

	public static void main(String[] args) {
		//두 개의 수와 1개의 사칙연산 + - * / 을 입력받아 결과값을 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int x = scan.nextInt();
		System.out.println("숫자 입력하세요");
		int x2 = scan.nextInt();
		System.out.println("사칙연산을 입력하세요");
		String str = scan.next();
		
		if(str=="+") {
			System.out.println("더하기: "+x+x2);
		}else if(str=="-") {
			System.out.println(x-x2);
		}else if(str=="*") {
			System.out.println(x*x2);
		}else if(str=="/") {
			System.out.println(x/x2);
		}
		
//--------------------------------------
		int result = 0;
		switch(str) {
		case "+":
			result = x+x2;
			break;
		
		
		case "-":
			result = x+x2;
			break;
		
	
		case "*":
			result = x+x2;
			break;
		

		case "/":
			result = x+x2;
			break;
		}

		
		
	}//main

}//class

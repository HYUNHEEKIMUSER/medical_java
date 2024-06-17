package p0614;

import java.util.Scanner;

public class C0614_09 {

	public static void main(String[] args) {
		
		int sca = 0;
		Scanner scan = new Scanner(System.in); //ctrl+space
		
		// 두 숫자를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈 출력
		System.out.println("숫자를 입력하세요");
		String num = scan.nextLine();
		System.out.println("2번째 숫자를 입력하세요");
		String num2 = scan.nextLine();
		
		int number = Integer.parseInt(num);
		int number2 = Integer.parseInt(num2);
		
		System.out.println("입력한 숫자 덧셈: "+(number+number2));
		System.out.println("입력한 숫자 뺄셈: "+(number-number2));
		System.out.println("입력한 숫자 곱셈: "+(number*number2));
		System.out.println("입력한 숫자 나눗셈: "+(number/number2));
		//혹은------------------------------------------------------------------------------------------
		System.out.println("3번째 숫자를 입력하세요");
		int num3=scan.nextInt();
		System.out.println("4번째 숫자를 입력하세요");
		int num4=scan.nextInt();
		
		System.out.println("입력한 숫자 덧셈: "+(num3+num4));
		System.out.println("입력한 숫자 뺄셈: "+(num3-num4));
		System.out.println("입력한 숫자 곱셈: "+(num3*num4));
		System.out.println("입력한 숫자 나눗셈: "+(num3/num4));

	}

}

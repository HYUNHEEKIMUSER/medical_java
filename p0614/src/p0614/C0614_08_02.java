package p0614;

import java.util.Scanner;

public class C0614_08_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자는 nextInt(), nextDouble()
		System.out.println("숫자를 입력하세요");
		//int num = scan.nextInt();
		
		
		String num = scan.nextLine();
		System.out.println("숫자 2를 입력하세요");
		String num2 = scan.nextLine();
		
		//기본형 타입 같은 경우, 형 변환
		//string 참조형 타입
		
		int number=Integer.parseInt(num); //참조형 문자열 타입을 정수형 타입으로 변경
		int number2=Integer.parseInt(num2); 

		System.out.println("입력한 숫자: "+number+number2);
		System.out.println("입력한 숫자: "+(number+number2));
	}

}

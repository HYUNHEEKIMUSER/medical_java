package p0624;

import java.util.Arrays;
import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 두 수를 입력받아 두 수를 더한 값을 출력하시오
		System.out.println("첫번쨰 숫자 입력");
		int num = scan.nextInt();
		System.out.println("두번쨰 숫자 입력");
		int num2 = scan.nextInt();
		
		System.out.println("두 수의 합: "+(int)num+num2);
		
		int[] number = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("세번째 숫자 입력");
			int num3 = scan.nextInt();
			System.out.println("세 숫자의 합: "+(int)num+num2+num3);
			
			number[i]=scan.nextInt();
		
			System.out.println(Arrays.toString(number));
		}
	
	}//main

}//class

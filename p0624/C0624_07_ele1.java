package p0624;

import java.util.Arrays;

public class C0624_07_ele1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int [] result =new int[4];

		//Element의 메소드를 활용하여 a와 b의 사칙연산 결과밧을 출력
		
		
		Element1 e = new Element1();
		e.allCal(a, b, result);
		
		System.out.println(Arrays.toString(result));
		
	
	}
}


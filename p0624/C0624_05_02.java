package p0624;

import java.util.Scanner;

public class C0624_05_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr= new int[2];
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자를 입력하세요");
			arr[i] = scan.nextInt();
		}
		System.out.println("사칙연산 입력");
		String str = scan.next();
		
		Calculate c = new Calculate();
		int result = c.cal(arr,str);

	}

}

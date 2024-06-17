package p0617;

import java.util.Scanner;

public class C0617_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 10번 입력 받을 때마다 합계를 출력
		// 5-> 5, 10->15, 10번을 출력하시오
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			System.out.println("숫자를 입력하세요");
//			int num = scan.nextInt();
//			sum += num;
//			System.out.println("합계: "+sum);

			
		//구구단 중첩 for문
		for(int j=2; j<=9; j++) {
			System.out.printf("[%d 단]\n",j);
			for(int a=1; a<=9; a++) {
				System.out.println(j+"*"+a+"="+j*a);
				System.out.printf("%d * %d = %d \n",j,a,j*a);
			}
		}

	}
}

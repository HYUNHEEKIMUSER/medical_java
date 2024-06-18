package p0618;

import java.util.Scanner;

public class C0618_07 {

	public static void main(String[] args) {
		// 10개짜리 배열을 생성하고 숫자를 10번 입력받아 3,4번째 숫자만 출력하시오
		Scanner scan = new Scanner(System.in);
		int[] score = new int[10];
		for(int i=0; i<score.length; i++) {
			System.out.println("숫자를 입력하세요");
			score[i] = scan.nextInt();
		}
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.printf("2번째, 3번째 입력값: %d, %d \n",score[2],score[3]);
	
	}
}

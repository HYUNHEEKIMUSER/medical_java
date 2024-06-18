package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_05 {

	public static void main(String[] args) {
		// 5개의 숫자를 모두 입력받은 후 출력을 모두 하시오
		
		for(int i=0; i<5; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int input = scan.nextInt();
			System.out.println(input);
		}
		
		// 배열: 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		// int[] score = new int[5];
		
		int[] score = new int[5];
		int score[] = new int[5]; //이것도 가능
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		System.out.println(score[3]);
		//---------------------------------------------------
		for(int i=0; i<5; i++) {
			score[i]=i+1;
			System.out.println(score[i]);
		}
		//---------------------------------------------------
		for(int i =0; i<5; i++) {
			System.out.println("숫자를 입력하세요");
			score[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(score)); //배열의 모든 데이터 확인 메소드
		System.out.println(score); // score의 주소값
	}

}

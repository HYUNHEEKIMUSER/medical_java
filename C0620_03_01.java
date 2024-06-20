package p0620;

import java.util.Scanner;

public class C0620_03_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int STU = 10;
		int[][] score = new int[STU][4]; // 국어,영어,수학,합계
		
		score[0][0] = 1;
		score[0][1] = 2;
		score[0][2] = 3;
		score[0][3] = 4;
		
		System.out.println(score[0][3]);
		
		for(int i=0; i<5; i++) {
			score[0][i]=i+1;
			System.out.println(score[0][i]);
		}
	}

}

package p0624;

import java.util.Scanner;

public class C0624_06_calculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];

		int kor = 100;
		int eng = 99;
		int math = 100;
		System.out.println("현재 국어점수: "+kor);
		System.out.println("현재 영어점수: "+eng);
		System.out.println("현재 수학점수: "+math);

		
		Calculation c = new Calculation();
		c.change1(score);
		
		
		System.out.println("변경 국어점수: "+score[0]);
		System.out.println("변경 영어점수: "+score[1]);
		System.out.println("변경 수학점수: "+score[2]);
		
	
	}
	

}

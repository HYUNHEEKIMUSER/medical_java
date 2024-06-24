package p0624;

import java.util.Scanner;

public class C0624_06_01 {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int[] score = new int[3];
		score[0] = 100;
		score[1] = 99;
		score[2] = 90;
		
		int kor = 100;
		int eng = 100;
		int math = 100;
		
		Calculation c = new Calculation();
		c.change(kor, eng, math);
		
		System.out.println("변경 국어점수: "+kor);
		System.out.println("변경 영어점수: "+eng);
		System.out.println("변경 수학점수: "+math);
		
		score[0] = c.korchange(kor);
		score[1] = c.engchange(eng);
		score[2] = c.mathchange(math);
		
		System.out.println("변경 국어점수: "+score[0]);
		System.out.println("변경 영어점수: "+score[1]);
		System.out.println("변경 수학점수: "+score[2]);
	}
}

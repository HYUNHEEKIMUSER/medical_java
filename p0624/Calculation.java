package p0624;

import java.util.Scanner;

public class Calculation {
	static Scanner scan = new Scanner(System.in);
	
	//메소드 1개를 사용해서 처리하는 방법
	void change(int kor, int eng, int math) { // return 필요없음
		System.out.println("변경 국어점수를 입력하세요");
		kor = scan.nextInt();
		System.out.println("변경: "+kor);
		
		System.out.println("변경 영어점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("변경: "+eng);
		
		System.out.println("변경 수학점수를 입력하세요");
		math = scan.nextInt();
		System.out.println("변경: "+math);
	}
//----------------------------------------------------------------------------------------
	void change1(int[] score) { // return 필요없음
		System.out.println("변경 국어점수를 입력하세요");
		score[0] = scan.nextInt();

		System.out.println("변경 영어점수를 입력하세요");
		score[1] = scan.nextInt();

		System.out.println("변경 수학점수를 입력하세요");
		score[2] = scan.nextInt();

	}
	
//---------------------------------------------------------------------------------------
	int korchange(int kor) {
		System.out.println("변경 국어점수를 입력하세요");
		kor = scan.nextInt();
			
		return kor;
		
	}
	
	int engchange(int eng) {
		
		System.out.println("변경 영어점수를 입력하세요");
		eng = scan.nextInt();
		
		
		return eng;
	}
	int mathchange(int math) {
		
		System.out.println("변경 수학점수를 입력하세요");
		math = scan.nextInt();
		
		
		return math;
	}
}

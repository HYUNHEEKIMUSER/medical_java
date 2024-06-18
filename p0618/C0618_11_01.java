package p0618;

import java.util.Scanner;

public class C0618_11_01 {

	public static void main(String[] args) {
		// 입력으로 2명의 학생의 성적을 입력받아 출력
		Scanner scan = new Scanner(System.in);
		int[][] score= new int[2][3];
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("점수를 입력하세요");
				score[i][j] = scan.nextInt();
			}
		}
		//2명의 학생성적 출력
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(); //줄단락 바꾸기??
		}

	}//단락

}//단락

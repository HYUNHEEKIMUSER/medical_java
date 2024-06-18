package p0618;

import java.util.Scanner;

public class C0618_12 {

	public static void main(String[] args) {
		// 3,3 홍길동 유관순 이순신 성적 출력
		int[][] score = new int[3][3];
		String[] name = new String[3];
		Scanner scan = new Scanner(System.in);
		
		String[] title = {"이름","국어","영어","수학"};
		
		for(int i=0; i<3; i++) {
			System.out.println(title[0]+"을 입력하세요");
			name[i] = scan.next();
			for(int j=0; j<3; j++) {
				System.out.println(title[j+1]+"을 입력하세요");
				score[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<title.length; i++) {
			System.out.println(title[i]+"\t");
		}
		System.out.println();
		System.out.println("--------------------");
		
		for(int i=0; i<3; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<3; j++) {
				System.out.print(score[i][j]+"\t");
				
			}
			System.out.println();
		}

	}//단락

}//단락

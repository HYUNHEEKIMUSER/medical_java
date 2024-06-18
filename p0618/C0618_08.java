package p0618;

import java.util.Scanner;

public class C0618_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 로또번호 생성 - 1-45번 - 6개
		int[] ball = new int[45];
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		// 로또번호 섞기
		int no = 0; //랜덤번호
		int store = 0; //값을 저장
		for(int i=0; i<300; i++) {
			no = (int)(Math.random()*45);
			store = ball[0];
			ball[0] = ball[no];
			ball[no] = store;
		}
		//내 로또번호 입력
		int[] myArr = new int[6];
		for(int i=0; i<myArr.length; i++) {
			System.out.printf("%d번째 숫자 입력하세요",i+1);
			myArr[i] = scan.nextInt();
		}
		System.out.print("입력한숫자: ");
		for(int i=0; i<myArr.length; i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		
		//로또번호 출력
		System.out.print("로또번호: ");
		for(int i=0; i<myArr.length; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
	}//단락

}//단락






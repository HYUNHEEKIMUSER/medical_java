package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_07_01 {

	public static void main(String[] args) {
		// 로또번호 45개 배열을 생성
		// 1-45까지 숫자를 입력하고
		// 1-45까지 숫자 중 myArr 6개를 입력받아 출력하시오
		Scanner scan = new Scanner(System.in);
		
		//반복무능로 1-45 숫자를 생성
		int[] ball = new int[45];
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		//랜덤섞기
		int no = 0; //랜덤번호
		int t_value = 0; //값을저장
		for(int i=0; i<300; i++) {
			no = (int)(Math.random()*45); //0-44번째 방 
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
			
		}
		
		int[] myArr = new int[6];
		for(int i=0; i<myArr.length; i++) {
			System.out.printf("%d번째 숫자를 입력하세요(1-45까지의 숫자)",i+1);
			myArr[i] = scan.nextInt();
		}
		//print ->옆으로 나오는 것
		System.out.print("입력한 숫자: ");
		for(int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		
		
		//System.out.println(Arrays.toString(ball));
	}

}

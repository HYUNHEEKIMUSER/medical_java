package p0617;

import java.util.Scanner;

public class C0617_15_01 {

	public static void main(String[] args) {
		// 1부터 10까지 랜덤숫자 생성해서 숫자 1개를 입력받아 정답인지 아닌지 출력
		//같으면 당첨, 다르면 틀렸다고 출력
		
		int num = (int)(Math.random()*10)+1;
		System.out.println("랜덤숫자: "+num);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num2 = scan.nextInt();
		
		if(num==num2) {
			System.out.println("당첨");
		}else {
			System.out.println("틀렸습니다.");
		}
		//---------------------------------------------
		
		int num3 = (int)(Math.random()*10)+1;
		int input = scan.nextInt();
		
		if(input == num3) {
			System.out.println("당첨");
		}else {
			System.out.println("틀림");
		}
	}

}

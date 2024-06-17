package p0617;

import java.util.Scanner;

public class C0617_08_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 숫자를 입력받아 양수, 음수, 0입니다. 출력될 수 있도록 구현, 0은 양수로 출력
		System.out.println("숫자를 입력하세요");
		
		int x = scan.nextInt();
		String str = x>0? "양수":(x==0? "0입니다":"음수");
		System.out.println(str);
		
		
//		System.out.println("숫자를 입력하세요");
//		int x = scan.nextInt();
//		int absX = x>=0? x:-x;
//		System.out.println(absX);
	}

}

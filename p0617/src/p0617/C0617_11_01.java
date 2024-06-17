package p0617;

import java.util.Scanner;

public class C0617_11_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("프로그램을 종료할까요?(종료:x)");
		String str = scan.next();
		
		
		if(str.equals("x") || str.equals("X")){
			//(str.equalsIgnoreCase("x"))와 같음
			System.out.println("프로그램을 종료합니다.");
		}else {
			System.out.println("프로그램을 계속 실행합니다.");
		}

		
	}

}

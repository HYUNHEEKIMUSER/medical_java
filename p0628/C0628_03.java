package p0628;

import java.util.Scanner;

public class C0628_03 {

	public static void main(String[] args) {
		// 문자열을 입력받아 2번째 문자를 출력하시오
		// 문자열이 3칸 미만으로 입력되면 다시 입력하고 무한반복으로 하는데 x가 입력되면 프로그램 종료 
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("문자를 입력하세요 (x는 종료)");
			String str = scan.nextLine();
			if(str.equalsIgnoreCase("x")){
				System.out.println("프로그램을 종료합니다");
				break;
				}
			if(str.length()<3) {
				System.out.println("다시 입력하세요");
				continue;
			}
			char ch = str.charAt(1);
			System.out.println(ch);
			break;
		}
	}//m

}//c

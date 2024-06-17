package p0617;

import java.util.Scanner;

public class C0617_08_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 10;
		if(a>0) {
			System.out.println("양수입니다.");
		}else if(a==0) {
			System.out.println("0입니다");
		}else {
			System.out.println("음수입니다");
		}
		if(a>0) System.out.println("양수입니다");
		else if(a==0) System.out.println("0입니다");
		else System.out.println("음수입니다.");
	}

}

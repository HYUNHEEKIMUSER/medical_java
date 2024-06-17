package p0617;

import java.util.Scanner;

public class C0617_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str = scan.nextLine();
		System.out.println("입력한 문자의 길이: "+str.length());
		
		// string->== 사용안되고 equals
		// str.equalsIgnoreCase("c") 이렇게 해도 됨                                                                     

	}

}

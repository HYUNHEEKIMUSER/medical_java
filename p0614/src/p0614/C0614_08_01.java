package p0614;

import java.util.Scanner;

public class C0614_08_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//java.util.Scanner scan2 = new java.util.Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str = scan.next();
		
		// 문자열 - next()->한칸 띄우기 전까지만 입력받음, enter키를 입력 받지 않음
		// 문자열 - nextLine()->문자 사이띄우기 가능
		System.out.println("2번째 입력한 문자: "+str);
		String str2 = scan.next();		
		System.out.println("입력한 문자2: "+str2);
		scan.nextLine();
		
		System.out.println("3번째 문자입력하세요");
		String str3 = scan.nextLine();
		System.out.println("입력한 문자3: "+str3);
	}

}

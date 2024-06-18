package p0618;

import java.util.Scanner;

public class C0618_02 {

	public static void main(String[] args) {
		// if문으로 변경
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호 입력하세요");
		String input = scan.nextLine();
		
		String birth = input.substring(0,2);
		String birthY= input.substring(7,8);
		
		int age = 0;
		if(birthY == "3" || birthY == "4" ){
			System.out.println("2000년대생 입니다.");
			age = 2024 - Integer.parseInt("20"+birth);
			System.out.println("당신의 나이: "+age);
		}else if(birthY == "2" || birthY == "1"){
			System.out.println("1900년대생 입니다.");
			age = 2024 - Integer.parseInt("19"+birth);
			System.out.println("당신의 나이: "+age);
		}
		//----------------------------------------
		
		if(birthY.equals("1") || birthY.equals("2")) {
			age = 2024 - Integer.parseInt("19"+birth);
		}else if(birthY.equals("3") || birthY.equals("4")) {
			age = 2024 - Integer.parseInt("20"+birth);
		
	}

}

package p0617;

import java.util.Scanner;

public class C0617_04_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char ch ='A'; //65
		char ch2 = 'B'; //66
		System.out.println(ch+ch2); //char는 사칙연산에서 int로 변함

		int a = 1000000;
		int b = 1000000;
		System.out.println((long)a*b);
		
		char ch3 = 'a';
		System.out.println((char)(ch3-32));
		
		char ch4 = 'A';
		System.out.println((char)(ch4+32)); 
		
		char ch5 = '3';
		char ch6 = '2';
		System.out.println(ch5+ch6); // 0:48 1:49...
		// 문자 숫자 타입을 정수타입으로 변경하는 방법: '0'문자의 0을 빼줌
		System.out.println((ch5-'0')+(ch6-'0'));
		
	}

}

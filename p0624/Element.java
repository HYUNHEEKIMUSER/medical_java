package p0624;

import java.util.Scanner;

public class Element {
	Scanner scan = new Scanner(System.in);
	int result = 0;
	void calculation(int[] score) {
		System.out.println("사칙연산 입력");
		String str = scan.next();
		switch(str) {
		case "+":
			result = score[0]+score[1];
			break;
		case "-":
			result = score[0]-score[1];
			break;
		case "*":
			result = score[0]*score[1];
			break;
		case "/":
			result = score[0]/score[1];
			break;
			
		}
	}
}

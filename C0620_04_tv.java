package p0620;

import java.util.Scanner;

public class C0620_04_tv {

	public static void main(String[] args) {
		// 객체지향언어->class
		// class는 묶음
		
		//변수 선언
//		Scanner scan = new Scanner(System.in);
//		String color = "white";
//		boolean power = false;
//		int channel =0;
//		//volume, size,.... 
//		
//		while(true) {
//			System.out.println("1. TV 켜기");
//			System.out.println("1. TV 끄기");
//			System.out.println("-------------------------------");
//			System.out.println("TV의 상태를 선택하세요");
//			int choice = scan.nextInt();
//		}
		
		// TV의 변수 선언
		int num = 0;
		String str = new String("aaa");
		
		// 객체선언
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
		// 클래스타입 참조변수명 = new 클래스타입();
		Tv Tv1; // 개체를 다루기 위한 참조변수가 선언이 됨
		Tv1= new Tv(); // 객체생성한 후 생성된 객체의 주소를 참조변수에 저장 시켜줌
		// 또는
		Tv t2 = new Tv();
	
		int[] a; // 배열을 다루기 위한 참조변수가 선언
		a = new int[5];//배열 생성 후 생성된 배열의 주소를 참조변수에 저장 시켜줌
		

//		t1.color = "white";
//		t1.power = false;
//		t1.channel = 0;
		
		
		
		

	}//main

}//class

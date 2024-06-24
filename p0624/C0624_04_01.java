package p0624;

import java.util.Scanner;

public class C0624_04_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] num = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+"번째 숫자");
			num[i] = scan.nextInt();
		}//객체선언 후 참조변수명.메소드명
		
		Cal c = new Cal(); //객체선언
		int result = c.add(num[0], num[1], num[2]);
		
		int sum = c.add(num);
		
		System.out.println("더하기 합계: "+result);
		
		
//		int sum=0;
//		for(int i=0; i<3; i++) {
//			num[i]=scan.nextInt();
//			sum+=num[i];
//		}
//		System.out.println(sum);
		
//		int sum1=0;
//		for(int i=0; i<3; i++) {
//			sum1+=num[i];
//		}
//		System.out.println(sum1);
//		
//		System.out.println(num[0]+num[1]+num[2]);
	}//main
}//class

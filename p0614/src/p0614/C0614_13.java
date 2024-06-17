package p0614;

import java.util.Scanner;

public class C0614_13 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int)(pi*1000)/1000f;
		System.out.println(shortPi);

	
		
		//입력한 숫자를 소수점 2자리 절사하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 소숫점 5자리까지");
		double num = scan.nextDouble();
		double shortNum = (int)(num*100)/100d; // 절사, floor
		//double shortNum = Math.round(num*100)/100d; // 반올림 (소숫점 3자리에서 반올림하니까 100)
		//double shortNum = Math.ceil(num*100)/100d; // 올림 
		//double shortNum = Math.floor(num*100)/100d; // 버림
		System.out.println(shortNum);
		
	}

}

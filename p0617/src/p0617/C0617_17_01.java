package p0617;

import java.util.Scanner;

public class C0617_17_01 {

	public static void main(String[] args) {
		// 1-100까지 합을 구하는데 sum 값이 150을 넘을 때 i, sum값을 출력
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			System.out.println("1~100까지의 합: "+sum);
			if(sum>=150) {
				System.out.println("i의 값: "+i);
				System.out.println("sum의 값: "+sum);
				break;
			}
		}
		// ------------------------------------------------------
		int sum2 = 0;
		int i2 = 0;
		for(i2=1; i2<=100; i2++) {
			sum2 += i2;
			if(sum2>=5) break;
		}
		System.out.println("i2: "+(i2-1)); //if문이 위에 있으면 -1을 해야 함
		System.out.println("합계: "+sum2);
	}

}

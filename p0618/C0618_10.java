package p0618;

import java.util.Scanner;

public class C0618_10 {

	public static void main(String[] args) {
		// 1-100까지 랜덤숫자를 생성해서 랜덤숫자를 맞추는 프로그램 구현
		// 10번까지 입력가능하도록 구현
		
		Scanner scan = new Scanner(System.in);
		int r_num = (int)(Math.random()*100)+1;
		int i = 0;
		int sum = 0;
		while(i<10) {
			System.out.println("숫자를 입력하세요");
			int input = scan.nextInt();
			sum += i;
			if(input>r_num) {
				System.out.println("작은 수를 입력하세요");
				continue;
			}else if(input<r_num){
				System.out.println("큰 수를 입력하세요");
				continue;
			}
			i++;
		System.out.println("랜덤숫자: "+r_num);
		System.out.println("그동안 입력했던 숫자: "+input);
			
			
		}
		

	}

}

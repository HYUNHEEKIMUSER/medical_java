package p0617;

import java.util.Scanner;

public class C0617_10 {

	public static void main(String[] args) {
		//숫자를 입력받아 60점 이상이면 합격, 미만이면 불합격
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = scan.nextInt();
		String num1 = num >=60? "합격":"불합격";
		System.out.println(num1);
		
		//90점 이상 -> A...
		
		System.out.println("점수를 입력하세요");
		
		int num2 = scan.nextInt();
		String num3 = num2 >= 90? "A":(num2 >= 80? "B":(num2 >= 70? "C":(num2>=60? "D":"F"))); 
		System.out.println(num3);
		
		//혹은
		
		int number = scan.nextInt();
		if(number>=90)
			System.out.println("A");
		else if(number>=80)
			System.out.println("B");
		else
			System.out.println("F");
		System.out.println(number);
	}

}

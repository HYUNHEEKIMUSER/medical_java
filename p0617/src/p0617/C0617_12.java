package p0617;

import java.util.Scanner;

public class C0617_12 {

	public static void main(String[] args) {
		//점수를 입력받아 90점이상 A... 구현
		//90~92 A-, 97~100 A+, 80~82 B- 97~89 B+
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		int num = scan.nextInt();
		String number = num>=92? "A+":(num>=90? "A-":
			num>=82? "B+":(num>=80? "B-":
				num>=72? "C+":(num>=70? "C-":
					num>=62? "D+":(num>=60? "D-":num>60? "F":"F"))));
		System.out.println(number);
		
		
		//혹은--------------------------------------------------------

		System.out.println("점수를 입력하세요>>");
		int num2 = scan.nextInt();
		String score = "";
		if(num2>=90) {
			score = "A";
			if(num2>=97) score= score+"+";
			else if(num2<=92) score = score+"-";}
		else if(num2 >= 80) {
			score = "B";
			if(num2>=87) score= score+"+";
			else if(num2<=82) score = score+"-";}
		else if(num2 >= 70) {
			score = "C";
			if(num2>=77) score= score+"+";
			else if(num2<=72) score = score+"-";}
		else if(num2 >= 60) {
			score = "D";
			if(num2>=67) score= score+"+";
			else if(num2<=62) score = score+"-";}
		else {
			System.out.println("F");}
		System.out.println("학점: "+score);
	}

}

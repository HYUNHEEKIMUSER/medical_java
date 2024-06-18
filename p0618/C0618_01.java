package p0618;

import java.util.Scanner;

public class C0618_01 {

	public static void main(String[] args) {
		// 주민번호 앞자리를 입력받아 계절을 출력하기
//		String str = "990101";
//		String birthM = str.substring(2,4);
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 앞자리를 입력하세요");
		String input = scan.nextLine();
		//switch문을 사용해서 12-02: 겨울, 03-05: 봄....
		String birthM = input.substring(2,4);
//		System.out.println(birthM);
		
		switch(birthM) {
			case "01":
			case "02":
			case "12":
				System.out.println("겨울");
				break;
			case "03":
			case "04":
			case "05":
				System.out.println("봄");
				break;
			case "06":
			case "07":
			case "08":
				System.out.println("여름");
				break;
			case "09":
			case "10":
			case "11":
				System.out.println("가을");
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
		}
		
			
				
	}

}

package p0617;

public class C0617_15 {

	public static void main(String[] args) {
		Math.random(); // 0 <= x && x < 1
		System.out.println(Math.random());
		
		// 1-10까지 랜덤숫자를 출력
		int num = (int)(Math.random()*10)+1;
		System.out.println(num);
		
		//1-100까지 생성 출력
		int num2 = (int)(Math.random()*100)+1;
		System.out.println(num2);
		
		//0-4까지 출력
		int num3 = (int)(Math.random()*5);
		System.out.println(num3);

		//0-19까지 출력
		int num4 = (int)(Math.random()*20);
		System.out.println(num4);
		
		//0-9까지
		int num5 = (int)(Math.random()*10);
		System.out.println(num5);
		
		//2부터 10까지
		int num6 = (int)(Math.random()*9)+2;
		System.out.println(num6);
		
		//1부터 100까지 숫자를 랜덤으로 생성해서 출력하시오
		int num7 = (int)(Math.random()*100)+1;
		System.out.println(num7);
		
		//1부터 3까지 랜덤숫자 생성
		int num8 = (int)(Math.random()*3)+1;
		System.out.println(num8);
		
		//1부터 45까지
		int num9 = (int)(Math.random()*45)+1;
		System.out.println(num9);
	}

}

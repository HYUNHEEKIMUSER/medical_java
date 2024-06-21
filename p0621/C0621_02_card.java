package p0621_01;

public class C0621_02_card {

	public static void main(String[] args) {
		//c1: heart 7 c2: spade 4
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "Heart";
		c2.kind = "Spade";
		
		c1.number = 7;
		c2.number = 4;
		
		c1.width = 50; // 클래스 변수-> 이렇게 쓰지 않도록 하기
		c1.height = 80;
		
		System.out.printf("모양:%s, 숫자:%d \n",c1.kind,c1.number);
		System.out.printf("모양:%s, 숫자:%d \n",c2.kind,c2.number);
		System.out.printf("c1 = 가로:%s, 세로:%d \n",c1.width,c1.height);
		System.out.printf("c2 = 가로:%s, 세로:%d \n",c2.width,c2.height);
		
		Card.width = 50;
		Card.height = 80;//클래스변수는 되도록이면 클래스명.변수명으로 쓰도록 함..
		
	}//main

}//class

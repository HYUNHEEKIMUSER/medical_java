package p0621_01;

public class Card {
	
	//기본생성자->아무 내용도 없는 것
	Card(){}
	Card(String kind, int number){
		//kind = kind; //지역변수를 제일 먼저 찾아감 -> 아래의 인스턴스를 찾아가야 되는데 위의 지역변수를 찾아가서 문제임
		this.kind = kind; // 아래 인스턴스로 찾아가기 위해서 this 붙임
		this.number = number;
	}
	
	String kind; //인스턴스
	int number; // 인스턴스
	static int width = 100; //클래스
	static int height = 250; //클래스
}

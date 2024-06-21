package p0621_01;

public class C0621_01_01 {
	//method(지역변수(메서드 벗어나면 소멸)), class(인스턴스변수(객체선언 후에 사용 참조변수명.변수명) 클래스변수(객체선언없이 사용 static 클래스명.변수명)) 3가지 있음
	int i = 0;
	static int j =0;
	void add() {
			int i = 0;
			}
		void add2() {
			int i = 0;
		}
		
	public static void main(String[] args) {
		//객체선언
		C0621_01_01 c = new C0621_01_01();
		c.i = 10;
		C0621_01_01.j = 10;
		j = 10; // 클래스변수는 같은 클래스 내에서는 클래스명 생략가능
		
		
		int j = 100; // 지역변수 메소드 내에 선언되어 있음
		System.out.println(j);
		
	}//main

}//class

//method (뒤에 괄호가 있으면.. ex)change(d.x)) -> 파이썬의 함수
//인스턴스 메서드, 클래스 메서드 2가지 있음
//int add(int a,int b)
//리턴타입 메서드이름(매개변수들)
//void->리턴이 없다 main ->메서드 이름 args ->매개변수
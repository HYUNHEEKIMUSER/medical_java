package p0624;

public class C0624_08 {

	public static void main(String[] args) {
		
		println_boolean();
		println_char();
		
		int a = 10;
		int a = 100;
		
		
		
		
		// 5 factorial 5*4*3*2*1
		int result = 1;
		for(int i=5; i>0; i-- ) {
			result *=i;
		}
		// change()
		C0624_08 c = new C0624_08();
		c.change();
		
		System.out.println(result);
		add(); //객체선언 없이 클래스명.메소드명 같은 클래스내에서는 클래스명 생략가능
	}
	void change() {//인스턴스 메소드 - 객체선언 후 참조변수명.메소드명
		
	}
	static void add() {
		
	}

}

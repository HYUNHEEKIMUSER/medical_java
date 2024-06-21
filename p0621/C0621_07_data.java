package p0621_01;

public class C0621_07_data {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x: "+d.x);
		System.out.println("------------------");
		
		C0621_07_data c = new C0621_07_data(); //->객체
		change(d.x); // -> 클래스 메소드 객체선언없이 사용
		
		System.out.println("change호출 후 d,x: "+d.x);
	}
	//void -> 리턴타입 없다
	//static 객체선언 없이 사용할 수 있어서 C0621_07_data c = new C0621_07_data(); 생략가능
	//static없으면 객체선언 필요
	//메소드(change) 벗어나면 지역번수(int x) 없어짐
	static void change(int x) {
		x=1000;
		System.out.println("change x: "+x);
	}
}

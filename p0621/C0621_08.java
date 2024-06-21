package p0621_01;

public class C0621_08 {

	public static void main(String[] args) {
		Data d = new Data(); // 객체선언 d: 참조형 변수
		d.x = 10;
		System.out.println("d.x: "+d.x);
		System.out.println("------------------");
		
		change(d); // d: 참조형 변수
		
		System.out.println("change호출 후 d,x: "+d.x);
		
		for(int i=0; i<5; i++) {
			
		}
		for(int i=0; i<5;i++) {
			
		} // for문의 i가 상관없는 것처럼 static간의 객체도 상관없음
		
	}
	
	static void change(Data d2) {
		d2.x=1000;
		System.out.println("change x: "+d2.x);
	}
}

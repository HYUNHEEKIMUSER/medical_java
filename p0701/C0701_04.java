package p0701;

public class C0701_04 {

	public static void main(String[] args) {
		//싱글스레드
		for(int i=0; i<300; i++) {
			System.out.println(i+" : "+"-");
		}
		for(int i=0; i<300; i++) {
			System.out.println(i+" : "+"|");
		}
		
		//객체 선언 후 참조변수명. 메소드명
		C0701_04 c = new C0701_04();
		int n = c.max(20,10);
		System.out.println(n);
		
	}//m
	int max(int a, int b) { //인스턴스 메소드
		return a>b? a:b;
	}
	

	
}//c

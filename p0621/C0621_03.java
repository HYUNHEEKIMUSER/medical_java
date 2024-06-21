package p0621_01;

public class C0621_03 {

	public static void main(String[] args) {
		// 리턴은 한 개만 있는 것이 좋다
		C0621_03 c = new C0621_03(); //참조변수명.메서드명
		int result = c.add(10, 5);
		System.out.println(result);
		
	}//main
	
	//메서드 선언
	//리턴타입과 리턴결과값은 타입이 같아야 함
	int add(int a, int b) {
		int result = a + b; // 지역변수 ->메서드 내에 있어서
		return result;
	}
	void add2(int a, int b) {
		//void(리턴타입)이면 return이 필요없음.
		System.out.println(a+b);
	}
}//class

package p0627;

public class C0627_05 {

	public static void main(String[] args) throws Exception{
		method1();
		try {
			method1();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");
	}
	static void method1() throws Exception{
		method2();
	}
	static void method2() throws Exception{
		
//		throw new Exception(); // 강제 예외처리			

//		try {
//			throw new Exception(); // 강제 예외처리			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}//m
}//c
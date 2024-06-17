package p0614;

public class C0614_04 {
	
	static int num; //클래스 내 변수 - 자동으로 초기화가 됨
	
	
	//method 내에서는 무조건 변수값을 초기화를 해야 함.
	public static void main(String[] args) {
		int score = 0; // 자동으로 초기화가 되지 않음. 그래서 무조건 초기화 필요
		System.out.println(score);
		System.out.println(num);
	}

}

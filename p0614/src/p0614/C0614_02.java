package p0614;

public class C0614_02 {

	public static void main(String[] args) {
		int score = 0; // 변수(score)는 초기화(0) 없이 사용 불가능
		System.out.println(score);
		
		//문자형
		char ch = 'a';
		char ch2 = 'a';
		char ch3 = 'b';
		
		//참조형 변수, 기본형 타입 외에 모든 참조형 타입은 new 연산자를 사용해야 함
		String str = new String("abc");
		System.out.println(str);
		//new를 안쓰는 건 string만 예외임 string은 기본형이 아닌 참조형인데 예외로 둠
		String str2 = "abcde";
		System.out.println(str2);

		int max = 10;
		max = 30;
		
		System.out.println(max);
		final int MIN = 20; //MIN 대문자로 설정해놔서 상수임을 알림
		//min = 10; - final로 이미 지정해놔서(상수) 더이상 바꿀 수 없음
		System.out.println(MIN);
		
	}

}

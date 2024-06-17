package p0614;

public class C0614_05 {

	public static void main(String[] args) {
		char ch = 'A';
		char ch2 = ' ';
		//char ch3 = null; 안됨 
		String str = "AA";
		String str2 = "";
		String str3 = null;
		
		String s1 = "A"+"B";
		System.out.println(s1);
		System.out.println(""+7+7+7); // 문자열+ 어떤 타입 =  문자열타입으로 변경
		System.out.println(7+7+7+""); // 숫자이지만 타입은 문자임 ""->문자열로 바꿈
		System.out.println(7+7+7+""+7); // 숫자이지만 타입은 문자임 217 (이 일 칠 이라고 따로 읽음)
		
	
	
	}

}

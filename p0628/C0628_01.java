package p0628;

public class C0628_01 {

	public static void main(String[] args) {
		int a = 0;
		for(int i=0; i<5; i++) {
			a = a+1; // 제일마지막 번호만 남음
		}
		System.out.println(a);
		
		String b = "0";
		for(int i=0; i<5; i++) {
			b = b+1;
		}
		System.out.println(b);
		
//		char ch = ''; 안됨
		char ch = ' '; //가능
		
		String str = "";//가능
		String str2 = " "; //가능
		
		
		
	}//m
}//c

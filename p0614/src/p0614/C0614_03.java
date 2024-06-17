package p0614;

public class C0614_03 {
	public static void main(String[] args) {
		
		boolean power = true;
		char ch = 'A';
		
		System.out.println(ch); // sysout + ctrl+ space bar (실행은 ctrl+f11)
		
		char ch2 = '\u0041';
		System.out.println(ch2);

		char ch3 = 'A';
		System.out.println((int)ch3); // 아스키코드
		
		int a = 65;
		System.out.println(a);
		System.out.println((char)a); //ctrl+alt+방향키 하면 복사
		
		int hex = 0x100;
		System.out.println(hex); //16진수
	}

}

package p0614;

public class C0614_06 {

	public static void main(String[] args) {
		float f = 1.6f;
		int i =(int)f; //float 타입을 int 타입으로 변경
		System.out.println(i);
		
		int n = 10;
		float fl = n;
		System.out.println(n);
		System.out.println(fl);
		
		int n2 = 65;
		char ch = (char) n2; 
		System.out.println(ch); //아스키 코드
		
		char ch2 = 'a';
		int n3 = ch2;
		System.out.println(n3);
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2); //소수점이 숫자 더 표현할 수 있어서 float>int
		
		
	}

}

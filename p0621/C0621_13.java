package p0621_01;

public class C0621_13 {

	public static void main(String[] args) {
		//오버로딩-갯수나 타입 다른 것
		int a = 0;
		float b = 1.0f;
		double c = 2/0;
		String str =  "안녕하세요";
		char ch = 'A';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(str);
		System.out.println(ch);
	}
	
	//매개변수
	int add(int a, int b) {return a+b;}
	long add(int a, long b) {return a+b;} 
	
}

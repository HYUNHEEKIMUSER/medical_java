package p0614;

public class C0614_11 {

	public static void main(String[] args) {
		// byte, char, short은 int로 변환(사칙연산)
		byte a = 1;
		int n = 350;
		
		byte c =(byte)(a + n);
		System.out.println(c);
		// int 256개 -> 350개 오버플로우

		int d = a + n;
		System.out.println(d);
		
		
		char ch = 'A'; //대문자 A: 65 / 소문자 a: 97
		char ch2 = 'B'; //66
		System.out.println(ch+ch2);

		System.out.println(ch+32);
		System.out.println((char)(ch+32));

		byte by = 10;
		byte by2 = 20;
		byte by3 =(byte)(by + by2);
		System.out.println(by3);
		
		int num = 1000000;
		int num2 = 2000000;
		long total = num + num2;
		System.out.println("long: "+total);
		
		int num1 = 1000000;
		int num21 = 2000000;
		long total1 = num1 * num21;
		System.out.println("long: "+total1);  //21억 돌고나서 다시 반대로(마이너스)

		int num11 = 1000000;
		int num211 = 2000000;
		long total11 = (long)num11 * num211;
		System.out.println("long: "+total11);  
		
		int num3 = 1000000;
		long num4 = (long)num * num3;  // 혹은 long num3 = 1000000L;
		System.out.println(num4);
		
		int num5 = 1000000;
		System.out.println(num/num5*1000000);
		System.out.println(num*num5/1000000);
		
		char c1 = 'a';
		//char c2 = c1 + 1; //에러
		char c2 = (char)(c1+1);
		System.out.println(c2);
		
		char c3 = c1++;
		System.out.println(c3);
	
		char c4 = ++c1;
		System.out.println(c4);
		
		
		int i = 'B' - 'A';
		System.out.println(i);
		
		// 문자 숫자는 - 문자숫자 '0'을 빼면 숫자 값이 나옴.
		int j = '2' - '0';   // 0:48, 2:50
		System.out.println(j);
		
		int k = '8' - '0';
		System.out.println(k);
	}

}

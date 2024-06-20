package p0620;

public class C0620_06_01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println((a+1)+(b+1));
		System.out.println((a-1)-(b+1));
		System.out.println((a*1)*(b+1));
		System.out.println((a/1)/(b+1));
		//-------------------------------
		int num = 0;
		int num2 = 10;
		
		num2 = num; //num2는 num값으로 변함
		//------------------------------
		
		
		// 객체선언
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t2 ch: "+t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t2 ch: "+t2.channel);
	}

}

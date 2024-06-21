package p0621_01;

public class C0621_12 {

	public static void main(String[] args) {
		System.out.println(MyMath2.add(0, 0));
		
		MyMath2 mm = new MyMath2();
		mm.a = 10;
		mm.b = 20;
		System.out.println(mm.add());
		
	}

}

//오버로딩의 조건 : 메서드의 이름이 같아야함. 매개변수의 개수 또는 타입이 달라야 한다. 
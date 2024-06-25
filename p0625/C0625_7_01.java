package p0625;

public class C0625_7_01 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		Ambulance a = new Ambulance();
		Ambulance a2 = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		//다형성: 부모의 참조변수 자손의 객체를 다루는 것
		//자손의 참조변수로 조상의 객체를 다루는 것 -> 안됨
		//자손참조변수 = 조상의 객체
//		a2 = (Ambulance)c;
		c = a; //c안에 자손의 객체를 먼저 넣어줌
		
		if(c instanceof Ambulance) {
			System.out.println("가능합니다");
			c=a;
		}
		if(a instanceof Car) {
			System.out.println("가능합니다");
			c=a;
		}
		//부모의 참조변수에 자손객체를 넣어줌
		a2 = (Ambulance)c;
	}

}

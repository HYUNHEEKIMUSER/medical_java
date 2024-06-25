package p0625;

public class C0625_07 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		Ambulance a = new Ambulance();
		Ambulance a2 = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		//형변환 - 자손타입에서 조상타입: 형변환 타입 생략가능
		c2 = a; //혹은 
		c2 = (Car)a; //둘다 가능
		a2 = (Ambulance)c2; // Car에서는 타입을 정해야 함.
		//c2 = a; -> Ambulance->Car
		c2.drive();
//		c2.siren(); //부모의 참조변수로는 사용할 수 없음
		
		a2 = (Ambulance)c2;
		a2.siren();
	}

}

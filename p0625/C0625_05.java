package p0625;

public class C0625_05 {

	public static void main(String[] args) {
		Time t = new Time();
		//t.day = 45; //같은 패키지 내에 있어서 접근가능
		//t.hour = 50; // private 붙였으면 같은 클래스 내에서만 가능
		t.setHour(45);
		
	
		System.out.println("현재시간: "+t.getHour()+"시");
//		System.out.println("현재날짜: "+t.day+"일");
		
	}

}

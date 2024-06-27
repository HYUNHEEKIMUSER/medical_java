package p0627;

public class C0627_01_01 extends Object{

	public static void main(String[] args) {
		Marine m = new Marine(); //보병 1명
		System.out.println("현재 체력: "+m.hitPoint);
		Tank t  = new Tank();
		System.out.println("현재 체력: "+t.hitPoint);
		
		Dropship d = new Dropship();
		System.out.println("현재 체력: "+d.hitPoint);

		System.out.println("탱크가 포탄을 맞았습니다.");
		t.hitPoint -= 10;
		t.hitPoint -= 10;
		t.hitPoint -= 10;
		System.out.println("현재 체력: "+t.hitPoint);
		d.hitPoint -= 10;
		System.out.println("현재 체력: "+d.hitPoint);
		
		
		hpDown(t);
		hpDown(d);
		hpDown(m);
		hpDown(m);
		hpDown(m);
		System.out.println("현재 체력: "+m.hitPoint);
		
	}
	static void hpDown(Unit u) {
		u.hitPoint -= 10;
	}
	// SCV는 기계를 수리할 수 있는 능력
		Scv s = new Scv(); // scv 1대
		s.repair(t);
		System.out.println("현재 체력: "+t.hitPoint);
		s.repair(d);
		System.out.println("현재 체력: "+d.hitPoint);

	
	
	
	
	
}

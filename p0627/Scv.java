package p0627;

public class Scv extends GroundUnit{
	Scv(){
		super(50);
		hitPoint = MAX_HP;
		}
	
	void repair(Tank u) {
		while(u.hitPoint <= u.MAX_HP) {
			System.out.println("에너지를 5씩 증가합니다.");
			u.hitPoint+=5;
		}
	
	}
	void repair(Dropship u) {
		while(u.hitPoint <= u.MAX_HP) {
			System.out.println("에너지를 5씩 증가합니다.");
			u.hitPoint+=5;
		}
	
	}
	void repair(AirUnit u) {
		while(u.hitPoint <= u.MAX_HP) {
			System.out.println("에너지를 5씩 증가합니다.");
			u.hitPoint+=5;
		}
	}
	void repair(Repairable r) {
		Unit u = (Unit)r;	//형변환
		while(u.hitPoint <= u.MAX_HP) {
			System.out.println("에너지를 5씩 증가합니다.");
			u.hitPoint+=5;
		}
	
	}
	
}//class
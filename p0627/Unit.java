package p0627;

abstract public class Unit {
	int hitPoint; //현재체력
	final int MAX_HP; //최대체력
	
	Unit(int hp){
		MAX_HP = hp;
		
	}
	
	int x,y;
//	abstract void move(int x, int y); //추상 메소드, 메소드 구현{}
	void stop() {}
}
//void move(int x, int y){}; //메소드 구현->{} 유무에 따라 달라짐. 내용 없어도 됨


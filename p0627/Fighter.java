package p0627;

//클래스를 상속받아 구현하려면 extends를 사용
//인터페이스를 상속받아 구현하려면 implements 사용
abstract public class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		
		
	}

	@Override
	abstract public void attack(Unit u); 

}

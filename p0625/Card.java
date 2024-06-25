package p0625;

public class Card {
	Card(){}//기본생성자
	Card(int number, String kind){
		this.number = number;
		this.kind = kind;
	}
	
	
	int number;
	String kind;
	
	@Override
	public String toString() {
		// 원래는 주소값이 나오는데 return에 이렇게 넣으면 값이 나옴
		return "["+kind+","+number+"]";
	}
}

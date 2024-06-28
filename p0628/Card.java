package p0628;

public class Card {
	
//	enum kind{SPADE,DIAMOND,HEART,CLOVER}
	//여기에 해당되는 데이터만 들어올 수 있게 함
	

	private int number;
	private String kind;
	
	Card(){}
	Card(int number, String kind){
		this.number=number;
		this.kind=kind;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String toString() {
		return String.format("%d,%s",number,kind);
	}
}

package p0701;

import p0701.Card.Kind;

public class Card {
	
	enum Kind{ SPADE,DIAMOND,HEART,CLOVER }
	// 소문자 대문자 섞인 거 없이 대문자인 것만 받겠다. ex)SPADE
	
	private int number;
	private Kind kind;
//	private String kind;
	
	Card(){}
	Card(int number,Kind kind){
		this.number = number;
		this.kind = kind;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Kind getKind() {
		return kind;
	}
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return String.format("%d,%s", number,kind);
	}

}
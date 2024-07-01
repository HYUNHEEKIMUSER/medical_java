package p0701;

public class Card_2 {
	private String password;  //private했으면 set, get으로 읽어올 수 있음
	private int number;
	private String kind;
	
	Card_2(){}//기본생성자
	Card_2(int number, String kind){
		this.number = number;
		this.kind = kind;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		if(number>13 || number <0) {
			return;
		}
		this.number = number;
	}//캠슐화
	
	public String getPassword(String id) {
		if(!(id.equals("admin"))) {
			return "";
		}
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}//캠슐화
	
	@Override
	public String toString() {
		return kind+","+number; //System.out.println(list.get(i));
	}
}

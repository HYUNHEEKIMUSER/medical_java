package p0626;

public class Buyer {
	String userId;
	String userPw;
	int money;
	int bonusPoint;
	//장바구니 - 구매내역
	Product[] cart = new Product[10];
	int count;
	
	Buyer(){}
	
	Buyer(String userId, String userPw, int money, int bonusPoint){
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	//구매메소드
	void buy(Tv t) {
		money -= t.price;
		bonusPoint += t.bonusPoint;
		
	}
	void buy(Computer c) {
		money -= c.price;
		bonusPoint += c.bonusPoint;
	}
	void buy(Audio a) {
		money -= a.price;
		bonusPoint += a.bonusPoint;
	}
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.printf("잔액이 부족합니다.(보유금액: %d만원) \n",money);
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[count++] = p; //구매물품을 저장하는 것
		System.out.printf("%s 제품을 구매했습니다.(보유금액 %d만원) \n",p.pName,money);
	} //tv 컴퓨터 오디오 세가지를 다 받음
	
	
	
	void buy(Refrigerator r) {
		money -= r.price;
		bonusPoint += r.bonusPoint;
	} //extends product 안받아서 새로 써야됨
	
	
		
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
}

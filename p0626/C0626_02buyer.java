package p0626;

public class C0626_02buyer {

	public static void main(String[] args) {
		Buyer b = new Buyer("aaa","1111",1000,0);
		
		//구매
		Product t = new Tv(); //다형성
		Product t2 = new Tv();
		b.buy(t);//tv 1대 구매
		b.buy(t2); //tv 1대 구매
		
		//컴퓨터구매
		Product c = new Computer();
		b.buy(new Computer());
		
		//오디오구매
		Product a = new Audio();
		b.buy(a);		
		
		Product r = new Refrigerator();
		b.buy(r);
		
		//cart의 제품명, 가격을 출력하시오.
		int sum = 0;
		System.out.println("[구매내역]");
		for(int i=0; i<b.count; i++) {
			System.out.printf("제품명: %s, 금액: %d만원 \n",b.cart[i].pName,b.cart[i].price);
			sum+=b.cart[i].price;
		}
		System.out.printf("총 구매금액: %d만원 ",sum);
		
	}

}

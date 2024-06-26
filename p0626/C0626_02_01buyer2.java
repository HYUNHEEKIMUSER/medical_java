package p0626;

public class C0626_02_01buyer2 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2("aaa","1111",1000,0);
		
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
		b.summary();
		//아래부분 summary로 합침
		
//		int sum = 0;
//		System.out.println("[구매내역]");
//		for(int i=0; i<b.list.size(); i++) {
//			Product p = (Product)b.list.get(i);
//			
//			
//			System.out.println(p.pName);
//			sum+=p.price;
//		}
//		System.out.printf("총 구매금액: %d만원 ",sum);
//		System.out.printf("총 구매갯수: %d만원 ",b.list.size());
		
	}

}

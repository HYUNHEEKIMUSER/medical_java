package p0701;

import java.util.ArrayList;
import java.util.Arrays;

public class C0701_02_card2 {

	public static void main(String[] args) {
		ArrayList<Card_2> list = new ArrayList();  //ArrayList<E> 특정 데이터만 입력되게 하는 것 -> card_2 c = (Card_2)list.get(i); //형변환 안해도 됨 
		list.add(new Card_2(1,"CLOVER"));
		list.add(new Card_2(10,"HEART"));
		list.add(new Card_2(2,"SPADE"));
		
		for(int i=0;i<list.size();i++) {
//			Card_2 c = (Card_2)list.get(i); //형변환
			System.out.println(list.get(i));
		}
	}

}

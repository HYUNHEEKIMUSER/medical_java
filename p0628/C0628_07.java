package p0628;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.ListModel;

public class C0628_07 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<Card>();
		list.add(new Card(1,"SPADE"));
		list.add(new Card(2,"DIAMOND"));
		list.add(new Card(5,"HEART"));
		list.add(new Card(4,"CLOVER"));
		list.add(new Card(3,"SPADE"));

		//[숫자형 정렬]
		
//		list.sort(new Comparator<Card>() {
//			@Override
//			public int compare(Card o1, Card o2) {
////				return o1.number-o2.number; // 순차정렬
//				return o2.number-o1.number;  // 역순정렬
//
//			}
//		});
		//[문자형 정렬]
		
		list.sort(new Comparator<Card>() {
			@Override
			public int compare(Card o1, Card o2) {
//				return o1.number-o2.number; // 순차정렬
				return o2.kind.compareTo(o1.kind);  // 역순정렬 스펠링으로 정렬

			}
		});
		
		
		
		
				
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));  //card에서 오버라이딩해줘야 나옴
		}
				
		
//		ArrayList list = new ArrayList();
//		list.add(1);
//		list.add(7);
//		list.add(8);
//		list.add(5);
//		list.add(4);
//		list.add(2);
////		Collections.sort(list); // 순차정렬
//		Collections.sort(list, Collections.reverseOrder()); //역순정렬
//		System.out.println(list);
	
		
		
	} //m
}//c

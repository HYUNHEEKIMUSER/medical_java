package p0628;

import java.util.*;
import java.util.Comparator;

public class C0628_10 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<Card>();
				
		list.add(new Card(1,"SPADE"));
		list.add(new Card(1,"DIAMOND"));
		list.add(new Card(3,"SPADE"));
		list.add(new Card(7,"HEART"));
		list.add(new Card(5,"CLOVER"));
		list.add(new Card(2,"DIAMOND"));
		
		list.sort(new Comparator<Card>() {
			@Override// 숫자, 문자열
			public int compare(Card o1, Card o2) {
				return o1.number - o2.number; //순자정렬
//				return o2.number - o1.number; //역순정렬
			}
		});
		
		System.out.println("--------------------------------------");
		list.sort(new Comparator<Card>(){
			@Override// 숫자, 문자열
			public int compare(Card o1, Card o2) {
				return o1.kind.compareTo(o2.kind)- o2.number; //순자정렬
//				return o2.number - o1.number; //역순정렬
			}
		});
		
		System.out.println("--------------------------------------");

		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	
	}
}


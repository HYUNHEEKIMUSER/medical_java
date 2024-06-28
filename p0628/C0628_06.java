package p0628;

import java.util.*;

public class C0628_06 {

	public static void main(String[] args) {
//		//list - 순서가 있음. 중복을 허용
//		ArrayList list = new ArrayList();
//		list.add(1); // add 명령어 - 추가
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.remove(1); //remove는 삭제 메소드
//		
//		//size 컬렉션 크기
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i)); //get: 데이터를 읽어옴.
//		}
		ArrayList<Card> list = new ArrayList<Card>();  //list만 사용하고 형변환이 필요없음
//		ArrayList list = new ArrayList();
		list.add(new Card(1,"SPADE"));
		list.add(new Card(2,"SPADE"));
		list.add(new Card(2,"DIAMOND"));
		list.add(new Card(3,"HEART"));
		list.add(new Card(4,"CLOVER"));
//		list.add(new Students());
//		list.add("안녕");// 이것은 object여서 들어갈 수 있음


		for(int i=0; i<list.size(); i++) {
//			Card c = (Card)list.get(i);
			System.out.println(list.get(i).number+","+list.get(i).kind); //(list.get(i))->get은 object임
		}
	}//m

}//c

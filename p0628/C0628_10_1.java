package p0628;

import java.util.ArrayList;

public class C0628_10_1 {

	public static void main(String[] args) {
		//지네릭스
		ArrayList list = new ArrayList();
		for(int i=0; i<list.size();i++) {
			System.out.println(((Card)list.get(i)).number);
		}
		
		//간단하게 형변환 가능
		ArrayList<Card> list2 = new ArrayList();
		for(int i=0; i<list2.size();i++) {
			System.out.println(list2.get(i).number);
		}
	}

}

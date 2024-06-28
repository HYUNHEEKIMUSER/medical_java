package p0628;

import java.util.*;
public class C0628_06_01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add("유관순");
		list.add("이순신");
		list.add("김구");
		list.add("강감찬");
		list.remove(1); //인덱스로 삭제
		list.remove("김구"); //객체 형태로 삭제
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}

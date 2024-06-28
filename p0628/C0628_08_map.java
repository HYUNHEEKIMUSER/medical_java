package p0628;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class C0628_08_map {
//map 키는 중복안되고 밸류는 중복 가능
	public static void main(String[] args) {
		Process p = new Process();
		//listm list의 값을 모두 출력하세요
		HashMap<String,Object> map = p.read_con();
		
		Object obj = map.get("list");
		ArrayList list = (ArrayList) obj;
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		Object obj2 = map.get("list2");
		ArrayList list2 = (ArrayList) obj2;
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		Object obj3 = map.get("set");
		HashSet set = (HashSet) obj3;
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Person per = (Person)it.next();
			System.out.println(per);
		}
		
		
//		
//		// HashMap
//		HashMap map = new HashMap();
//		map.put("aaa", 1111);
//		map.put("bbb", 1234);
//		map.put("aaa", 1111);
//		map.put("aaa", 1111);
//	
//		String str = "bbb";
//		if(map.containsKey(str)) {
//			System.out.println("동일한 데이터가 있습니다.");
//		}else {
//			System.out.println("일치하는 데이터가 없습니다.");
//		}
//		System.out.println();
//		
//		//map에는 iterator() 없음.
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next()); //동일한 것 없애줌
//		}
	}//m
}//c






















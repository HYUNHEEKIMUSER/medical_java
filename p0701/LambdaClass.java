package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaClass {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//list 람다식 출력
		list.forEach(i->System.out.println(i)); 		
		
		list.removeIf(x->x%2==0 || x%3==0); //매개변수가 메소드가 올 수 있음 - 람다식만 매개변수로 가용가능
		System.out.println(list);
		list.replaceAll(i->i*10);
		System.out.println(list);
		
		Map<String,String> map = new HashMap(); //ctrl+shift+m		
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		//매개변수 자리에 함수가 올 수 있다
		map.forEach((str,str2)->System.out.println("{"+str+","+str2+"}"));
		
	}//m
	public static Integer data_list() {
		return 1;
	}
	
}//c

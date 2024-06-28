package p0628;
import java.util.*;
import java.util.Set;

public class C0628_08 {

	public static void main(String[] args) {
		//set은 순서가 없고 중복이 없다
		HashSet set = new HashSet();
//		set.add("abc");
//		set.add("abc");
		set.add(new Person("홍길동",1)); //값은 같아도 주소값이 달라 따로 나옴
		set.add(new Person("유관순",2));
		set.add(new Person("이순신",3));
		set.add(new Person("강감찬",4));
		set.add(new Person("김구",5));
		
		System.out.println(set);
		
		//iterator() 1회용임. 2번 출력 시 한번 더 불러와야 됨
		Iterator it = set.iterator();
		while(it.hasNext()) { //현재 객체가 있는 지 확인
			Person p = (Person)it.next(); //객체 1개 가져오기
			System.out.println(p.name);
		}
		System.out.println();
		it = set.iterator();
		while(it.hasNext()) { //현재 객체가 있는 지 확인
			Person p = (Person)it.next(); //객체 1개 가져오기
			System.out.println(p.name);
		}
		
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
//			Person o = it2.next(); //객체 1개 가져오기
			System.out.println(it2.next());
		}
		
		
//		HashSet set = new HashSet(); //순서가 마음대로 바뀜
//		set.add(new Card(1,"SPADE"));
//		set.add(new Card(2,"DIAMOND"));
//		set.add(new Card(3,"HEART"));
//		set.add(new Card(4,"CLOVER"));
//		set.add(new Card(1,"SPADE"));
//		set.add(new Card(6,"SPADE"));
//		
//		System.out.println(set);
		
		
		
//		HashSet set = new HashSet(); //중복 다 뺴줌
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("3");
//		set.add("1");
//		set.add("1");
//		set.add("4");
		
//		Object[] objArr = {"1",new Integer(1),"2","2","2","3","3","4","4","4"};
//		Set set = new HashSet();
//		
//		for(int i=0; i<objArr.length;i++) {
//			set.add(objArr[i]);
//		}
//		System.out.println(set);
		
		
	}//m
}//c


class Person{
	String name;
	int age;
	
	Person(){}
	Person(String name, int age){
		this.name = name;
		this.age =age;
	}
	
	public String toString() {
		return name+":"+age;
	}
}














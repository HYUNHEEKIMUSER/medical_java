package p0628;
import java.util.*;
public class C0628_07_01 {

	public static void main(String[] args) {
		ArrayList<Students> list =new ArrayList<Students>();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",99,99,99));
		list.add(new Students("이순신",80,80,99));
		list.add(new Students("강감찬",40,70,99));
		list.add(new Students("김구",80,60,99));
		list.add(new Students("김유신",100,80,80));
		
		//합계 순차정렬, 역순정렬
		list.sort(new Comparator<Students>() {

			@Override
			public int compare(Students o1, Students o2) {
				// TODO Auto-generated method stub
//				return o1.total-o2.total;
				return o2.total-o1.total;
			}
		});
		System.out.println("--------------------------------------");

		//이름 정렬
		list.sort(new Comparator<Students>(){
			@Override
			public int compare(Students o1, Students o2) {
				return o2.name.compareTo(o1.name);
			}
		});
		System.out.println("--------------------------------------");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

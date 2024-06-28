package p0628;
import java.util.*;
public class C0628_06_02 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		ArrayList<Students> list = new ArrayList<Students>();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",99,99,99));
		list.add(new Students("이순신",80,80,99));
		list.add(new Students("강감찬",70,70,99));
		list.add(new Students("홍길동",100,100,99));
		list.remove(1);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

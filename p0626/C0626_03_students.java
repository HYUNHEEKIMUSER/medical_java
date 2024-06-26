package p0626;

import java.util.*;

public class C0626_03_students {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Students("홍길동",100,100,100));
		list.add(new Students("유관순",89,87,99));
		list.add(new Students("이순신",90,90,92));
		
		list.remove(1);
		
		System.out.println("입력된 갯수"+list.size());
		
		//전체출력
		for(int i=0; i<list.size(); i++) {
			Students s = (Students)list.get(i);
			System.out.printf("%s,%s,%d,%d,%d,%d,%.2f,%d \n",
					s.stuNo,s.name,s.kor,s.eng,s.math,s.total,s.avg,s.rank);
		}
	}//m
}//c
package p0628;
import java.util.*;
public class C0628_09 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
//		list.remove(3);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(int i=0;i<list.size();i++) {
			list.remove(i); //리스트는 이렇게 지우면 안됨. 
		}
		
		for(int i=list.size()-1;i>0;i--) {
			System.out.println(list.get(i));
		} // 이렇게 지워야 됨 전체 삭제할 때
		
		if(list.isEmpty()) {
			System.out.println("모든 데이터가 삭제되었습니다.");			
		}
	}

}

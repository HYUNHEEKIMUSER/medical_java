package p0626;

import java.util.*;

public class C0626_04car {

	public static void main(String[] args) {
		// C20240001, C20240002....
		// 1: white, 4, 2: red, 5, 3: blue,4 4:gray,3 5:black,5
		ArrayList list = new ArrayList();
		list.add(new Car("white",4));
		list.add(new Car("red",5));
		list.add(new Car("blue",4));
		list.add(new Car("gray",3));
		list.add(new Car("black",5));
		
		System.out.println("입력갯수: "+list.size());
	
		for(int i=0; i<list.size(); i++) {
			Car c = (Car)list.get(i);
			System.out.printf("넘버: %s, 색상: %s, 문: %d개 \n",
					c.serialNo,c.color,c.door);
		}

	}//main
}//class

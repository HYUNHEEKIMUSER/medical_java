package p0624;

import java.util.Scanner;

public class C0624_09 {

	public static void main(String[] args) {
//		Data d = new Data();  //data2에 관한 내용
//		Data2 d = new Data2(); // 에러 
//		Data2 d3 = new Data2(10); // 에러없음
		
		Scanner scan = new Scanner(System.in);
		Car car1 = new Car();
		//객체선언 후 white, auto, 4
		car1.color="white";
		car1.gearType="auto";
		car1.door=4;
		
		Car c = new Car("white","auto",4);
		System.out.println(c.color);
		
		Car car2 = new Car();
		//객체선언 후 red, auto, 5
		car2.color="red";
		car2.gearType="auto";
		car2.door=5;
		
		Car cc = new Car("red","auto",5);
		
		Car car3 = new Car();
		//객체선언 후 blue, auto, 3
		car3.color="blue";
		car3.gearType="auto";
		car3.door=3;

		Car ccc = new Car("blue","auto",3);

	}

}

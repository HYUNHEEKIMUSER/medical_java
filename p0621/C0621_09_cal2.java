package p0621_01;

import java.util.Arrays;

public class C0621_09_cal2 {

	public static void main(String[] args) {
		//객체선언
		Cal2 c = new Cal2();
		
		int a=10;  //기본형변수->앞에 int있어서 ->값만 넘김
		int b=3;
		double[] arr = new double[4]; //arr ->참조형 변수(모두 주소값을 가지고 있음) -> 주소값 다 넘김
		
		c.cal(a,b,arr);

		System.out.println(Arrays.toString(arr));
	}

}

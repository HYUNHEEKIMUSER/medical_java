package p0621_01;

public class Cal {
	int add(int a, int b) {
		int result = a+b;
		
		int num = minus(10,5);
		System.out.println("minus: "+num);
		
		//메소드선언은 안됨
		//int add2(int k,int m){}
		
		return result;
	}
	int minus(int a, int b) {
		return a-b; //이것은 가능
	}
}

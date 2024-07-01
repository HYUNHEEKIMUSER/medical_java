package p0701;

public class C0701_05 {

	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		
		th1.start(); //th1 실행
		th2.start();

	}

}

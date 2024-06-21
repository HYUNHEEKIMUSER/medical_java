package p0621_01;

public class C0621_01_time {

	public static void main(String[] args) {
		Time[] t = new Time[3]; //배열선언
		
		t[0] = new Time();
		t[1] = new Time();
		t[2] = new Time(); // 객체선언

		Time.day = 21; // 클래스명. 변수명 사용
		t[0].day = 11;
		t[0].hour = 10; //참조변수명.변수명
		t[0].minute = 10;
		t[0].second = 10;
		
		Time.day = 25;
		t[1].hour=20;
		t[1].minute = 11;
		t[1].second = 11;
		
		System.out.printf("일시: %d일 %d시 %d분 %d초\n",t[0].day,t[0].hour,t[0].minute,t[0].second);
		System.out.printf("일시: %d일 %d시 %d분 %d초\n",t[1].day,t[1].hour,t[1].minute,t[1].second);
		
 		Time tt = new Time(); //객체선언
 		
 		for(int i=0; i<5; i++) {
 			System.out.println(i);
 		}

 		for(int i=0; i<5; i++) {
 			System.out.println(i);
 		}
	}//main

}//class

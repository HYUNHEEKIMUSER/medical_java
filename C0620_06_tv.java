package p0620;

public class C0620_06_tv {

	public static void main(String[] args) {
		// 클래스는 객체선언
		
		Tv t = new Tv();
		
		t.channel = 7;
		t.channelUp();
		System.out.println("현재채널: "+t.channel);
		t.channelDown();
		t.channelDown();
		System.out.println("두번째 채널: "+t.channel);
	}

}

package p0614;

public class C0614_05_01 {

	public static void main(String[] args) {
		byte b = 127; //127이 최대값이고 +1을 하면 -128로 감 (뒤로 가는 거임)
		b = (byte) (b+10);
		System.out.println(b); //오버플로우 발생
		
		int num = 2147483647; //2147483647이 최대값 / 21억 이상 쓰려면 long쓰기
		num = num +1;
		System.out.println(num); // 오버플로우
		
	}

}

package p0617;

public class C0617_16_01 {

	public static void main(String[] args) {
		// 1-100까지 홀수만 더해서 최종값을 출력
		// 우선 1-100까지 숫자를 더해서 출력
		
		int sum =0;
		for(int i=1; i<=100; i++) {
			sum = sum+i;
			System.out.println("1-100까지 더한 값: "+sum);
			
		int sum2 = 0; //j+=2도 가능
		for(int j=1; j<=100; j++ ) {
			if(j%2==1) sum2 +=j;
			System.out.println("홀수만 더한 값: "+sum2);
			
			}
		}
	}
			
}		
		

	



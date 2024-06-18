package p0618;

public class C0618_04 {

	public static void main(String[] args) {
		// 구구단 4*4 =16에서 멈추기
		// 반복문에는 이름을 부여할 수 있음
		loop1: for(int i=2; i<=9; i++) {
			System.out.printf("[%d 단] \n",i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d \n",i,j,i*j);
				if(i==4 && j==4){
					System.out.println("구구단을 멈추겠습니다");
					break loop1;
				}
			}
		}
			
	}

}

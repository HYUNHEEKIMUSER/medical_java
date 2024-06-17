package p0617;

public class C0617_17_02 {

	public static void main(String[] args) {
		// 1-10까지 합을 구하시오
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			System.out.println(i+"까지의 합: "+sum);
		}
		// 구구단 출력 시 홀수단만 출력
		for(int j=2; j<=9; j++) {
			if(j%2==0) continue;
			System.out.printf("[%d 단] \n",j);
			for(int a=1; a<=9; a++) {
				System.out.println(j+"*"+a+"="+j*a);
			}
		}
	}

}

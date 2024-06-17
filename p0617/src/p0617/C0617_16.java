package p0617;

public class C0617_16 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println("i: "+i);
			System.out.println("sum: "+sum);
		}
		System.out.println("최종 sum: "+sum);
	}

}

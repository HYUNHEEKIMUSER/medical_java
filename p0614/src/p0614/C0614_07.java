package p0614;

public class C0614_07 {

	public static void main(String[] args) {
		
		// printf의 출력
		// 소수점 제한 출력가능, 8진수, 16진수 출력가능
		System.out.println(10.0/3); //double
		System.out.printf("%.2f \n", 10.0/3); //printf는 줄단락을 바꿔야 함
		int x = 0x1a; //16진수 표현 1a 값은? 1x16+0x16 ->16
		System.out.println(x);
		System.out.printf("%X \n", x); //printf의 경우 16진수 출력가능
		
		long a = 10L;		
		System.out.printf("%d \n", a);
		int b = 20;
		System.out.printf("%d \n",b);
		
		int age = 10;
		int year = 2014;
		System.out.printf("나이: %d, 년도: %d \n",age,year);
		System.out.println("나이: "+age+", 년도: "+year+"");
		
		System.out.printf("[%05d] \n",10);
		System.out.printf("[%5d] \n",10);
		
	}

}

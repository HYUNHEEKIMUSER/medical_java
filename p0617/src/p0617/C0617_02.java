package p0617;

public class C0617_02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		System.out.println(a/b);
		
		System.out.println(a/(double)b);
		System.out.print("줄단락 안바꿈"+a/(double)b); // ln은 줄단락 바꿈
		
		System.out.printf("%.2f \t",10/3.0); // ln은 줄단락 바꿈 \t은 tab키
		System.out.println("aaa");
		
		System.out.println(10/3.0); //3.0 -> double 타입
		
		System.out.printf("%x \n",15); // 16진수
		System.out.printf("%o \n",15);  // 8진수
		System.out.printf("%b \n",15); 
		System.out.printf("%s \n",Integer.toBinaryString(15)); //2진수->문자열 변경 
		
		
	}

}

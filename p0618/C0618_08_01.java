package p0618;
import java.util.Arrays;
import java.util.Scanner;
public class C0618_08_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 45개짜리 ball 배열을 생성, 1-45까지 숫자를 입력
		// 6개짜리 myArr배열을 만들어서, 1~45까지 6개의 숫자를 입력받아 출력하시오.
		
		// 1. 45개 배열 생성
		int[] ball = new int[45];
		
		// 2. 반복문을 사용해서 1-45까지 숫자를 입력
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		// 3. 랜덤으로 섞기
		int no = 0; //랜덤번호
		int t_value = 0; //값을 저장
		for(int i = 0; i<300; i++) {
			no = (int)(Math.random()*45); //0-44
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}
		//------------------------------------
		// 5. 로또번호 출력
				System.out.print("로또번호 : ");
				for(int i=0;i<6;i++) {
					System.out.print(ball[i]+" ");
				}
				System.out.println();
				
		//------------------------------------
		
		
		// 4. my로또번호 입력 
		int[] myArr = new int[6];
		int num = 0;
		int n = 0;
		while(n<6){ //for를 쓰면 continue처럼 됨. while로 해야 잘못 해도 다시 전으로 돌아감
			System.out.printf("%d번째 숫자를 입력하세요.(1-45까지 숫자)>> ",n+1);
			num = scan.nextInt();
			if(num<1 || num>45) {
				System.out.println("1-45까지의 숫자만 입력하셔야 합니다. 다시 입력하세요");
				continue;
			}
				myArr[n] = num;
				n++;
		}
		// 입력한 숫자 출력
		System.out.print("입력한 숫자 : ");
		for(int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		System.out.println();
		
		// 로또번호와 일치하는 번호 - myArr, ball 비교
		int count = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(myArr[i]==ball[j]) {
					myLotto[count] = myArr[i];
					count++;
					break;
				}
			}
		}
		System.out.println("로또 당첨갯수: "+count);
		
		// 당첨된 번호가 출력되도록 구현하시오.
		System.out.print("당첨된 번호: ");
		for(int i=0; i<count; i++) {
			System.out.print(myLotto[i]+" ");
		}
		
//		int[] all = new int[6];
//		int[] myArr = new int[6];
//		int[] myLotto = new int[45];
		if(count==0) System.out.println("없음");
		
		System.out.println();
		
		//당첨금액: 6개 - 100억 5개 - 1억 4개 -1백만원 3개 - 1만원
		System.out.print("당첨금액: ");
		switch(count) {
		 case 6:
			 System.out.println("100억");
			 break;
		 case 5:
			 System.out.println("1억");
			 break;
		 case 4:
			 System.out.println("100만원");
			 break;
		 case 3:
			 System.out.println("1만원");
			 break;
		default:
			System.out.println("당첨금 없음");
			break;
		}
		
		
		
//		System.out.println(Arrays.toString(ball));		
		
		// 10개짜리 배열을 생성하고 숫자를 10번 입력받아, 3,4번째 숫자만 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		int[] arr = new int[10];
//		for(int i=0;i<10;i++) {
//			System.out.println("숫자를 입력하세요.>> ");
//			arr[i] = scan.nextInt();
//		}
//		
//		System.out.printf("2번째,3번째 입력값 : %d , %d \n",arr[2],arr[3]);
	}
}
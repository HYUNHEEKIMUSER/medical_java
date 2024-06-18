package p0618;

import java.util.Scanner;

public class C0618_10_01 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int[] input = new int[10]; // 내가 입력한 번호 모으는 용도
		int r_num = (int)(Math.random()*100)+1;
		System.out.println("랜덤번호: "+r_num); // 랜덤번호 미리 확인
		int num=0;
		int i = 0;
		
		
		
		while(i<10) {
			System.out.println("숫자를 입력하세요");
			num= scan.nextInt();
			
			
			
			//유효값 입력하도록 유도
			if(num<1 || num>100) {
				System.out.println("1부터 100까지 숫자를 입력해야 합니다. 다시 입력하세요");
				continue;
			}
				
			
			
			
			input[i] = num; // 입력한 번호 저장
			if(num>r_num) {
				System.out.println("입력한 숫자보다 작은 수를 입력하세요");
			}else if(num<r_num) {
				System.out.println("더 큰 수를 입력하세요");
			}else {
				System.out.println("정답");
				break;
			}
			i++;
			
			
			
		}
		System.out.println("랜덤번호: "+r_num);
		System.out.print("내가 입력한 번호: "); //입력번호 저장할 수 있게 int[] input = new int[10];만들기
		for(int j=0; j<i; j++) {
			System.out.print(input[j]+" ");
		}
		System.out.println();
		
		// 정답이 없을 때 가장 근사치의 값을 출력
		// 45 44 46 3 4 5 6 10
		
		int temp=0; // 값을 저장
		int arr_no = 0; // 저장 위치
		
		if(i==10) {
			int[] no = new int[10]; //배열생성
			//Math.abs(r_num - input[0]); //절대값
			for(int count=0; count<10; count++) { // 랜덤값 입력한 값을 뺄셈 해줌
				no[count] = Math.abs(r_num - input[i]);
			}
			
			arr_no = 0;
			temp = no[0];
			for(int count=1; count<10; count++) {
				if(temp>=no[count]) {
					arr_no = count;
					temp = no[count];
				}
			}
			
			System.out.println("근사치 값 1개: "+input[arr_no]);
			
			
			System.out.print("근사치 값: ");
			for(int count=0; count<10; count++) {
				System.out.print(no[count]+" ");
			}
			System.out.println();
		}
		
	}

}

package p0618;

public class C0618_06 {

	public static void main(String[] args) {
		// 배열선언 - 주소는 0부터 시작
		int[] score = new int[5];
		// 초기화
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		//배열선언과 동시에 초기화
		int[] sc = {1,2,3,4,5};
		
		//배열선언과 동시에 초기화
		int[] sc2 = new int[] {1,2,3,4,5};
		
		//배열선언 -초기화
		int[] s = new int[5];
		for(int i=0; i<5; i++) {
			score[i] = i+1;
		}
	}

}

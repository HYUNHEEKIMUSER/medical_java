package p0618;

import java.util.Arrays;

public class C0618_06_01 {

	public static void main(String[] args) {
		// int 배열 10개를 선언해서 홀수 10개를 입력해서 출력하시오
//		int[] score = {1,3,5,7,9,11,13,15,17,19};
		
		//-------------------------------------------------
		int[] score = new int[10];
		for(int i=0; i<10; i++){
			score[i] = 2*i+1;
			
		} 
		System.out.println(Arrays.toString(score));
	}
}


//for(int i=0; i<score.length; i++) ->배열의 길이
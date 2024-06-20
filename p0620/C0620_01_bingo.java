package p0620;

import java.util.Arrays;
import java.util.Scanner;

public class C0620_01_bingo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//lotto, 학생성적프로그램
//		String[] score = new String[45]; 
//		for(int i=0; i<score.length; i++) {
//			score[i] = ""+(i+1);
//		}
//		System.out.println(Arrays.toString(score));
		//-------------------------------------------------------------------
		// 1-25까지의 숫자를 넣고 배열을 섞고 for문으로 출력하기 2차원 배열은 for가 두 번 사용
		String[][] arr = new String[5][5];		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = 5*i+j+1+"";
			}
		}
		
		int no = 0, no2 = 0;
		String t_value = "";
		for(int i=0; i<500; i++) { 
				no = (int)(Math.random()*5);
				no2 = (int)(Math.random()*5);
				
				t_value = arr[0][0];
				arr[0][0] = arr[no][no2];
				arr[no][no2] = t_value;
			}
		
		int count = 0; // 25번 다 끝날 때 사용하는 용도, 번호입력 횟수
		
		
		// 2차원배열 출력
		while(true) {	//2차원배열 출력
			System.out.println("[2차원 배열 출력]");
			System.out.println("-----------------------------------------------------------");
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();	
			}
			System.out.println("-----------------------------------------------------------");
			
			if(count==25) {
				System.out.println("25번의 x표시가 완료되었습니다.");
				System.out.println("[프로그램 종료]");
				break;
			}// 제일 마지막에 입력
			
			
			System.out.println("1-25까지 숫자를 입력하세요>>");
			int input = scan.nextInt();
			//입력한 숫자가 1-25를 벗어나면 잘못 입력되었다고 출력
			if((input<0) || (input>25)) {
				System.out.println("잘못입력되었습니다. 다시 입력하세요"); 
				System.out.println();
				continue;
			}
			
			
			// 1-25까지의 숫자를 넣으면 x 표시가 나타나도록 구현하시오
			String input_str = ""+input; // 숫자를 문자로 바꿈
			
			int temp = 0; // 중복번호
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					if(arr[i][j].equals(input_str)) {
						arr[i][j] = "X";
						temp = 1;
						count++; // 할 때마다 번호입력 횟수
					}
				}
			}
			// 중복된 번호를 적었을 때 안내문
			if(temp==0) {
				System.out.printf("%s번은 입력된 숫자입니다. 다시 입력하세요",input_str);
				System.out.println();
			}
			
			
			System.out.println("입력한 숫자: "+input);
			System.out.println();
			
		}
		
		
		}//c
	}//m

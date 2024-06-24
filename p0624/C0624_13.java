package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0624_13 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		final int STU = 10;
		
		Stu_score[] sc= new Stu_score[10];
		
		String[] stuNo = new String[STU];
		String[] name = new String[STU];
		int[][] score = new int[STU][4];
		double[] avg = new double[STU];
		int[] rank = new int[STU];
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0; //1번
		Stu_pro pro = new Stu_pro();
		
		while(true) {
			int choice = pro.screen();
			
			switch(choice) {
			case 1:
				pro.stu_input(sc);
				break;
				
				
			}
			
		}//while

	}//main

}//class

package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Stu_pro {
	int s_count = 0;
	Scanner scan  = new Scanner(System.in);
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	String stuNo, name;
	int kor,eng,math,total,rank;
	double avg;
	
	int screen() {
		System.out.println("[학생성적 프로그램]");
		System.out.println("-------------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요>>");
		int choice = scan.nextInt();
		scan.nextLine();
		
		return choice;
	}//screen
	void stu_input(Stu_score[] sc) {
		while(true) {
			System.out.println("[학생 성적입력]");
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yy");
			String stuNo1 = "S" + sdf.format(date) + String.format("%03d", s_count+1);
			//학번저장
			stuNo = stuNo1;
			System.out.println("학생번호: "+stuNo1);
			//이름저장
			System.out.println("이름입력(0. 이전화면 이동)");
			name = scan.nextLine();
			
			if(name.equals("0")) {
				System.out.println("이전화면 이동");
				System.out.println();
				break;
			}
			//점수 저장
			System.out.println("국어점수");
			kor = scan.nextInt();
			System.out.println("영어점수");
			eng = scan.nextInt();
			System.out.println("수학점수");
			math = scan.nextInt();
			scan.nextInt();
			
			sc[s_count] = new Stu_score(name,kor,eng,math);
			
			//입력완료
			System.out.printf("%s 학생성적이 저장되었습니다.\n",name);
			System.out.println();
			
			s_count++;
		}
		
	}
}

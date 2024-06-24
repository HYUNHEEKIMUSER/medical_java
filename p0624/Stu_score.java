package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stu_score {
	//초기화블럭
	{
		count++;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		//S20240001, S20240002....
		this.stuNo = "S"+sdf.format(d)+String.format("%03d", count);
	}
	
	//기본생성자 - 내가 안만들면 자동으로 생성됨
	Stu_score(){} // Stu_score s2 = new Stu_score;로 새로 만들어줘야 사용가능
	
	//매개변수 생성자
	Stu_score(String name,int kor,int eng,int math){ //이것이 있으면 Stu_score()는 사용못함
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avg = total/3.0;
	}
	
	static int count; // 클래스변수 - 모든 객체가 공통으로 사용
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
}

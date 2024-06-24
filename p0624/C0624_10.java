package p0624;

public class C0624_10 {

	public static void main(String[] args) {
		Stu_score s = new Stu_score();
		s.stuNo = "s0001";
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 99;
		s.math = 87;
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3.0;
		
		Stu_score s2 = new Stu_score("s0002","유관순",100,80,85);
		
		Stu_score s3 = new Stu_score();
		
		
		

	}

}

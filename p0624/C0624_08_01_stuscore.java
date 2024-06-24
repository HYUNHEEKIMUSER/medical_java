package p0624;

public class C0624_08_01_stuscore {

	public static void main(String[] args) {
		
		Stu_score s= new Stu_score("s0001","홍길동",100,99,90);
		s.kor = 100; //참조변수명.변수명
		System.out.println(s.total);
		System.out.println(s.avg);
		System.out.println(s.kor);
		Stu_Score s2 = new Stu_score();
	}

}

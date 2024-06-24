package p0624;

public class C0624_12_01 {

	public static void main(String[] args) {
		Stu_score[] sc = new Stu_score[10]; //배열선언
//		int count = Stu_score.count;
		Stu_process sp = new Stu_process();
		
		while(true) {
			int choice = sp.screen(); //인스턴스 메서드 - 객체생성 후 참조변수명.메소드명
						
			switch(choice) {
			case 1: //학생성적입력
				sp.stu_input(sc);
				break;
			
			case 2: //학생성적출력
				sp.stu_output(sc);
				break;
			
			case 5: //등수처리
				sp.stu_rank(sc);
				break;
			}//switch
		}//while
	}//main
}//class

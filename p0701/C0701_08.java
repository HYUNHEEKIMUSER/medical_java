package p0701;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class C0701_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Students> list = new ArrayList<Students>();
		//입력
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = scan.nextInt();

		list.add(new Students(name,kor,eng,math));
		
		
		
		//1.txt에 내용을 파일에 저장하시오
//		String str = ""+list.get(0);
//		System.out.println(str);
		try {
			FileWriter fr = new FileWriter("c:/save/1.txt",true);
			BufferedWriter bw = new BufferedWriter(fr);
			bw.write(""+list.get(0)); // bw.write(str); 도 맞음
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일에 내용을 저장했습니다.");

		
		
//		for(int i=0; i<list.size(); i++) {
////			System.out.println(list.get(i).getName()+","+list.get(i).getTotal()+","+list.get(i).getAvg());	}
//			Students s = list.get(i);
//			System.out.println(s);
//		}
		
		
		
		
		System.out.println("List 학생성적이 저장되었습니다.");
		
	
//		
		//출력
//		list.add(new Students("홍길동",100,100,100));
//		list.add(new Students("유관순",90,90,90));
//		list.add(new Students("이순신",70,70,70));
//		//이름,합계,평균만 모두 출력하세요
//		
//		for(int i=0; i<list.size(); i++) {
////			Students s = list.get(i); -> s.getName();으로 형변환 해도 됨.
//			System.out.println(list.get(i).getName()+","+list.get(i).getTotal()+","+list.get(i).getAvg());			
//		}
		
	}//m
}//c

package p0627;

public class C0627_03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(0/0); //error // 2번까지만 실행
		
		try {
			//예외가 발생될 것 같은 경우
			System.out.println(3);
			
			System.out.println(0/0); //error //4번빼고 다시 실행
			System.out.println(4);
			
		}catch(Exception e){
			System.out.println(5); //3,4번이 문제없으면 5번 건너뛰고 6번실행
			e.printStackTrace();// 어떤 에러가 났는 지 알려줌
		}
	
		System.out.println(6);

	}

}

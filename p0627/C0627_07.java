package p0627;

public class C0627_07 {

	public static void main(String[] args) {
		Person p1 = new Person(8801011011111L);
		Person p2 = new Person(8801011011111L);
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1.equals(p2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		Students s = new Students("홍길동",100,100,99); //students에서 overriding
		System.out.println(s);
		
		String str = "백신 위탁생산 세계 톱10 수준의 독일 기업 인수 소식이 주가에 영향을 미치고 있는 것으로 보이다.\r\n"
				+ "\r\n"
				+ "출처 : 핀포인트뉴스(https://www.pinpointnews.co.kr)";
		System.out.println(str.hashCode());
		str = "하인크코리아 해성티피씨 와이더플래닛 선진뷰티사이언스 피엔에이치테크, 유일에너테크 프레스티지바이오파마 쿠콘 프레스티지바이오로직스 진시스템 바이오다인 에이치피오 LB루셈 SK아이이테크놀로지 제주맥주  씨앤씨인터내셔널 모비릭스 SK바이오사이언스 핑거 아모센스 엔시스 오로스테크놀로지 삼영에스앤씨 모비데이즈 자이언트스텝 솔루엠 레일보우로보틱스 나노씨엠에스 아이퀘스트 씨앤투스 싸이버원 네오이뮨텍 이삭엔지니어링 파이버프로 샘씨엔에스 에이디엠코리아 뷰노 이노뎁 씨이랩 엔비티 라이프시맨틱스 등이 있다.\r\n"
				+ "\r\n"
				+ "출처 : 핀포인트뉴스(https://www.pinpointnews.co.kr)";
		System.out.println(str.hashCode());
		
	}

}

package p0628;

public class C0628_05 {

	public static void main(String[] args) {
		
		//[String]
		String str = "123";
		str = str+"12"; 
		
		//[StringBuffer] -> toString으로 다시 변경 후  equals로 비교해야 됨
//		StringBuffer sb = "123" 에러
		StringBuffer sb = new StringBuffer("123");
		System.out.println(str);
		
//		sb = sb +"12"; 에러
		sb.append("12");
		System.out.println(sb);
		
		int a = 10;
		int b = 5;
		int c = 100;
		Math.max(a, b); //max는 두개만
		System.out.println(Math.max(Math.max(a, b),c));
	}

}

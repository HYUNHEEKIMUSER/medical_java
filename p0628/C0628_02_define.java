package p0628;

import java.util.Arrays;

public class C0628_02_define {

	public static void main(String[] args) {
		// charAt
		String str = "Hello world!";
		char ch = str.charAt(0); //지정한 위치에 있는 문자 1개를 가져옴
		System.out.println(ch);
		System.out.println("----------------------------------------------------------");
		
		//concat
		String s = "안녕하세요";
		String s2 = "홍길동입니다.";
		System.out.println(s+s2);
		System.out.println(s.concat(s2)); //문자열 합치기
		System.out.println("----------------------------------------------------------");
		
		//contains
		System.out.println(s.contains("하")); //문자열에 문자가 포함되어 있는 지 확인
		System.out.println("----------------------------------------------------------");
		
		//s.endswith("요") 문자 마지막 맞는 지 확인 - 지정된 문자열로 끝나는 지 확인
		String e = "abc.txt";
		System.out.println(e.endsWith("txt"));
		System.out.println("----------------------------------------------------------");

		//indexOf ->그 문자가 있는 지 확인, 해당문자열이 있으면 위치값을 리턴, 없으면 -1을 리턴
		String i = "abcdefghijklmn";
		System.out.println(i.indexOf("f"));
		System.out.println(i.indexOf("z"));
		System.out.println("----------------------------------------------------------");

		//Substring
		String sub = "abc aaa aac bbc bbb";
		System.out.println(sub.length());
		System.out.println(sub.substring(8,15));
		System.out.println(sub.substring(8));
		System.out.println("----------------------------------------------------------");

		//length -> 문자열 길이를 확인
		String l = "안녕하세요. 반갑습니다.";
		System.out.println(l.length());
		System.out.println("----------------------------------------------------------");

		//replace - 문자열 중 해당 문자열을 다른 문자열로 대체
		String r = "화면을 중지합니다. 중지하려면 중지버튼을 클릭하세요.";
		String r2 = r.replace("중지","stop");
		System.out.println(r);
		System.out.println(r2);
		System.out.println("----------------------------------------------------------");
		
		//split -> 문자열을 분리자로 나누어 문자열로 리턴
		String sp = "국어, 영어, 수학, 합계";
		String[] spArr = sp.split(",");
		System.out.println(Arrays.toString(spArr));
		String sp2  = "국어/영어/수학/합계";
		String[] spArr2 = sp.split(",");
		System.out.println(Arrays.toString(spArr2));
		System.out.println("----------------------------------------------------------");
		
		//trim -> 문자열 공백제거, 내부 공백은 제거 안함
		String tr = "       안녕하 세요 반갑습니 다                ";
		System.out.println(tr);
		System.out.println(tr.trim());
		//모든 공백제거
		System.out.println(tr.replace(" ", ""));
		System.out.println("----------------------------------------------------------");
		
		//integer.parseInt -> "100"을 100으로 변환 (parseDouble 등 다 쓸 수 있음)
		//기본형 값을 문자열로 바꾸는 법
		int num = 100;
		String st1 = num+""; // 100을 "100"으로 변환
		String st2 = String.valueOf(num);
		System.out.println("----------------------------------------------------------");

		
		
		
	}//m
}//c

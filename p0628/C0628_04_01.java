package p0628;

public class C0628_04_01 {

	public static void main(String[] args) {
		String str = "abcdeakabcdefga";
		System.out.println(str);
		System.out.println(str.indexOf("a"));
		System.out.println("str: "+str.substring(1));
		String str2 = str.substring(1);
		System.out.println("index: "+str2.indexOf("a"));
		System.out.println("str: "+str2.substring(5));
		String str3 = str2.substring(5);
		System.out.println(str3.indexOf("a"));
		String str4  = str3.substring(2);
		System.out.println(str4.indexOf("a"));

	}

}

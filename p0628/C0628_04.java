package p0628;

import java.util.Scanner;

public class C0628_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("찾고자하는 문자열을 입력하세요 >");
		String search = scan.next();

		String str1 = "asgvonobeaade";
		System.out.println("해당 문자열: "+str1);
		int count = 0;
		while(true) {
			int num = 0;
			num =  str1.indexOf(search);
			if(num==-1) {
				break; //해당하는 문자열을 못찾을 때 -1을 리턴
			}else {
				count++;
				str1 = str1.substring(num+1);
//				str1 = str1.substring(num+2); 두개의 문자열을 찾을 때
				}
			}
		System.out.printf("%s 찾는 문자열 갯수: %d \n",search,count);
		}

}//c

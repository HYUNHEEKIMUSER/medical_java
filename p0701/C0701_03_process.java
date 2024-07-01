package p0701;

import java.util.ArrayList;
import java.util.*;

public class C0701_03_process {

	public static void main(String[] args) {
		Process p = new Process();
		ArrayList<Card_2> clist =p.clistAdd();
		
		ArrayList<Students> slist = p.slistAdd();
		
		// Card list 가져와서 출력 
		for(int i=0; i<clist.size(); i++) {
			System.out.println(clist.get(i));
			
		}
		System.out.println("----------------------------------------------");
		// students list 가져와서 출력
		for(int i=0; i<slist.size(); i++) {
			System.out.println(slist.get(i));
		}
		System.out.println("----------------------------------------------");

		//2개 모두 가져와서 출력
		HashMap<String,Object> map = p.listAdd();
		clist =(ArrayList<Card_2>)map.get("clist"); //형변환
		for(int i=0; i<clist.size(); i++) {
			System.out.println(clist.get(i));
		}
		System.out.println("----------------------------------------------");
		slist =(ArrayList<Students>)map.get("slist"); //형변환
		for(int i=0; i<slist.size(); i++) {
			System.out.println(slist.get(i));
			}
		
		}//m
	}//c



package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Process {
	List<Card> list = new ArrayList();
	
	ArrayList<Card_2> clist = new ArrayList();
	ArrayList<Students> slist = new ArrayList();
	
	Process(){}
	
	public Process(ArrayList<Card_2> clist, ArrayList<Students> slist) {
		this.clist = clist;
		this.slist = slist;
	}
	
	//Card list 보내기
	ArrayList<Card_2> clistAdd(){ //인스턴스 메소드
		clist.add(new Card_2(1,"CLOVER"));
		clist.add(new Card_2(2,"CLOVER"));
		clist.add(new Card_2(3,"CLOVER"));
		clist.add(new Card_2(4,"CLOVER"));
		clist.add(new Card_2(5,"CLOVER"));
		return clist;
	}
	
	public ArrayList<Card_2> getClist() {
		return clist;
	}

	public void setClist(ArrayList<Card_2> clist) {
		this.clist = clist;
	}

	//students list 보내기
	ArrayList<Students> slistAdd(){
		slist.add(new Students("홍길동",100,100,99));
		slist.add(new Students("유관순",100,70,70));
		slist.add(new Students("이순신",80,80,80));
		slist.add(new Students("김구",100,80,90));
		slist.add(new Students("강감찬",80,90,90));
		
		return slist;
	}
	
	

	public ArrayList<Students> getSlist() {
		return slist;
	}

	public void setSlist(ArrayList<Students> slist) {
		this.slist = slist;
	}


	
	//2개를 모두 보내기
	HashMap<String,Object> listAdd() {
//		Map<String,Object> map = new HashMap<String, Object>(); //ctrl+shift+m
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("clist", clistAdd());
		map.put("slist", slistAdd());
		return map;
	}

	
	
}

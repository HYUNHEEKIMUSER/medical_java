package p0624;

public class C0624_01 {

	public static void main(String[] args) {
		//객체선언 후 참조변수명.변수명
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x는: "+d.x);	
	
		change(d.x);
		System.out.println("d.x2 : "+d.x);
	
	}//main
	static void change(int x) {
		x= 1000;
		System.out.println("change x: "+x);
	}

}//class

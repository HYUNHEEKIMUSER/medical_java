package p0701;

public class C0701_01 {
	public static void main(String[] args) {
		Card_2 c  = new Card_2();
//		c.setPassword("1111"); //private했으면 set, get으로 읽어올 수 있음
//		c.number = 15;
		c.setNumber(10); //13까지 제한 걸음
		System.out.println(c.getNumber());
//		System.out.println(c.getPassword("admin")); // id가 다르면 안찍힘
		System.out.println();
	}
}

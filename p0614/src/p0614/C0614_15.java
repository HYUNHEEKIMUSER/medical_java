package p0614;

public class C0614_15 {

	public static void main(String[] args) {
		System.out.println((float)0.1d==0.1f);
		double num = 0.1d;
		System.out.println("double타입: "+num);
		
		double d = (double)0.1f;
		System.out.println("float타입변경: "+d);
	//---------------------------------------------------
		// | or / & and / ^ nor
		System.out.println(0.1d==0.1f);
		double num1 = 0.1d;
		System.out.println("double타입: "+num1);
		
		double d1 = (double)0.1f;
		System.out.println("float타입변경: "+d1);
	}

}

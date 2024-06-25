package p0625;

public class Point {
	int x;
	int y;
	
	Point(){this(0,0);} //기본생성자 or super()붙이기
		
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}

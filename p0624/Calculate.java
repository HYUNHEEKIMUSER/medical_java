package p0624;

public class Calculate {
	//cal()
	//return result;
	
	int result = 0;
	int cal(int x, int x2, String str) {
	int cal(int [] arr,String str) ->int x, x2를 arr로 묶음
		switch(str) {
		case "+":
			result = arr[0] + arr[1];
//			result = x+x2;
			break;
		
		
		case "-":
			result = arr[0] - arr[1];
//			result = x-x2;
			break;
		
	
		case "*":
			result = arr[0] * arr[1];
//			result = x*x2;
			break;
		
	
		case "/":
			
			result = arr[0] / arr[1];
//			result = x/x2;
			break;
			}
	return result;
	}
	
}

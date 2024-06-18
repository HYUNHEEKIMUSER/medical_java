package p0618;

public class C0618_11 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] arr2 = {1,2,3,4,5};
		//2차원 배열 -> [] 두개 
		int[][] score= new int[5][3];
		score[0][0] = 100;
		score[0][1] = 100;
		score[0][2] = 100;
		score[1][0] = 90;
		score[1][1] = 90;
		score[1][2] = 90;
		score[2][0] = 80;
		score[2][1] = 80;
		score[2][2] = 80;
		score[3][0] = 70;
		score[3][1] = 70;
		score[3][2] = 70;
		score[4][0] = 60;
		score[4][1] = 60;
		score[4][2] = 60;
		
		int[][] score2 = {
				{100,100,100},	
				{90,90,90},	
				{80,80,80},	
				{70,70,70},	
				{60,60,60},			
		};
				
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<3;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}

	}

}

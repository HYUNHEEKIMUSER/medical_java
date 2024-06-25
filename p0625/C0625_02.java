package p0625;

import java.util.Arrays;

public class C0625_02 {

	public static void main(String[] args) {
		Card[] c = new Card[52];
		
		int[] number = new int[52];
		for(int i=0; i<52; i++) {
			number[i] = i+1;
		}
		System.out.println(Arrays.toString(number));
		
		int[] card = new int[52];
		String[] kind = new String[52];
		String[] shape = {"CLOVER","HEART","DIAMOND","SPADE"};
		for(int i=0; i<52; i++) {
			card[i] = i%13+1;
			kind[i] = shape[i/13];
			}
		
		System.out.println(Arrays.toString(card));
		System.out.println(Arrays.toString(kind));
		

	}//m

}//c

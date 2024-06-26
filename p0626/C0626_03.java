package p0626;

import java.util.Arrays;

public class C0626_03 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {1,2,4,5};
		
		arr[2] = 0;
		System.out.println(Arrays.toString(arr));

		
		int[] arr3 = new int[5];
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 5;
		arr3[3] = 3;
		arr3[4] = 4;
		System.out.println(arr.length);
	}

}

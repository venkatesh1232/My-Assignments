package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);

		int num = 1;

		for (int i = 0; i < arr.length; i++) { 
			if (arr[i]==num) {
				num++;		
			}
			else {
				System.out.println(num);
				break;
			}
		}
	}

}

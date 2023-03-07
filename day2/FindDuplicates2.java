package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class FindDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};		
		/*for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]);
					
				}
				
			}
			
		}*/
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
				System.out.println(arr[i]);
				
			}
			
		}
	}

}

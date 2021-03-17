package randomized;

import java.util.Arrays;
import java.util.Random;

public class PermuteBySorting {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4};
		
		int len = a.length;
		double max = Math.pow(len, 3);
		
		int[] priority = new int[len];
		
		Random r = new Random();
		
		for(int i = 0; i < len; i++) {
			priority[i] = r.nextInt((int)max)+1;
		}
		

		//Sort a using priority array to randomize a
		//use any efficient sorting algorithm
		for(int i = 0; i < priority.length; i++) {
			int key = priority[i];
			int elem = a[i];
			
			int j = i-1;
			
			while(j >= 0 && priority[j] > key) {
				priority[j+1] = priority[j];
				a[j+1] = a[j];
				j--;
			}
			priority[j+1] = key;
			a[j+1] = elem;
		}
		
		System.out.println("Randomizing input array...");
		System.out.println(Arrays.toString(a));
	}

}

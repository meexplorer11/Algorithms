package sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {31, 41, 59, 26, 41, 58};
		
		System.out.println("Array before sorting: "+Arrays.toString(a));
		
		sort(a);
	}

	/**Sorts in ascending order*/
	public static void sort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int min_key = i;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[min_key]) {
					min_key = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[min_key];
			a[min_key] = temp;
		}
		System.out.println("Array after sort(ascending): "+Arrays.toString(a));
	}
	
}

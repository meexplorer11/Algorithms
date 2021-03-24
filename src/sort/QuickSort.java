package sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		
		System.out.println("Before Sort: "+Arrays.toString(a));
		sort(a, 0, a.length-1);
		System.out.println("After  Sort: "+Arrays.toString(a));
	}

	private static void sort(int[] a, int low, int high) {
		if (low < high) {
			int pivot = partition(a, low, high);
			
			sort(a, low, pivot-1);
			sort(a, pivot+1, high);
		}
	}
	
	private static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low-1;

		for (int j = low; j<high; j++) {
			
			if(a[j] <= pivot) {
				i++;
		
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		
		return i+1;
	}
}

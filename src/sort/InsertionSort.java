package sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 6, 1, 3};
		System.out.println("Before sorting: "+Arrays.toString(arr));
		
		sort(arr);
		
		descendingSort(arr);
	}

	/**Sorts in increasing order*/
	public static void sort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && key < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println("After sorting(ascending order): "+Arrays.toString(arr));
	}
	
	/**Descending order sort*/
	public static void descendingSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && key > arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println("After sorting(descending order): "+Arrays.toString(arr));
	}
}

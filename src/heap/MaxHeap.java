package heap;

import java.util.Arrays;

public class MaxHeap {
	
	private static int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};

	public static void main(String[] args) {
		sort(a);
	}
	
	private static void sort(int[] a) {
		System.out.println("Array before sorting: "+Arrays.toString(a));
		buildMaxHeap(a);
		
		for (int i = a.length - 1; i>=0; i--) {
			swap(0, i);
			maxHeapify(a, i, 0);
		}
		
		System.out.println("Array After  sorting: "+Arrays.toString(a));
	}

	private static void buildMaxHeap(int[] a) {
		int heapSize = a.length - 1;
		
		for (int i = heapSize / 2 - 1; i >= 0; i--) {
			maxHeapify(a, heapSize, i);
		}
	}

	private static void maxHeapify(int[] a, int heapSize, int i) {
		int left = left(i);
		int right = right(i);
		
		int largest = i;
		
		if(left < heapSize && a[left] > a[largest]) {
			largest = left;
		}
		
		if(right < heapSize && a[right] > a[largest]) {
			largest = right;
		}
		
		if(largest != i) {
			swap(i, largest);
			maxHeapify(a, heapSize, largest);
		}
	}

	private static void swap(int i, int largest) {
		int temp = a[i];
		a[i] = a[largest];
		a[largest] = temp;
	}

	private static int left(int i) {
		return 2 * i + 1;
	}
	
	private static int right(int i) {
		return 2 * i + 2;
	}
	
}

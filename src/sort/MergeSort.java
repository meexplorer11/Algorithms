package sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = {5, 2, 4, 7, 1, 3, 2, 6};
		
		System.out.println("Array before sort: "+Arrays.toString(a));
		mergeSort(a, 0, a.length-1);
		System.out.println("Array after sort: "+Arrays.toString(a));
	}
	
	public static void mergeSort(int[] a, int p, int r) {
		if (p < r) {
			int mid = p + (r-p) / 2;
			
			mergeSort(a, p, mid);
			mergeSort(a, mid+1, r);
			
			merge(a, p, mid, r);
		}
	}

	private static void merge(int[] a, int p, int mid, int r) {
		int n1 = mid-p+1;
		int n2 = r-mid;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i=0; i<n1; i++) {
			left[i] = a[p+i];
		}
		
		for(int i=0; i<n2; i++) {
			right[i] = a[mid+1+i];
		}
		
		int l_idx = 0, r_idx = 0, k=p;
		
		while(l_idx < n1 && r_idx < n2) {
			if(left[l_idx] <= right[r_idx]) {
				a[k] = left[l_idx];
				l_idx++;
			} else {
				a[k] = right[r_idx];
				r_idx++;
			}
			k++;
		}
		
		while(l_idx < n1) {
			a[k] = left[l_idx];
			l_idx++;
			k++;
		}
		
		while(r_idx < n2) {
			a[k] = right[r_idx];
			r_idx++;
			k++;
		}
	} 

}

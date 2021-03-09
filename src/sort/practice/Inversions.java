package sort.practice;

/**
 * A[0...n]
 * if i<j but a[i] > a[j]
 * then the pair is called an inversion. 
 *
 */
public class Inversions {

	//O(n*2)
	public static void main(String[] args) {
		int[] a = {2, 3, 8, 6, 1};
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					System.out.println("Inversion found: {"+a[i]+", "+a[j]+"}");
				}
			}
		}
	}

}

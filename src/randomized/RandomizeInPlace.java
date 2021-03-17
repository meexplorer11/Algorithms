package randomized;

import java.util.Arrays;
import java.util.Random;

public class RandomizeInPlace {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4};
		
		int len = a.length;
		
		Random r = new Random();
		
		for(int i = 0; i < len; i++) {
			int otherIdx = r.nextInt((len-i))+i;

			int temp = a[i];
			a[i] = a[otherIdx];
			a[otherIdx] = temp;
		}
		
		System.out.println("Randomizing array...");
		System.out.println(Arrays.toString(a));
	}

}

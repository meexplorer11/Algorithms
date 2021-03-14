package sort.practice;

public class MaxSubArray {

	public static void main(String[] args) {
		//Makes sense if array has +ve and -ve both
		int[] miscInts = new int[] {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		
		//If arrays has only +ve numbers, the whole array is the maximum sub-array
		//uncommenting the below would return the whole array with sum of all elements
		//int[] a = new int[] {13, 3, 25, 20, 3, 16, 23, 18, 20, 7, 12, 5, 22, 15, 4, 7};
		
		int sum = 0;
		int maxSum = 0;
		int left = 0;
		int right = 0;
		int temp = 0;
				
		for(int i=0; i < miscInts.length; i++) {
			sum += miscInts[i];
			
			if(sum > maxSum) {
				maxSum = sum;
				left = temp;
				right = i;
			}

			if(sum < 0) {
				sum = 0;
				temp = i+1;
			}
		}
		
		System.out.println("Maximum sub-array: ["+left+", "+right+"] with sum= "+maxSum);
	}

}

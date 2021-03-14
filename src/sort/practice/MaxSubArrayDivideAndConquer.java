package sort.practice;

public class MaxSubArrayDivideAndConquer {

	public static void main(String[] args) {
		//Makes sense if array has +ve and -ve both
		int[] miscInts = new int[] {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
		
		//If arrays has only +ve numbers, the whole array is the maximum sub-array
		//uncommenting the below would return the whole array with sum of all elements
		//int[] a = new int[] {13, 3, 25, 20, 3, 16, 23, 18, 20, 7, 12, 5, 22, 15, 4, 7};
		
		int[] tuple = findMaxSubArray(miscInts, 0, miscInts.length-1);
		
		System.out.println("Maximum sub-array: ["+tuple[0]+", "+tuple[1]+"] with sum= "+tuple[2]);
	}

	private static int[] findMaxSubArray(int[] a, int low, int high) {
		if(low == high) {
			return new int[] {low, high, a[low]};
		} else {
			int mid = low+(high-low)/2;
			
			int[] leftTuple = findMaxSubArray(a, low, mid);
			
			int[] rightTuple = findMaxSubArray(a, mid+1, high);
			
			int[] crossingTuple = findCrossingMaxSubArray(a, low, mid, high);
			
			if(leftTuple[2] >= rightTuple[2] && leftTuple[2] >= crossingTuple[2]) {
				return leftTuple;
			} else if(rightTuple[2] >= leftTuple[2] && rightTuple[2] >= crossingTuple[2]) {
				return rightTuple;
			} else {
				return crossingTuple;
			}
		}
	}
	
	private static int[] findCrossingMaxSubArray(int[] a, int low, int mid, int high) {
		int leftSum = 0;
		int sum = 0;
		int maxLeftIdx = -1;
		for(int i = mid; i >= low; i--) {
			sum += a[i];
			if(sum > leftSum) {
				leftSum = sum;
				maxLeftIdx = i;
			}
		}
		
		sum = 0;
		int rightSum = 0;
		int maxRightIdx = -1;
		
		for(int i = mid+1; i <= high; i++) {
			sum += a[i];
			if(sum > rightSum) {
				rightSum = sum;
				maxRightIdx = i;
			}
		}
		
		return new int[] {maxLeftIdx, maxRightIdx, leftSum+rightSum};
	}

}

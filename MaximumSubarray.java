
public class MaximumSubarray {
	
	public static int [] findMaximumSubarray(int [] a) {
		int maxStartIndex = 0;
		int maxEndIndex = 0;
		int max = 0;
		for(int i = 0; i < a.length; i++) {
			int currentSum = 0;
			for(int j = i; j < a.length; j++) {
				currentSum += a[j];
				if(currentSum > max) {
					max = currentSum;
					maxEndIndex = j;
					maxStartIndex = i;
				}
			}
		}
		return new int[] {maxStartIndex, maxEndIndex, max};
	}
	
	//array size of 1 is maximum subarray (base case)
	//split into two sets
	//big largest maximum subarray
	

	public static void main(String[] args) {
		int [] a = findMaximumSubarray(new int[] {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7});
		System.out.println(a[0] + " " + a[1] + " " + a[3]);

	}

}

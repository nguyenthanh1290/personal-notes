package codility.maxsliceproblem.maxdoubleslicesum;

public class MaxDoubleSliceSum {
	/*
	 * https://app.codility.com/demo/results/trainingZQNQX2-N6D/
	 * Detected time complexity: O(N)
	 * Solution:
	 * - ignore A[0] and A[N-1]
	 * - the gap is two indexes 
	 */
	public int solution(int[] A) {
		int[] forwardSum = new int[A.length];
		int[] backwardSum = new int[A.length];

		for (int i = 1; i < A.length - 1; i++) {
			forwardSum[i] = Math.max(0, forwardSum[i - 1] + A[i]);
		}
		for (int i = A.length - 2; i >= 1; i--) {
			backwardSum[i] = Math.max(0, backwardSum[i + 1] + A[i]);
		}

		int max = 0;
		for (int i = 0; i < A.length - 2; i++) {
			max = Math.max(max, forwardSum[i] + backwardSum[i + 2]);
		}

		return max;
	}

	public static void main(String[] args) {
		MaxDoubleSliceSum max = new MaxDoubleSliceSum();

		System.out.println(max.solution(new int[] { 3, 2, 6, -1, 4, 5, -1, 2 }));
		/*
		 * forwardSum: [0, 2, 8, 7, 11, 16, 15, 0]
		 * backwardSum: [0, 16, 14, 8, 9, 5, 0, 0]
		 * result: 17
		 */
	}

}

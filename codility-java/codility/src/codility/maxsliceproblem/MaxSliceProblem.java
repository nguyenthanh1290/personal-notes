package codility.maxsliceproblem;

public class MaxSliceProblem {

	/*
	 * prefix sums: O(n^2)
	 */
	public int solution1(int[] A) {
		int[] prefixSums = new int[A.length + 1];
		for (int i = 1; i < A.length + 1; i++) {
			prefixSums[i] = prefixSums[i - 1] + A[i - 1];
		}

		int maxSum = 0;
		for (int p = 0; p < A.length; p++) {
			for (int q = p; q < A.length; q++) {
				int sum = prefixSums[q + 1] - prefixSums[p];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}

		return maxSum;
	}

	/*
	 * without prefix sums: O(n^2)
	 */
	public int solution2(int[] A) {
		int maxSum = 0;
		for (int p = 0; p < A.length; p++) {
			int sum = 0;
			for (int q = p; q < A.length; q++) {
				sum += A[q];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}

		return maxSum;
	}

	/*
	 * O(n)
	 */
	public int solution(int[] A) {
		int maxEnding = 0;
		int maxSlice = 0;
		for (int a : A) {
			if (maxEnding + a > 0) {
				maxEnding += a;
			} else {
				maxEnding = 0;
			}
			if (maxEnding > maxSlice) {
				maxSlice = maxEnding;
			}
		}
		return maxSlice;
	}

	public static void main(String[] args) {
		MaxSliceProblem max = new MaxSliceProblem();

		System.out.println(max.solution(new int[] { 1, 2, 3, 4, 5 })); // 15
		System.out.println(max.solution(new int[] { 5, -7, 3, 5, -2, 4, -1 })); // 10
		System.out.println(max.solution(new int[] { 5, -1 })); // 5

	}

}

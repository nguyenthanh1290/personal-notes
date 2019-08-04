package codility.timecomplexity.perm;

import java.util.Iterator;

public class PermMissingElem {
	/*
	 * https://app.codility.com/demo/results/trainingBE5P23-585/
	 * Detected time complexity: O(N) or O(N * log(N))
	 * Failed the test
	 */
	public int solution(int[] A) {
		if (0 == A.length) {
			return 1;
		}

		long sumA = 0L;
		for (int i = 0; i < A.length; i++) {
			sumA += A[i];
		}

		int expectedLength = A.length + 1;
		long expectedSum = expectedLength * (expectedLength + 1) / 2;

		return (int) (expectedSum - sumA);
	}

	/*
	 * https://app.codility.com/demo/results/trainingCFNWRG-KF7/
	 * Detected time complexity: O(N) or O(N * log(N))
	 * Failed the test
	 */
	public int solution2(int[] A) {
		if (0 == A.length) {
			return 1;
		}

		int expectedLength = A.length + 1;
		long expectedSum = expectedLength * (expectedLength + 1) / 2;

		for (int i : A) {
			expectedSum -= i;
		}

		return (int) (expectedSum);
	}
	
	/*
	 * O(n)
	 * Passed the test
	 * https://app.codility.com/demo/results/trainingBUKSSW-7MU/
	 * Detected time complexity: O(N) or O(N * log(N))
	 */
	public int solution3(int[] A) {
		if (0 == A.length) {
			return 1;
		}

		long sumA = 0L;
		for (int i = 0; i < A.length; i++) {
			sumA += (long) A[i];
		}

		long expectedLength = A.length + 1L;
		long expectedSum = expectedLength * (expectedLength + 1L) / 2L;

		return (int) (expectedSum - sumA);
	}
}

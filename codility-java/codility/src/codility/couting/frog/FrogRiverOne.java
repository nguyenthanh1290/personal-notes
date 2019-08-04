package codility.couting.frog;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
	/*
	 * O(n)
	 * https://app.codility.com/demo/results/trainingGQGPAH-JX6/
	 * Detected time complexity: O(N)
	 */
	public int solution(int X, int[] A) {
		Set<Integer> leaves = new HashSet<>();
		int sumX = X * (X + 1) / 2;
		int sumA = 0;
		boolean prs;

		for (int i = 0; i < A.length; i++) {
			prs = leaves.add(A[i]);
			if (prs) {
				sumA += A[i];
			}
			if (sumA == sumX) {
				return i;
			}
		}

		return -1;
	}
}

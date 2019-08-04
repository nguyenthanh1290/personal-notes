package codility.timecomplexity.tape;

public class TapeEquilibrium {
	/*
	 * O(n)
	 * https://app.codility.com/demo/results/trainingEAYYUJ-ADQ/
	 * Detected time complexity: O(N)
	 */
	public int solution(int[] A) {
		if (2 > A.length) {
			return -1;
		}

		int total = 0;
		for (int i : A) {
			total += i;
		}

		int minDiff = Integer.MAX_VALUE;
		int left = 0;
		int right;
		int diff;
		for (int i = 0; i < A.length - 1; i++) {
			left += A[i];
			right = total - left;
			diff = Math.abs(left - right);
			if (diff < minDiff) {
				minDiff = diff;
			}
		}

		return minDiff;
	}
}

package codility.sorting.maxproduct;

import java.util.Arrays;

public class MaxProductOfThree {
	/*
	 * https://app.codility.com/demo/results/training2WHXJW-KVP/
	 * Detected time complexity: O(N * log(N))
	 */
	public int solution(int[] A) {
		Arrays.sort(A);
		int length = A.length;
		int lastThree = A[length - 3] * A[length - 2] * A[length - 1];
		int firstTwoLastOne = A[0] * A[1] * A[length - 1];

		if (lastThree > firstTwoLastOne) {
			return lastThree;
		} else {
			return firstTwoLastOne;
		}
	}

	public static void main(String[] args) {
		MaxProductOfThree max = new MaxProductOfThree();

		System.out.println(max.solution(new int[] { -3, 1, 2, -2, 5, 6 })); // 60
		System.out.println(max.solution(new int[] { -3, -5, 2, -2, 5, 6 })); // 90
		System.out.println(max.solution(new int[] { -1_000, 1, 1_000 })); // 1_000_000
		System.out.println(max.solution(new int[] { -1_000, 0, 1_000 })); // 0
	}
}

package codility.maxsliceproblem.maxsum;

public class MaxSliceSum {

	/*
	 * https://app.codility.com/demo/results/training9F2HVR-AXD/
	 * Detected time complexity: O(N)
	 */
	public int solution(int[] A) {
		int maxSlice = A[0];
		int maxEnding = A[0];

		for (int i = 1; i < A.length; i++) {
			if (A[i] > maxEnding + A[i]) {
				maxEnding = A[i];
			} else {
				maxEnding += A[i];
			}
			if (maxEnding > maxSlice) {
				maxSlice = maxEnding;
			}
		}

		return maxSlice;
	}

	public static void main(String[] args) {
		MaxSliceSum max = new MaxSliceSum();

		System.out.println(max.solution(new int[] { 3, 2, -6, 4, 0 })); // 5
		System.out.println(max.solution(new int[] { -10 })); // -10
		System.out.println(max.solution(new int[] { -10, -3 })); // -3
		System.out.println(max.solution(new int[] { 5, 1 })); // 6
		System.out.println(max.solution(new int[] { -2, 1 })); // 1
		System.out.println(max.solution(new int[] { 1, 3 })); // 4
	}

}

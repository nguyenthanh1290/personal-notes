package codility.prefixsums.minavg;

public class MinAvgTwoSlice {
	/*
	 * https://app.codility.com/demo/results/trainingD8V6YE-785/
	 * Detected time complexity: O(N)
	 * 
	 * The slice contains at least two elements =>
	 * we only need to check for slices of length 2 and 3,
	 * because slices of length 4 are actually 2 slices of length 2.
	 */
	public int solution(int[] A) {
		int index = 0;
		double minAvg = (A[0] + A[1]) / 2;

		for (int i = 0; i < A.length - 1; i++) {
			double avg = (A[i] + A[i + 1]) / 2.0;
			if (avg < minAvg) {
				minAvg = avg;
				index = i;
			}
		}

		for (int i = 0; i < A.length - 2; i++) {
			double avg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
			if (avg < minAvg) {
				minAvg = avg;
				index = i;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		MinAvgTwoSlice min = new MinAvgTwoSlice();

		System.out.println(min.solution(new int[] { -10_000, 10_000 })); // 0
		System.out.println(min.solution(new int[] { 4, 2, 2, 5, 1, 5, 8 })); // 1
	}
}

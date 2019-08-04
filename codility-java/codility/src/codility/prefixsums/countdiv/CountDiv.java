package codility.prefixsums.countdiv;

public class CountDiv {
	/*
	 * https://app.codility.com/demo/results/trainingUE559U-U3G/
	 * Detected time complexity: O(1)
	 */
	public int solution(int A, int B, int K) {
		if (0 == A) {
			return B / K + 1;
		} else {
			return B / K - (A - 1) / K;
		}
	}

	public static void main(String[] args) {
		CountDiv c = new CountDiv();

		System.out.println(c.solution(6, 11, 2)); // 3
		System.out.println(c.solution(0, 2_000_000_000, 1)); // 2_000_000_001
		System.out.println(c.solution(0, 2_000_000_000, 2_000_000_000)); // 2
		System.out.println(c.solution(0, 2_000_000_000, 2)); // 1000000001
	}
}

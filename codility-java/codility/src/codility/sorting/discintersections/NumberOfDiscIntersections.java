package codility.sorting.discintersections;

public class NumberOfDiscIntersections {
	private final int MAX_INTERSECT_PAIRS = 10_000_000;

	/*
	 * Overflow here
	 * https://app.codility.com/demo/results/trainingDH4SX7-U6G/
	 * https://app.codility.com/demo/results/trainingYGXQGX-D6C/
	 */
	public int solution(int[] A) {
		int[] startPoints = new int[A.length];
		int[] endPoints = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int start = i - A[i];
			if (start < 0) {
				start = 0;
			}

			int end = i + A[i];
			if (end > A.length - 1) {
				end = A.length - 1;
			}

			startPoints[start]++;
			endPoints[end]++;
		}

		int pairs = 0;
		int activeDiscs = 0;
		for (int i = 0; i < A.length; i++) {
			if (startPoints[i] > 0) {
				pairs += activeDiscs * startPoints[i];
				pairs += startPoints[i] * (startPoints[i] - 1) / 2;

				if (pairs > MAX_INTERSECT_PAIRS) {
					return -1;
				}

				activeDiscs += startPoints[i];
			}
			activeDiscs -= endPoints[i];
		}

		return pairs;
	}

	public static void main(String[] args) {
		NumberOfDiscIntersections disc = new NumberOfDiscIntersections();

		System.out.println(disc.solution(new int[] { 1, 5, 2, 1, 4, 0 })); // 11
	}

}

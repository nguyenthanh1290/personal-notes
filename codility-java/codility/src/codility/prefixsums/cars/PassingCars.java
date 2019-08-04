package codility.prefixsums.cars;

public class PassingCars {
	private static final int MAX = 1_000_000_000;

	/*
	 * O(n)
	 * https://app.codility.com/demo/results/trainingBYSMJC-6CS/ Detected time
	 * complexity: O(N)
	 */
	public int solution1(int[] A) {
		if (0 == A.length || 1 == A.length) {
			return 0;
		}

		int sum = 0;
		for (int v : A) {
			sum += v;
		}

		int passingCars = 0;
		int leftSum = 0;
		for (int v : A) {
			if (0 == v) {
				passingCars += sum - leftSum;
				if (passingCars > MAX) {
					return -1;
				}
			}
			leftSum += v;
		}

		return passingCars;
	}

	/*
	 * O(n)
	 * https://app.codility.com/demo/results/trainingX4H4VV-S95/
	 * Detected time complexity: O(N)
	 */
	public int solution(int[] A) {
		int passingCars = 0;
		int zeroCounter = 0;

		for (int v : A) {
			if (0 == v) {
				zeroCounter++;
			}
			if (1 == v) {
				passingCars += zeroCounter;
				if (passingCars > MAX) {
					return -1;
				}
			}
		}

		return passingCars;
	}
}

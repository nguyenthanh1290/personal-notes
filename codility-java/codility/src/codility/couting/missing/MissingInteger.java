package codility.couting.missing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
	/*
	 * O(n * log(n))
	 * https://app.codility.com/demo/results/training3HGWF7-6H3/
	 * Detected time complexity: O(N) or O(N * log(N))
	 */
	public int solution1(int[] A) {
		Arrays.sort(A); // O(n*log(n))
		int min = 1;
		for (int v : A) {
			if (v == min) {
				min++;
			}
		}

		return min;
	}

	/*
	 * O(n)
	 * https://app.codility.com/demo/results/trainingT4YJ7P-EHF/
	 * Detected time complexity: O(N) or O(N * log(N))
	 */
	public int solution(int[] A) {
		Set<Integer> ints = new HashSet<>();
		for (int v : A) {
			if (v > 0) {
				ints.add(v);
			}
		}

		int min = 1;
		while (ints.contains(min)) {
			min++;
		}

		return min;
	}
}

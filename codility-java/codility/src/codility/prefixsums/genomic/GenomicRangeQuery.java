package codility.prefixsums.genomic;

import java.util.Arrays;

public class GenomicRangeQuery {
	/*
	 * Failed: performance issue
	 * O(n)
	 * https://app.codility.com/demo/results/trainingTDSSUA-393/ Detected time
	 * complexity: O(N * M)
	 */
	public int[] solution1(String S, int[] P, int[] Q) {
		int[] result = new int[P.length];

		for (int i = 0; i < P.length; i++) {
			int lower = P[i];
			int upper = Q[i] + 1;

			String strip = S.substring(lower, upper);
			if (strip.contains("A")) {
				result[i] = 1;
			} else if (strip.contains("C")) {
				result[i] = 2;
			} else if (strip.contains("G")) {
				result[i] = 3;
			} else {
				result[i] = 4;
			}
		}

		return result;
	}

	/*
	 * O(n+m)
	 * https://app.codility.com/demo/results/trainingC5M6Q8-Y56/
	 * Detected time complexity: O(N + M)
	 */
	public int[] solution(String S, int[] P, int[] Q) {
		int[][] counter = new int[3][S.length() + 1];
		for (int i = 0; i < S.length(); i++) {
			int a = 0, c = 0, g = 0;
			switch (S.charAt(i)) {
			case 'A':
				a = 1;
				break;
			case 'C':
				c = 1;
				break;
			case 'G':
				g = 1;
				break;
			}
			counter[0][i + 1] = counter[0][i] + a;
			counter[1][i + 1] = counter[1][i] + c;
			counter[2][i + 1] = counter[2][i] + g;
		}

		int[] result = new int[P.length];
		for (int i = 0; i < P.length; i++) {
			int from = P[i];
			int to = Q[i] + 1;

			if (counter[0][to] - counter[0][from] > 0) {
				result[i] = 1;
			} else if (counter[1][to] - counter[1][from] > 0) {
				result[i] = 2;
			} else if (counter[2][to] - counter[2][from] > 0) {
				result[i] = 3;
			} else {
				result[i] = 4;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		GenomicRangeQuery query = new GenomicRangeQuery();

		System.out.println(Arrays.toString(query.solution("CAGCCTA", new int[] { 2, 5, 0 }, new int[] { 4, 5, 6 })));
		System.out.println(Arrays.toString(query.solution("A", new int[] { 0 }, new int[] { 0 })));
	}
}

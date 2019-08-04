package codility.couting.perm;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
	/*
	 * O(n)
	 * https://app.codility.com/demo/results/trainingRKPMBJ-DYR/
	 * Detected time complexity: O(N) or O(N * log(N))
	 */
	public int solution(int[] A) {
		Set<Integer> counter = new HashSet<>();

		for (int v : A) {
			if (v > A.length) {
				return 0;
			}
			counter.add(v);
		}

		return counter.size() == A.length ? 1 : 0;
	}
}

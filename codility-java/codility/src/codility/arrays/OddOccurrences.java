package codility.arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * O(n)
 * https://app.codility.com/c/run/trainingUT4XGE-9PW/
 * https://app.codility.com/demo/results/trainingUT4XGE-9PW/
 * Detected time complexity:
 * O(N) or O(N*log(N))
 */
public class OddOccurrences {
	public int solution(int[] A) {
		Map<Integer, Integer> map = new HashMap<>();

		int count;
		for (int i : A) {
			count = 1;
			if (null != map.get(i)) {
				count += map.get(i);
			}
			map.put(i, count);
		}

		for (int i : map.keySet()) {
			if (0 != map.get(i) % 2) {
				return i;
			}
		}

		return -1;
	}
}

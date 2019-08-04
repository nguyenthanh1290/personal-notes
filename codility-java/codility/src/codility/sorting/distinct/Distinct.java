package codility.sorting.distinct;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Distinct {
	/*
	 * https://app.codility.com/demo/results/trainingJC8EKY-54U/
	 * Detected time complexity: O(N*log(N)) or O(N)
	 */
	public int solution1(int[] A) {
		Set<Integer> distinct = new HashSet<>();
		for (int v : A) {
			distinct.add(v);
		}

		return distinct.size();
	}
	
	/*
	 * https://app.codility.com/demo/results/training6T82RT-QD9/
	 * Detected time complexity: O(N*log(N)) or O(N)
	 */
	public int solution(int[] A) {
		Map<Integer, Boolean> dist = new HashMap<>();
		for (int v : A) {
			dist.put(v, true);
		}
		
		return dist.size();
	}

	public static void main(String[] args) {
		Distinct d = new Distinct();

		System.out.println(d.solution(new int[] { 2, 1, 1, 2, 3, 1 })); // 3
		System.out.println(d.solution(new int[] { 2, 1, 4, 6, 1 })); // 4
	}

}

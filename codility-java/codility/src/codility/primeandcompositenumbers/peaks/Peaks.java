package codility.primeandcompositenumbers.peaks;

import java.util.ArrayList;
import java.util.List;

public class Peaks {
	/*
	 * https://app.codility.com/demo/results/trainingYR65J5-YFH/
	 * Detected time complexity: O(N * log(log(N)))
	 */
	public static int solution(int[] A) {
		int N = A.length;

		// Find all the peaks
		List<Integer> peakIdxs = new ArrayList<>();
		for (int i = 1; i < N - 1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
				peakIdxs.add(i);
			}
		}

		for (int size = 1; size <= N; size++) {
			if (N % size != 0) {
				continue; // skip if non-divisible
			}

			int find = 0;
			int groups = N / size;
			boolean ok = true;
			// Find whether every group has a peak
			for (int peakIdx : peakIdxs) {
				if (peakIdx / size > find) {
					ok = false;
					break;
				}
				if (peakIdx / size == find) {
					find++;
				}
			}
			if (find != groups) {
				ok = false;
			}
			if (ok) {
				return groups;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(Peaks.solution(new int[] { 1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 }));
		// 3
		System.out.println(Peaks.solution(new int[] { 0 }));
		// 0
		System.out.println(Peaks.solution(new int[] { 0, 1 }));
		// 0
		System.out.println(Peaks.solution(new int[] { 0, 1, 1 }));
		// 0
		System.out.println(Peaks.solution(new int[] { 0, 2, 1 }));
		// 1
		System.out.println(Peaks.solution(new int[] { 0, 2, 3, 1 }));
		// 1
	}

}

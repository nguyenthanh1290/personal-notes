package codility.primeandcompositenumbers.flags;

import java.util.ArrayList;
import java.util.List;

public class Flags {
	public static int solution(int[] A) {
		int N = A.length;

		// Find all the peaks
		List<Integer> peakIdxs = new ArrayList<>();
		for (int i = 1; i < N - 1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
				peakIdxs.add(i);
			}
		}
		
		
		
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(Flags.solution(new int[] { 1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 })); // 3

	}

}

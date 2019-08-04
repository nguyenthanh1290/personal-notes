package codility.sorting.triangle;

import java.util.Arrays;

public class Triangle {
	/*
	 * Each element of array A is an integer within the range
	 * [-2,147,483,648..2,147,483,647]. That may overflow int, so use long.
	 * 
	 * https://app.codility.com/demo/results/trainingD837VN-7WN/
	 * Detected time complexity: O(N*log(N))
	 */
	public int solution(int[] A) {
		Arrays.sort(A);
		for (int i = 0; i < A.length - 2; i++) {
			long firstTwo = (long) A[i] + (long) A[i + 1];
			long three = (long) A[i + 2];

			if (firstTwo > three) {
				return 1;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();

		System.out.println(t.solution(new int[] { 10, 2, 5, 1, 8, 20 })); // 1
		System.out.println(t.solution(new int[] { 10, 50, 5, 1 })); // 0
		System.out.println(t.solution(new int[] { 1, 2_147_483_647, 2_147_483_647 })); // 1
	}

}

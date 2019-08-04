package codility.leader.equileader;

public class EquiLeader {
	/*
	 * https://app.codility.com/demo/results/trainingE2AGDJ-RN3/
	 * Detected time complexity: O(N)
	 */
	public int solution(int[] A) {
		if (0 == A.length) {
			return 0;
		}

		int size = 0;
		int value = A[0];
		for (int a : A) {
			if (0 == size) {
				size++;
				value = a;
			} else {
				if (a != value) {
					size--;
				} else {
					size++;
				}
			}
		}

		int candidate = -1;
		if (size > 0) {
			candidate = value;
		}

		int leader = -1;
		int count = 0;
		for (int a : A) {
			if (a == candidate) {
				count++;
			}
		}
		if (count > (A.length / 2)) {
			leader = candidate;
		} else {
			return 0;
		}

		int equi = 0;
		int left = 0;
		int right = 0;
		for (int i = 0; i < A.length-1; i++) {
			if (A[i] == leader) {
				left += 1;
				right = count - left;
			}
			if ((left > (i + 1) / 2) && (right > (A.length - (i + 1)) / 2)) {
				equi++;
			}
		}

		return equi;
	}

	public static void main(String[] args) {
		EquiLeader e = new EquiLeader();

		System.out.println(e.solution(new int[] { 4, 3, 4, 4, 4, 2 })); // 2
	}

}

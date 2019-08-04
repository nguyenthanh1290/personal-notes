package codility.leader;

public class Leader {

	/*
	 * O(n)
	 */
	public int solution(int[] A) {
		if (0 == A.length) {
			return -1;
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
		}

		return leader;
	}

	public static void main(String[] args) {
		Leader l = new Leader();

		System.out.println(l.solution(new int[] { 6, 8, 4, 6, 8, 6, 6 })); // 6
		System.out.println(l.solution(new int[] { 1, 2, 19, 1, 4, 2, 1 })); // -1

	}

}

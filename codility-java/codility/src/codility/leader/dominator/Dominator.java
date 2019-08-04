package codility.leader.dominator;

public class Dominator {
	/*
	 * https://app.codility.com/demo/results/training2233S4-GW3/
	 * O(N)
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

		int index = -1;
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == candidate) {
				count++;
				if (count > (A.length / 2)) {
					return i;
				}
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Dominator d = new Dominator();

		System.out.println(d.solution(new int[] { 3, 4, 3, 2, 3, -1, 3, 3 })); // 7

	}

}

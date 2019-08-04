package codility.primeandcompositenumbers.countfactors;

public class CountFactors {
	/*
	 * https://app.codility.com/demo/results/trainingA3ASDG-J5M/
	 * Detected time complexity: O(sqrt(N))
	 */
	public int solution(int N) {
		int count = 0;

		int i = 1;
		while (i * i < N) {
			if (N % i == 0) {
				count += 2;
			}
			i++;
		}
		if (i * i == N) {
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		CountFactors c = new CountFactors();

		System.out.println(c.solution(24)); // 8
		System.out.println(c.solution(30)); // 8

	}

}

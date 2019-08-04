package codility.maxsliceproblem.profit;

public class MaxProfit {
	/*
	 * https://app.codility.com/demo/results/trainingPGEJZ8-759/
	 * Detected time complexity: O(N**2)
	 */
	public int solution1(int[] A) {
		int max = 0;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if ((A[j] - A[i]) > max) {
					max = A[j] - A[i];
				}
			}
		}

		return max;
	}

	/*
	 * O(n)
	 * https://app.codility.com/demo/results/trainingNK2C4C-HVH/
	 * Detected time complexity: O(N)
	 */
	public int solution(int[] A) {
		int minDailyPrice = 200_000;
		int maxProfit = 0;

		for (int a : A) {
			if (a < minDailyPrice) {
				minDailyPrice = a;
			}
			if (a - minDailyPrice > maxProfit) {
				maxProfit = a - minDailyPrice;
			}
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		MaxProfit max = new MaxProfit();

		System.out.println(max.solution(new int[] { 23171, 21011, 21123, 21366, 21013, 21367 })); // 356

	}

}

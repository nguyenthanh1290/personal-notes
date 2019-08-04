package codility.primeandcompositenumbers.minperimeterrectangle;

public class MinPerimeterRectangle {

	/*
	 * https://app.codility.com/demo/results/trainingUETWYR-DRN/
	 * Detected time complexity: O(sqrt(N))
	 */
	public int solution(int N) {
		int a = 1;
		int b = N / a;
		int minPerimeter = 2 * (a + b);

		while (a * a <= N) {
			if (N % a == 0) {
				b = N / a;
				int curr = 2 * (a + b);
				if (curr < minPerimeter) {
					minPerimeter = curr;
				}
			}
			a++;
		}

		return minPerimeter;
	}

	public static void main(String[] args) {
		MinPerimeterRectangle min = new MinPerimeterRectangle();

		System.out.println(min.solution(30)); // 22

	}

}

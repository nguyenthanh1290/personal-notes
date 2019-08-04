package codility.iterations;

/*
 * O(n)
 * https://app.codility.com/c/run/trainingBDAMJR-58Y/
 * https://app.codility.com/demo/results/trainingBDAMJR-58Y/
*/
public class BinaryGap {
	private final String ONE = "1";

	public int solution(int N) {
		StringBuilder strBuilder = new StringBuilder(Integer.toBinaryString(N));
		int lastIndexOfOne = strBuilder.lastIndexOf(ONE);
		strBuilder.delete(lastIndexOfOne, strBuilder.length());

		String[] arrayOfZeros = strBuilder.toString().split(ONE);
		int gaps = 0;
		for (String str : arrayOfZeros) {
			if (str.length() > gaps) {
				gaps = str.length();
			}
		}

		return gaps;
	}

}
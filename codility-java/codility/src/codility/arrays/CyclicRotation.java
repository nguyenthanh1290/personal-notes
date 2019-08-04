package codility.arrays;

/*
 * O(1)
 * https://app.codility.com/c/run/trainingP2X98H-SBG/
 * https://app.codility.com/demo/results/trainingEZPH5R-DED/
*/
public class CyclicRotation {
	public final int[] EMPTY_ARRAY = {};

	public int[] solution(int[] A, int K) {
		if (0 == A.length) {
			return EMPTY_ARRAY;
		}
		if (K > A.length) {
			K = K % A.length;
		}
		if (K == 0) {
			return A;
		}

		int srcPos, destPos, length;
		int[] result = new int[A.length];

		srcPos = A.length - K;
		destPos = 0;
		length = K;
		System.arraycopy(A, srcPos, result, destPos, length);

		srcPos = 0;
		destPos = K;
		length = A.length - K;
		System.arraycopy(A, srcPos, result, destPos, length);

		return result;
	}
}
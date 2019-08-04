package codility.timecomplexity.frogjpm;

/*
 * O(1)
 * https://app.codility.com/c/run/trainingA97X5B-8N9/
 * https://app.codility.com/demo/results/trainingA97X5B-8N9/
 * Detected time complexity: O(1)
 */
public class FrogJupm {
	public int solution(int X, int Y, int D) {
		if ((Y - X) % D == 0) {
			return (Y - X) / D;
		} else {
			return (Y - X) / D + 1;
		}
	}
}

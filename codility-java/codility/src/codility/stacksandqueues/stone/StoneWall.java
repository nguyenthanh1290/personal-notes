package codility.stacksandqueues.stone;

import java.util.Stack;

public class StoneWall {
	/*
	 * https://app.codility.com/demo/results/trainingNN38VC-MTE/
	 * Detected time complexity: O(N)
	 */
	public int solution(int[] H) {
		Stack<Integer> stack = new Stack<>();
		int stones = 0;

		for (int h : H) {
			while (!stack.empty() && stack.peek() > h) {
				stack.pop();
			}
			if (!stack.empty() && stack.peek() == h) {
				continue;
			} else {
				stack.push(h);
				stones++;
			}
		}

		return stones;
	}

	public static void main(String[] args) {
		StoneWall s = new StoneWall();

		System.out.println(s.solution(new int[] { 8, 8, 5, 7, 9, 8, 7, 4, 8 })); // 7
		System.out.println(s.solution(new int[] { 3, 2, 1 })); // 3

	}

}

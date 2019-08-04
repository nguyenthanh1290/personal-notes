package codility.stacksandqueues.nesting;

import java.util.Stack;

public class Nesting {
	/*
	 * https://app.codility.com/demo/results/trainingC7UHPA-4Q2/ Detected time
	 * complexity: O(N)
	 */
	public int solution(String S) {
		if (S.isEmpty()) {
			return 1;
		}
		if (S.length() % 2 != 0) {
			return 0;
		}

		Stack<Character> stack = new Stack<>();
		for (char c : S.toCharArray()) {
			switch (c) {
			case '(':
				stack.push(c);
				break;
			case ')':
				if (stack.empty()) {
					return 0;
				}
				if (!stack.pop().equals('(')) {
					return 0;
				}
				break;
			default:
				return 0;
			}
		}

		if (stack.empty()) {
			return 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		Nesting n = new Nesting();

		System.out.println(n.solution("")); // 1
		System.out.println(n.solution("(")); // 0
		System.out.println(n.solution("(()(())())")); // 1
		System.out.println(n.solution("())")); // 0

	}

}

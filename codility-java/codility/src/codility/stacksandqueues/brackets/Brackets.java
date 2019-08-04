package codility.stacksandqueues.brackets;

import java.util.Stack;

public class Brackets {
	/*
	 * https://app.codility.com/demo/results/trainingPEXEUM-GYQ/
	 * Detected time complexity: O(N)
	 */
	public int solution(String S) {
		if (S.isEmpty()) {
			return 1;
		}

		Stack<Character> stack = new Stack<>();
		for (char c : S.toCharArray()) {
			switch (c) {
			case '(':
			case '[':
			case '{':
				stack.push(c);
				break;
			case ')':
			case ']':
			case '}':
				if (stack.empty()) {
					return 0;
				}
				String pair = new String(new char[] { stack.pop(), c });
				if (!pair.equals("()") && !pair.equals("[]") && !pair.equals("{}")) {
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
		Brackets b = new Brackets();

		System.out.println(b.solution("")); // 1
		System.out.println(b.solution("{[()()]}")); // 1
		System.out.println(b.solution("([)()]")); // 0
		System.out.println(b.solution("()[]")); // 1
		System.out.println(b.solution("()[{}]")); // 1
		System.out.println(b.solution(")(")); // 0
		System.out.println(b.solution(")")); // 0

	}

}

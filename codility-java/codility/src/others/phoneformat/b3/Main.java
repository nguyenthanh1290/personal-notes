package others.phoneformat.b3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(new String[] { "test1a", "test2", "test1b", "test1c", "test3" },
				new String[] { "Wrong answer", "OK", "Runtime error", "OK", "Time limit exceeded" }));
		System.out.println(
				solution.solution(new String[] { "codility1", "codility3", "codility2", "codility4b", "codility4a" },
						new String[] { "Wrong answer", "OK", "OK", "Runtime error", "OK" }));
	}

}

class Solution {

	public int solution(String[] T, String[] R) {
		List<TestGroup> testGroups = IntStream.range(0, T.length).mapToObj(index -> {
			String group = getTestGroup(T[index]);
			String result = R[index];
			return new TestGroup(group, result);
		}).collect(Collectors.toList());

		long totalGroups = testGroups.stream().map(group -> group.name).distinct().count();
		long failedGroups = testGroups.stream().filter(group -> group.result != "OK").map(group -> group.name)
				.distinct().count();

		return (int) ((totalGroups - failedGroups) * 100 / totalGroups);
	}

	public String getTestGroup(String s) {
		int lastIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				break;
			}
			lastIndex = i;
		}
		for (++lastIndex; lastIndex < s.length(); lastIndex++) {
			if (!Character.isDigit(s.charAt(lastIndex))) {
				break;
			}
		}
		return s.substring(0, lastIndex);
	}

	class TestGroup {
		public final String name;
		public final String result;

		public TestGroup(String group, String result) {
			this.name = group;
			this.result = result;
		}
	}

}

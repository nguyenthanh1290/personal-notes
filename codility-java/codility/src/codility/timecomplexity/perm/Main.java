package codility.timecomplexity.perm;

public class Main {

	public static void main(String[] args) {
		int[] empty = new int[] {};

		PermMissingElem missingElem = new PermMissingElem();
		System.out.println(missingElem.solution2(new int[] { 2, 1, 4, 6, 5, 7 })); // 3
		System.out.println(missingElem.solution(new int[] { 3 })); // 0
		System.out.println(missingElem.solution(empty)); // 0
	}

}

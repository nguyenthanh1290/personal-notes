package codility.arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();

		System.out.println(Arrays.toString(cr.solution(cr.EMPTY_ARRAY, 0))); // []
		System.out.println(Arrays.toString(cr.solution(new int[] { 3, 8, 9, 7, 6 }, 3))); // [9, 7, 6, 3, 8]
		System.out.println(Arrays.toString(cr.solution(new int[] { 0, 0, 0 }, 3))); // [0, 0, 0]
		System.out.println(Arrays.toString(cr.solution(new int[] { 1, 2, 3, 4 }, 4))); // [1, 2, 3, 4]

		System.out.println("-----");

		OddOccurrences oc = new OddOccurrences();
		System.out.println(oc.solution(new int[] { 9, 3, 9, 3, 9, 7, 9 })); // 7
		System.out.println(oc.solution(new int[] { 9, 3, 9, 3, 9, 7, 2, 7 })); // 2
		System.out.println(oc.solution(new int[] { 9, 3, 9, 3, 9, 7, 9, 7, 7 })); // 7
		System.out.println(oc.solution(new int[] { 9, 3, 9, 3, 9, 7, 9, 7 })); // -1
	}

}

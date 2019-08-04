package codility.couting.missing;

public class Main {

	public static void main(String[] args) {
		MissingInteger mi = new MissingInteger();

		System.out.println(mi.solution(new int[] { 1, 3, 6, 4, 1, 2 })); // 5
		System.out.println(mi.solution(new int[] { 1, 2, 3 })); // 4
		System.out.println(mi.solution(new int[] { -1, -3 })); // 1
		System.out.println(mi.solution(new int[] { -1 })); // 1
		System.out.println(mi.solution(new int[] { 0 })); // 1
		System.out.println(mi.solution(new int[] { 1 })); // 2
		System.out.println(mi.solution(new int[] { 4, 5, 6, 2 })); // 1
		System.out.println(mi.solution(new int[] { -1_000_000, 1_000_000 })); // 1

	}

}

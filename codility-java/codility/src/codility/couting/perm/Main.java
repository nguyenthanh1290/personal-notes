package codility.couting.perm;

public class Main {

	public static void main(String[] args) {
		PermCheck pc = new PermCheck();
		System.out.println(pc.solution(new int[] {4, 1, 3, 2})); // expected 1
		System.out.println(pc.solution(new int[] {4, 1, 3})); // expected 0
		System.out.println(pc.solution(new int[] {1, 1})); // expected 0
	}

}

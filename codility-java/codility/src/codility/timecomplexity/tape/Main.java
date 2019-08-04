package codility.timecomplexity.tape;

public class Main {

	public static void main(String[] args) {
		TapeEquilibrium te = new TapeEquilibrium();
		System.out.println(te.solution(new int[] { 3, 1, 2, 4, 3 })); // expected 1
		System.out.println(te.solution(new int[] { -1000, 1000 })); // expected 2000

	}

}

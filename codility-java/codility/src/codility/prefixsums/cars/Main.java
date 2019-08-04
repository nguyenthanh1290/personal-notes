package codility.prefixsums.cars;

public class Main {

	public static void main(String[] args) {
		PassingCars pc = new PassingCars();

		System.out.println(pc.solution(new int[] {})); // 0
		System.out.println(pc.solution(new int[] { 0 })); // 0
		System.out.println(pc.solution(new int[] { 1 })); // 0
		System.out.println(pc.solution(new int[] { 0, 1, 0, 1, 1 })); // 5
		System.out.println(pc.solution(new int[] { 0, 1, 0, 1, 1, 0, 1 })); // 8

	}

}

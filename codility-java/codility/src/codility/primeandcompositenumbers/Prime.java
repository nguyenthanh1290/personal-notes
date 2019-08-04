package codility.primeandcompositenumbers;

public class Prime {
	public int divisors(int N) {
		int count = 0;
		int i = 1;
		while (i * i < N) {
			if (N % i == 0) {
				count += 2;
			}
			i++;
		}
		if (i * i == N) {
			count++;
		}
		return count;
	}

	public boolean primality(int N) {
		int i = 2;
		while (i * i <= N) {
			if (N % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		Prime p = new Prime();

		System.out.println(p.divisors(10)); // 4
		System.out.println(p.divisors(2)); // 2

		System.out.println(p.primality(10));
		System.out.println(p.primality(7));

	}

}

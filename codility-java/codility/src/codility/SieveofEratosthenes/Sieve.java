package codility.SieveofEratosthenes;

import java.util.ArrayList;
import java.util.List;

public class Sieve {
	public static List<Integer> primes(int n) {
		boolean[] sieve = new boolean[n + 1];
		for (int p = 2; p * p <= n; p++) {
			if (!sieve[p]) {
				for (int i = p * p; i <= n; i += p)
					sieve[i] = true;
			}
		}

		List<Integer> prime = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (!sieve[i]) {
				prime.add(i);
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		System.out.println(Sieve.primes(10)); // 2, 3, 5, 7
		System.out.println(Sieve.primes(17)); // 2, 3, 5, 7, 11, 13, 17
		System.out.println(Sieve.primes(30)); // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29

	}

}

package tasks;

import java.util.Scanner;

public class FibonacciSeriesCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(getFibonacciNumberIterative(in.nextInt()));
	}

	static long getFibonacciNumber(int n) {
		return n == 0 ? 0 : (n == 1 || n == 2) ? 1 : getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
	}

	static long getFibonacciNumberIterative(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		long a = 1, b = 1, sum = 0;
		for (int i = 2; i < n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return sum;
	}

}

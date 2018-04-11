package tasks;

import java.util.Scanner;

public class FibonacciSeriesCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(getFibonacciNumber(in.nextInt()));
	}

	static long getFibonacciNumber(int n) {
		return n == 0 ? 0 : (n == 1 || n == 2) ? 1 : getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
	}

}

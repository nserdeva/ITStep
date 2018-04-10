package tasks;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] matrix = new int[n][n];
		long sumFirst = 0;
		long sumSecond = 0;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.println("matrix[" + row + "][" + col + "]=");
				int temp = in.nextInt();
				matrix[row][col] = temp;
				if (row == col) {
					sumFirst += temp;
					if (row == n / 2 && n % 2 != 0) {
						sumSecond += temp;
					}
				} else if ((row + col) == n - 1) {
					sumSecond += temp;
				}
			}
		}
		System.out.println(sumFirst + "\n" + sumSecond + "\n" + (sumFirst > sumSecond ? sumFirst + " is greater"
				: (sumFirst == sumSecond ? "The sums are equal." : sumSecond + " is greater")));
	}

}
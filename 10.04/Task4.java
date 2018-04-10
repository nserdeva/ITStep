package tasks;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Enter the number to be removed:");
		int x = in.nextInt();
		print(arr);
		System.out.println();
		print(removeElement(arr, x));
	}

	static int[] removeElement(int[] arr, int x) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count++;
			}
		}
		int[] newArr = new int[arr.length - count];

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != x) {
				newArr[j++] = arr[i];
			}
		}
		return newArr;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
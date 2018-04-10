package tasks;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] firstArr = new int[n];
		int[] secondArr = new int[n];

		for (int i = 0; i < 2*n; i++) {
			if(i<n) {
			firstArr[i] = in.nextInt();
			} else {
				secondArr[i-n] = in.nextInt();
			}
		}
		print(compareElements(firstArr, secondArr));
	}

	static int[] compareElements(int[] firstArr, int[] secondArr){
		int[] result = new int[firstArr.length];
		for(int i = 0; i<result.length; i++) {
			result[i] = firstArr[i]>=secondArr[i] ? firstArr[i] : secondArr[i];
		}
		return result;
	}
	
	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
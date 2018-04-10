import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i<n; i++) {
		int temp = in.nextInt();
		if(temp%2==0) {
			arr[i] = 0;
		} else {
			arr[i] = temp;
		}
	}
	print(arr);
	}

	static void print(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

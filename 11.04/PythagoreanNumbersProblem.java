package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class PythagoreanNumbersProblem {

	public static void main(String[] args) {
		printPythagoreanEquations(getInput());
	}

	static ArrayList<Integer> getInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> elements = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			elements.add(in.nextInt());
		}
		return elements;
	}

	static void printPythagoreanEquations(ArrayList<Integer> numbers) {
		boolean hasPythagorianEquations = false;
		ArrayList<Integer> squares = getSquares(numbers);
		for (int i = 0; i < numbers.size() - 1; i++) {
			for (int j = i + 1; j < numbers.size(); j++) {
				int a = numbers.get(i), b = numbers.get(j), sum = a * a + b * b;
				if (squares.contains(sum)) {
					hasPythagorianEquations = true;
					int c = squares.indexOf(sum);
					System.out
							.println(a + "*" + a + " + " + b + "*" + b + " = " + numbers.get(c) + "*" + numbers.get(c));
				}
			}
		}
		if (!hasPythagorianEquations) {
			System.out.println("No");
		}
	}

	static ArrayList<Integer> getSquares(ArrayList<Integer> numbers) {
		ArrayList<Integer> squares = new ArrayList<Integer>();
		for (Integer n : numbers) {
			squares.add(n * n);
		}
		return squares;
	}

}

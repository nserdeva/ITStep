package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task3Angel {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			int digit = Integer.parseInt(reader.readLine());
			array[i] = digit;
		}

		Set<Integer> delimiters = new TreeSet<>();
		// Set<Integer> delimitersToBeRemoved = new TreeSet<>();

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				for (int j = 2; j <= array[i] / 2; j++) {
					int currentDigit = array[i];
					if (currentDigit % j == 0) {
						delimiters.add(j);
					}
				}
				delimiters.add(array[i]);
			} else {
				int currentDigit = array[i];
				// дотук не съм ти гледала логиката
				
				//виж това ли си се опитвал да направиш:
				for (Iterator<Integer> it = delimiters.iterator(); it.hasNext();) {
					Integer delitel = it.next();
					if (currentDigit % delitel != 0) {
						it.remove();
					}
				}
			}
		}
		// тук е ок с foreach-a
		for (int delitel : delimiters) {
			System.out.print(delitel + " ");
		}
	}

}
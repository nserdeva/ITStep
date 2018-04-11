package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoDurationsProblem {

	public static void main(String[] args) {
		System.out.println(getTotalDuration(getInput()));
	}

	static ArrayList<String> getInput() {
		ArrayList<String> lines = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		for (String line = ""; !((line.trim()).equals("End")); line = in.nextLine()) {
			lines.add(line);
		}
		lines.remove(0);
		lines.trimToSize();
		return lines;
	}

	static String getTotalDuration(ArrayList<String> durations) {
		long totalDurationMinutes = 0;
		for (int i = 0; i < durations.size(); i++) {
			String[] durationData = durations.get(i).split(":");
			totalDurationMinutes += Integer.parseInt(durationData[0]) * 60;
			totalDurationMinutes += Integer.parseInt(durationData[1]);
		}
		return (totalDurationMinutes / 60) + ":"
				+ (totalDurationMinutes % 60 < 10 ? "0" + totalDurationMinutes % 60 : totalDurationMinutes % 60);
	}

}

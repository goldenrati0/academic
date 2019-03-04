import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexTester {
	public static void main(String[] args) {
		Scanner ana = new Scanner(System.in);
		
		int numberOfRe = ana.nextInt();
		String[] re = new String[numberOfRe];
		ana.nextLine(); // ignore return as input
		for (int i = 0; i < numberOfRe; i++) {
			re[i] = ana.nextLine();
		}

		int numberOfStr = ana.nextInt();
		String[] str = new String[numberOfStr];
		ana.nextLine(); // ignore return as input
		for (int i = 0; i < numberOfStr; i++) {
			str[i] = ana.nextLine();
		}

		for (String s : str) {
			int reLength = re.length;
			boolean contFlag = false;
			for (int i = 0; i < reLength; i++) {
				if (Pattern.matches(re[i], s)) {
					System.out.println("YES, " + (i + 1));
					contFlag = true;
					break; // break out of inner for loop
				}
			}
			if (contFlag) continue; // continue outer for-each loop
			System.out.println("NO, " + 0);
		}
	}
}

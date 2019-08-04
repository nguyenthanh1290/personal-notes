package others.phoneformat;

public class Test {
	private final String SPACE = " ";
	private final String DASH = "-";

	public String solution(String A) {
		String a = removeNonDigits(A);

		if (a.length() <= 3) {
			return a;
		}

		StringBuilder result = new StringBuilder();
		int i = 0;
		while (i < a.length() - 4) {
			result.append(a.substring(i, i + 3));
			result.append(DASH);

			i += 3;
		}

		int remainingDigits = a.length() - i;
		switch (remainingDigits) {
		case 2:
		case 3:
			result.append(a.substring(i));
			break;
		case 4:
			result.append(a.substring(i, i + 2));
			result.append(DASH);
			result.append(a.substring(i + 2));
			break;
		}

		return result.toString();
	}

	private String removeNonDigits(String s) {
		s = s.replaceAll(SPACE, "");
		s = s.replaceAll(DASH, "");

		return s;
	}
}

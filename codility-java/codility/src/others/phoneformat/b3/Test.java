package others.phoneformat.b3;

import java.util.HashMap;
import java.util.Map;

public class Test {
	private final String OK = "OK";
	private final String WRONG = "Wrong answer";
	private final String TIMELIMIT = "Time limit exceeded";
	private final String RUNTIMEERROR = "Runtime error";

	public int solution(String[] T, String[] R) {
		String taskName = "";
		for (char c : T[0].toCharArray()) {
			if (Character.isDigit(c)) {
				break;
			} else {
				taskName += c;
			}
		}
		
		for (int i = 0; i < T.length; i++) {
			T[i] = T[i].replaceFirst(taskName, "");
		}
		
		Map<String, String> map = new HashMap<>();
		
		
		return 0;
	}
}

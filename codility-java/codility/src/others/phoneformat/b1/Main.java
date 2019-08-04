package others.phoneformat.b1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Solution solution = new Solution();
		 System.out.println(solution.solution(""));
	}
}

class Solution {
	public String solution(String S) {
		String[] lines = S.split("\n");
		Map<String, Integer> map = new HashMap<>();
		Arrays.stream(lines).filter(s -> !s.isEmpty()).reduce(map, (pairs, line) -> {
			String[] parts = line.split(" ");
			String ext = parts[0].substring(parts[0].lastIndexOf(".") + 1);
			String type = getType(ext);
			String spaceString = parts[1].substring(0, parts[1].length() - 1);
			int space = Integer.parseInt(spaceString);
			int sumSpace = pairs.getOrDefault(type, 0) + space;
			pairs.put(type, sumSpace);
			return pairs;
		}, (pairs1, pairs2) -> {
			pairs1.putAll(pairs2);
			return pairs1;
		});
		return "music " + map.getOrDefault("music", 0) + "b" + "\n" + "images " + map.getOrDefault("images", 0) + "b"
				+ "\n" + "movies " + map.getOrDefault("movies", 0) + "b" + "\n" + "other "
				+ map.getOrDefault("other", 0) + "b" + "\n";
	}

	public String getType(String ext) {
		switch (ext) {
		case "mp3":
		case "acc":
		case "flac":
			return "music";
		case "jpg":
		case "bmp":
		case "gif":
			return "images";
		case "mp4":
		case "avi":
		case "mkv":
			return "movies";
		default:
			return "other";
		}
	}

}

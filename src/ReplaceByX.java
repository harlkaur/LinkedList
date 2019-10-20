
public class ReplaceByX {

	public static void main(String[] args) {

		String str = "abababcdefababcdab";
		String pattern = "ab";
		int j = 0, count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			while (true) {

				for (j = 0; j < pattern.length();) {
					if (str.charAt(i + j) == pattern.charAt(j)) {
						j++;
					} else
						break;
				}
				if (j == pattern.length()) {
					++count;
					i = i + pattern.length();
				} else {
					break;
				}

			}

			if (count > 0)
				buffer.add('X');
			else {
				buffer.add(str[i]);
			}

		}
	}

}

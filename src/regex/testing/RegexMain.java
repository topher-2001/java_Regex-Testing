package regex.testing;

import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		String s = "My number is 540-308-5563";
		System.out.println(Pattern.compile("/d/d/d-/d/d/d-/d/d/d/d").matcher(s));
	}
	
}

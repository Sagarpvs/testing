package exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
	String t = "It was best of times";
	Pattern pattern = Pattern.compile("the");
	Matcher matcher = pattern.matcher(t);
	if(matcher.find()) {
		System.out.println("found match....");
	}
	else {
		System.out.println("match not found.....");
	}
	
	}

}

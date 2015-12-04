package week1.lesson4;

public class Question2 {
	public static void main(String[] args) {
		System.out.println(StringOperator.findSmallestChar("giwkdamgoeswlb"));
	}
}

class StringOperator {
	public static String findSmallestChar(String str) {
		if (str.length() == 1) {
			return String.valueOf((str.charAt(0)));
		} else {
			if (str.charAt(0) <= str.charAt(1)) {
				return findSmallestChar(String.valueOf(str.charAt(0)) + str.substring(2));
			} else {
				return findSmallestChar(String.valueOf(str.charAt(1)) + str.substring(2));
			}
		}
	}
}
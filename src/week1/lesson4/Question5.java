package week1.lesson4;

public class Question5 {
	public static void main(String[] args) {
		System.out.println(PalinCheck.check("abccfba"));
	}
}

class PalinCheck {
	public static Boolean check(String str) {
		if (str.length() == 0||str.length()==1)
			return true;
		else {
			if (str.charAt(0) == str.charAt(str.length() - 1)) {

				return check(str.substring(1, (str.length() - 1)));
			} else
				return false;
		}
	}
}
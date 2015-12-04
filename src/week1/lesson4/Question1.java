package week1.lesson4;

public class Question1 {

	public static void main(String[] args) {
		System.out.println(StringMerger.mergeString("bcdh","aefg"));
		
	}
}

class StringMerger {
	static String mergeString(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return (s1 + s2);
		}
		else {
			if (s1.charAt(0)<=s2.charAt(0)){
				return (s1.charAt(0)+mergeString(s1.substring(1),s2));
			}
			else{
				return (s2.charAt(0)+mergeString(s1,s2.substring(1)));
			}
		}
	}
}

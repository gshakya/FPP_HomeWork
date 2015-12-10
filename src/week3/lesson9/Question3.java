package week3.lesson9;

import java.util.Stack;

public class Question3 {

	public static void main(String[] args) {
		System.out.println(PalindromeCheck.check("ABCZCBA"));
	}

}

class PalindromeCheck  {
	private static String word;
	private static Stack<Character> chrStk;

	public PalindromeCheck() {

	}

	public PalindromeCheck(String word) {
		this.word = word;
	}

	public boolean check() {

		return check(word);
	}

	public static boolean check(String wrd) {
		String firstHalf;
		String secondHalf;
		if (wrd.length() % 2 == 0) {
			firstHalf = wrd.substring(0, wrd.length() / 2);
			secondHalf = wrd.substring(wrd.length() / 2, wrd.length());
		} else {
			firstHalf = wrd.substring(0,wrd.length()/2);
			 secondHalf=  wrd.substring((wrd.length() / 2)+1, wrd.length());
		}
		chrStk = new Stack<Character>();
		
		while (firstHalf.length()!=0){
			chrStk.add(firstHalf.charAt(0));
			firstHalf=firstHalf.substring(1);			
		}
		 while (chrStk.size()!=0){
			 if (!chrStk.pop().equals(secondHalf.charAt(0)))
				 return false;
			 secondHalf=secondHalf.substring(1);
		 }
		return true;

	}
}

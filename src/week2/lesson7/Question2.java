package week2.lesson7;

public class Question2 {
	public static void main (String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		System.out.println(t);

	}
}

class MyTable {
	private Entry[] entries;

	public MyTable() {
		entries = new Entry[26];
	}

	// returns the String that is matched with char c in the table
	public String get(char c) {
		// implement
		Entry e = entries[(c - 97)];
		if (e == null)
			return null;
		return e.str;
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		Entry e = new Entry(s, c);
		entries[c - 97] = e;
		// implement
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		// implement
		String res = "";
		for (Entry e : entries) {
			res = res + ((e==null)?"":e.toString()+ "\n");
		}
		return res.trim();
	}

	private class Entry {
		private String str;
		private char ch;

		Entry(String str, char ch) {
			this.str = str;
			this.ch = ch;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			// implement

			return ((this == null) ? " " : (String.valueOf(ch) + "->" + str));
		}
	}

	
}

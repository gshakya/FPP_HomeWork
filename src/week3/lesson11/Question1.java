package week3.lesson11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Question1 {
	public static void main (String[] args){
		Course c1 = new Course("FPP", new String[] {"Renuka","Joe Lermon", "Paul"});
		Course c2 = new Course("MPP", new String[] {"Sanjay","Lee", "Charles"});
		Course c3 = new Course("Algorithm", new String[] {"Ali","John", "Gorge"});
		
		HashMap<String, Course> courseHashMap = new HashMap<>();
		
		courseHashMap.put(String.valueOf(c1.hashCode()), c1);
		courseHashMap.put(String.valueOf(c2.hashCode()), c2);
		courseHashMap.put(String.valueOf(c3.hashCode()), c3);
		
		System.out.println(courseHashMap.containsKey(String.valueOf(c1.hashCode())));
		System.out.println(courseHashMap.containsKey("Not In list"));
		
		System.out.println("------List Of Keys---------");
		for (String key : courseHashMap.keySet()){
			System.out.println(key);
		}
		
		System.out.println("------List Of Values--------");
		for (String key : courseHashMap.keySet()){
			System.out.println(courseHashMap.get(key));
		}
		
		System.out.println("------List Of All Values--------");
		for (String key : courseHashMap.keySet()){
			System.out.print(key);
			Course c = courseHashMap.get(key);
			System.out.println("=> ["+c.getC_name()+"["+c.getFaculty()+"]]");
		}
		
		System.out.println("Size:"+courseHashMap.size());
	}
	
}

class Course {
	private String c_name;
	private String[] faculty;

	public String getC_name() {
		return c_name;
	}

	public String getFaculty() {
		String res = "";
		for (String f : faculty){
			res += ","+f;
		}
		return res;
	}

	@Override
	public int hashCode() {
		final int prime = 7 ;
		int result = 1;
		result = prime * result + getStrHashCode(c_name);
		for (String f : faculty) {
			result = prime * result + getStrHashCode(f);
		}
		return result;
	}

	public Course(String c_name, String[] faculty) {
		this.c_name = c_name;
		this.faculty = faculty;
	}

	private int getStrHashCode(String str) {
		int result = 3;
		while (str.length() != 0) {
			result = 5 * result + str.charAt(0);
//			System.out.println(str.charAt(0)+": "+(int)str.charAt(0));
//			System.out.println("Result: "+result);
			str = str.substring(1);
		}
		return result;
	}
}

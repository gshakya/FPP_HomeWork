package week1.lesson5.Question6;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Computer c1 = new Computer("Sony", "AMD", 8, 1024, 2.8);
		Notebook n1 = new Notebook("Acer", "Intel", 4, 500, 1.6, 11.2, 15.3, 1.22);
		
		Computer c2 = new Computer("Sony", "AMD", 8, 1024, 2.8);
		Notebook n2 = new Notebook("Acer", "Intel", 4, 500, 1.6, 11.2, 15.3, 1.22);
		
		Computer c3 = new Computer("LG", "Intel", 8, 1024, 2.8);
		Notebook n3 = new Notebook("Dell", "AMD", 4, 500, 1.6, 11.2, 15.3, 1.22);
		
		System.out.println(c1==c2);  //false
		System.out.println(n1==n2);  //false
		
		System.out.println(c1.equals(c2)); //true
		System.out.println(c2.equals(c1)); //true
		System.out.println(n1.equals(n2)); //true
		System.out.println(n2.equals(n1)); //true
		
		System.out.println(c2.equals(c3)); //false
		System.out.println(n1.equals(n3)); //false
		
		
		System.out.println(c1.hashCode()==c2.hashCode()); //true
		System.out.println(n1.hashCode()==n2.hashCode()); //true
		
		Notebook n4 = (Notebook) n1.clone();
		System.out.println(n4.equals(n1)); //true
		System.out.println(n1.equals(n4)); //true
		
	}

}

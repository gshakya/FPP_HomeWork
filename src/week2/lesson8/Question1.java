package week2.lesson8;

class Person {
	private String lastName;
	private String firstName;
	private int age;

	public Person(String last, String first, int a) {
		this.lastName = last;
		this.firstName = first;
		this.age = a;
	}

	public void displayPerson() {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Age: " + age);
	}

	public String getLastName() {
		return lastName;
	}
} // end class Person

class PersonArrayOpe {
	private Person[] persons; // reference to array
	private int size;
	private final int INITIAL_SIZE;

	public PersonArrayOpe() {
		INITIAL_SIZE = 10;
		size = 0;
		persons = new Person[10];
	}

	public PersonArrayOpe(int max) {
		INITIAL_SIZE = max;
		size = 0;
		persons = new Person[INITIAL_SIZE];
	}

	public Person find(String searchName) // Pass Last Name as an argument
	{
		for (Person p : persons) {
			if (p.getLastName().equals(searchName))
				return p;

		}
		return null;
	}

	public void insert(String last, String first, int age)// Insert at last
	{
		if (size >= persons.length)
			resize();
		persons[size++] = new Person(last, first, age);
	}

	public boolean delete(String searchName) // Shift down the elements.
												// Argument should be lastname
	{
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (persons[i].getLastName().equals(searchName)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		Person[] temp = new Person[persons.length];
		System.arraycopy(persons, 0, temp, 0, index);
		System.arraycopy(persons, index + 1, temp, index, persons.length - (index + 1));
		persons = temp;
		size--;

		return true;
	}

	public void displayAll() // displays array contents
	{	
		System.out.println("-----------------------------------------------");
		System.out.println("-------------  DISPLAYING MEMBERS  ------------");
		System.out.println("-----------------------------------------------");
		
		for (int i = 0; i < size; i++) {
			System.out.println("Displaying --------- Person " + i);
			persons[i].displayPerson();
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
	}

	public int size() // Return the number of persons stored in the array
	{
		return size;
	}

	private void resize() {
		System.out.println("Array Resizing...");
		int newSize = (2 * persons.length);
		Person[] temp = new Person[newSize];
		System.arraycopy(persons, 0, temp, 0, size);
		persons = temp;

	}

}

public class Question1 {

	public static void main(String[] args) {
		PersonArrayOpe pOper = new PersonArrayOpe(5);
		System.out.println(pOper.size());
		pOper.insert("Shakya", "Gunjan", 28);
		pOper.insert("Poudel", "Prabhat", 28);
		pOper.insert("Limbu", "Nagendra", 29);
		pOper.insert("Bhusal", "Samrat", 27);
		pOper.insert("Basnet", "Govinda", 25);
		pOper.insert("Adhikari", "Madan", 25);

		System.out.println("Size of Array:"+pOper.size());
		
		
		pOper.displayAll();

		System.out.println((pOper.delete("Limbu"))?"Member Deleted":"Member not Found");
		System.out.println((pOper.delete("Shrestha"))?"Member Deleted":"Member not Found");

		System.out.println("Size of Array:"+pOper.size());

		pOper.displayAll();

		pOper.find("Shakya").displayPerson();

	}
}

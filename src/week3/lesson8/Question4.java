package week3.lesson8;

public class Question4 {
	public static void main(String[] args) {
		DirectoryOpr dOper = new DirectoryOpr();

		System.out.println(dOper.isEmpty());
		dOper.displayList();

		dOper.insertLast("TEMP", 123456);
		dOper.displayList();
		dOper.deleteFirst();
		dOper.displayList();
		dOper.insertFirst("Second", 123456789);
		dOper.insertLast("Third", 456789);
		dOper.insertFirst("First", 147852);

		dOper.displayList();

		System.out.println(dOper.isEmpty());

		dOper.find("Third").displayDirectory();
		
		System.out.println("Size of Directory: "+dOper.size());
		
	}
}

class Directory {
	String name;
	long pno; // Phone number
	Directory next;

	public Directory(String name, long pno) { // Initialize values
		this.name = name;
		this.pno = pno;
	}

	// -------------------------------------------------------------
	public void displayDirectory() // display values of single element
	{
		System.out.println("Name: " + name + "\nPhone no: " + pno);
	}
}

class DirectoryOpr {
	private Directory first; // ref to first Directory
	private Directory last; // ref to last Directory

	// -------------------------------------------------------------
	public DirectoryOpr() // constructor
	{
		first = null;
		last = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no Directory in your list
	{
		if (first == null)
			return true;
		return false;

	}

	// -------------------------------------------------------------
	public void insertFirst(String name, long pno) // insert at front of list
	{
		if (isEmpty()) {
			Directory firstNode = new Directory(name, pno);
			first = firstNode;
			last = firstNode;
		} else {
			Directory temp = new Directory(name, pno);
			temp.next = first;
			first = temp;
		}

	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) // insert at end of list
	{
		if (isEmpty()) {
			Directory firstNode = new Directory(name, pno);
			last = firstNode;
			first = firstNode;
		} else {
			Directory temp = new Directory(name, pno);
			last.next = temp;
			last = temp;
		}

	}

	// -------------------------------------------------------------
	public Directory deleteFirst() // delete first Directory
	{
		Directory temp = first;
		first = temp.next;
		return temp;
	}

	// -------------------------------------------------------------
	public int size() {
		int size = 1;
		Directory travellingNode = first;
		if (isEmpty())
			return 0;
		while (travellingNode.next != null) {
			size++;
			travellingNode = travellingNode.next;
		}
		return size;
	}

	// -------------------------------------------------------------
	public void displayList() {
		Directory travellingNode = first;
		if (isEmpty()) {
			System.out.println("-----EMPTY LIST----");
			return;
		}
		while (travellingNode != null) {
			travellingNode.displayDirectory();
			travellingNode = travellingNode.next;
		}
		// travellingNode.displayDirectory();
	}

	// -------------------------------------------------------------
	public Directory find(String key) // find link with given key
	{
		Directory travellingNode = first;
		if (isEmpty())
			return null;
		while (travellingNode != null) {
			if (travellingNode.name.equals(key)) {
				return travellingNode;
			}
			travellingNode = travellingNode.next;
		}

		return null;
	}
}

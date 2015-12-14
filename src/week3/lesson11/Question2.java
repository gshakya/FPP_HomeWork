
package week3.lesson11;

import java.io.*;
import java.util.Scanner;

public class Question2 {

	public static void main (String[] args){
		HashTable theHashTable = new HashTable(20);
		
		System.out.println("Size:"+theHashTable.size());
		theHashTable.insert("gr.skya@gmail.com", "Gunjan");
		System.out.println("Size:"+theHashTable.size());
		theHashTable.insert("prabhat@mail.com", "Prabhat");
		theHashTable.insert("madan@mail.com", "madan");
		theHashTable.insert("govinda@mail.com", "govinda");
		System.out.println("Size:"+theHashTable.size());
		
		theHashTable.displayKey();
		theHashTable.displayVal();
		theHashTable.displayTable();
		theHashTable.delete("govinda@mail.com");
		System.out.println("Size:"+theHashTable.size());
		
	}
}

// demonstrates hash table user defined implementation with linear probing



class PersonItem
{                                
	private String mail_id;  //Person E_Mail-id-Key
	private String name;  // Name of the person
	
	
	public PersonItem(String mail_id, String name) {
			super();
			this.mail_id = mail_id;
			this.name = name;
		}


	public String getMail_id() {
		return mail_id;
	}


	public String getName() {
		return name;
	}
	
	

}



class HashTable {
	private PersonItem[] hashArray; // array holds hash table
	private int arraySize;
	private int size =0;
	private PersonItem nonItem; // for deleted items
	// -------------------------------------------------------------

	public HashTable(int size) // constructor
	{
		arraySize = size;
		hashArray = new PersonItem[arraySize];
		nonItem = null; // deleted item key is -1
	}

	// -------------------------------------------------------------
	public void displayTable() {
		System.out.println("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.println("Index : " + j + " " + hashArray[j].getMail_id() + " " + hashArray[j].getName());
			else
				System.out.println("Index : " + j + " " + "**");
		}
		System.out.println("");
	}

	
	public void displayKey() {
		System.out.println("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.println("Keys : " + j + " " + hashArray[j].getMail_id());
			else
				System.out.println("Keys : " + j + " " + "**");
		}
		System.out.println("");
	}
	
	
	public void displayVal() {
		System.out.println("Table: ");
		for (int j = 0; j < arraySize; j++) {
			if (hashArray[j] != null)
				System.out.println("Value : " + j + " " + hashArray[j].getName());
			else
				System.out.println("Value : " + j + " " + "**");
		}
		System.out.println("");
	}
	
	// -------------------------------------------------------------
	public int hashFunc(String key) {
		int hashVal = 1;
		while (key.length() != 0) {
			hashVal += 5 * hashVal + key.charAt(0);
			key = key.substring(1);
		}
		if (hashVal<0) hashVal *= -1;
		
		return hashVal % arraySize; // hash function
	}

	// -------------------------------------------------------------
	public void insert(String mail_ID, String name) // insert a PersonItem
	// (assumes table not full)
	{
		// extract key
		int hashVal = hashFunc(mail_ID); // hash the key
										// until empty cell
		// an index have some data and not match with existing key, it find next
		// vacant position
		while (hashArray[hashVal] != null && hashArray[hashVal].getMail_id() != mail_ID) {
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		PersonItem obj = new PersonItem(mail_ID, name);
		hashArray[hashVal] = obj; 
		size++;// insert item
	} // end insert()
	// -------------------------------------------------------------

	public PersonItem delete(String mail_ID) // delete a PersonItem
	{
		int hashVal = hashFunc(mail_ID); // hash the key

		while (hashArray[hashVal] != null) // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getMail_id() == mail_ID) {
				PersonItem temp = hashArray[hashVal]; // save item
				hashArray[hashVal] = nonItem; // delete item
				size--;
				return temp; // return item
			}
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return null; // can't find item
	} // end delete()
	// -------------------------------------------------------------

	public boolean find(String mail_ID) // find item with key
	{
		int hashVal = hashFunc(mail_ID); // hash the key

		while (hashArray[hashVal] != null) // until empty cell,
		{ // found the key?
			if (hashArray[hashVal].getMail_id() == mail_ID)
				return true; // yes, return item
			++hashVal; // go to next cell
			hashVal %= arraySize; // wraparound if necessary
		}
		return false; // can't find item
	}
	
	public int size(){
		return size;
	}
	// -------------------------------------------------------------
} // end class HashTable
	////////////////////////////////////////////////////////////////

//class HashTableApp {
//	public static void main(String[] args) throws IOException {
//		int aKey;
//		String value;
//
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter size of hash table: ");
//		int size = in.nextInt();
//
//		HashTable theHashTable = new HashTable(size);
//
//		theHashTable.insert(1, "FPP");
//		theHashTable.insert(5, "Java");
//		theHashTable.insert(7, "SE");
//		theHashTable.insert(10, "C#");
//
//		while (true) // interact with user
//		{
//			System.out.print("Enter first letter of ");
//			System.out.print("show, insert, delete, or find: ");
//			char choice = in.next().charAt(0); // Read a Char from the console
//			switch (choice) {
//			case 's':
//				theHashTable.displayTable();
//				break;
//			case 'i':
//				System.out.print("Enter key and value to insert: ");
//				aKey = in.nextInt();
//				value = in.next();
//				theHashTable.insert(aKey, value);
//				break;
//			case 'd':
//				System.out.print("Enter key value to delete: ");
//				aKey = in.nextInt();
//				theHashTable.delete(aKey);
//				break;
//			case 'f':
//				System.out.print("Enter key value to find: ");
//				aKey = in.nextInt();
//				System.out.println("Key Found status" + theHashTable.find(aKey));
//				break;
//			default:
//				System.out.print("Invalid entry\n");
//			} // end switch
//		} // end while
//	} // end main()
//	// --------------------------------------------------------------
//} // end class HashTableApp
//	////////////////////////////////////////////////////////////////

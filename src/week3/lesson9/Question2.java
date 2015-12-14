package week3.lesson9;

public class Question2 {

	public static void main(String[] args) {
		Queue que = new Queue(5);
		System.out.println(que.isEmpty());
		System.out.println(que);
		que.add(5);
		System.out.println(que.isEmpty());
		System.out.println(que);
		que.add(7);
		System.out.println(que);
		que.add(6);
		System.out.println(que);
		que.add(9);
		System.out.println(que);
		System.out.println(que);
		que.add(1);
		System.out.println(que);
		que.add(10);
		System.out.println(que);
		que.add(2);
		System.out.println(que);
		que.add(4);
		System.out.println(que);
		que.add(4);
		System.out.println(que);
		que.add(8);
		System.out.println(que);
		que.add(3);
		System.out.println(que);

		System.out.println("Array Size:" + que.size());

		System.out.println("Array Peek:" + que.peek());
		System.out.println("Starting to Remove");

		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		// System.out.println(que.remove()); Null Pointer Exception because the array is empty

		System.out.println(que);

	}
}

class Queue {
	private int val[];
	private int size = 0;
	private final int INITIAL_SIZE;

	public boolean isEmpty() {
		return (size == 0 ? true : false);
	}

	public Queue() {
		INITIAL_SIZE = 10;

		val = new int[INITIAL_SIZE];
	}

	public Queue(int max) {
		INITIAL_SIZE = max;
		val = new int[INITIAL_SIZE];
	}

	public int remove()// Pass Last Name as an argument
	{
		if (isEmpty()) {
			return (Integer) null;
		}
		int res = val[0];
		int[] temp = new int[val.length];
		System.arraycopy(val, 1, temp, 0, val.length - 1);
		val = temp;
		size--;
		return res;
	}

	public void add(int data)// Insert at last
	{
		if (size >= val.length)
			resize();
		val[size++] = data;
	}

	public int peek() {
		if (isEmpty())
			return (Integer) null;
		return val[0];
	}

	public int size() {
		return size;
	}

	private void resize() {
		System.out.println("Array Resizing...");
		int newSize = (2 * val.length);
		int[] temp = new int[newSize];
		System.arraycopy(val, 0, temp, 0, size);
		val = temp;
	}

	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < size; ++i) {
			res = res + val[i] + "=>";
		}
		return res;
	}
}

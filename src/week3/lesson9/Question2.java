package week3.lesson9;

public class Question2 {

	public static void main(String[] args) {
		Queue que = new Queue();
		System.out.println(que.isEmpty());
		System.out.println(que);
		que.add(new QueueNode(5));
		System.out.println(que.isEmpty());
		System.out.println(que);
		que.add(new QueueNode(7));
		System.out.println(que);
		que.add(new QueueNode(6));
		System.out.println(que);
		que.add(new QueueNode(9));
		System.out.println(que);
		System.out.println(que);
		que.add(new QueueNode(1));
		System.out.println(que);
		que.add(new QueueNode(10));
		System.out.println(que);
		que.add(new QueueNode(2));
		System.out.println(que);
		que.add(new QueueNode(4));
		System.out.println(que);
		que.add(new QueueNode(4));
		System.out.println(que);
		que.add(new QueueNode(8));
		System.out.println(que);
		que.add(new QueueNode(3));
		System.out.println(que);

		System.out.println(que.size());

		System.out.println(que.peek());

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
		System.out.println(que.remove());
		
		System.out.println(que);

	}
}

class QueueNode {

	int data;
	QueueNode next;

	QueueNode(int data) {
		this.data = data;

	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}

}

class Queue {
	private int size;
	private QueueNode head;

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public int size() {
		return size;
	}

	public QueueNode peek() {
		return head;
	}

	public QueueNode remove() {
		if (isEmpty())
			return null;
		QueueNode res = head;
		head = head.next;
		return res;
	}

	public void add(QueueNode n) {
		if (isEmpty()) {
			head = n;
			size++;
			return;
		}

		QueueNode travellingNode = head;
		while (travellingNode.next != null) {
			travellingNode = travellingNode.next;
		}
		travellingNode.next = n;
		size++;
	}

	@Override
	public String toString() {
		String opString = "";
		QueueNode travellingNode = head;

		while (travellingNode != null) {

			opString = opString + travellingNode + " => ";
			travellingNode = travellingNode.next;

		}
		return opString + "NULL";
	}

}
package week3.lesson9;

public class Question1 {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		System.out.println(pq.isEmpty());
		System.out.println(pq);
		pq.add(new Node(5));
		System.out.println(pq.isEmpty());
		System.out.println(pq);
		pq.add(new Node(7));
		System.out.println(pq);
		pq.add(new Node(6));
		System.out.println(pq);
		pq.add(new Node(9));
		System.out.println(pq);
		System.out.println(pq);
		pq.add(new Node(1));
		System.out.println(pq);
		pq.add(new Node(10));
		System.out.println(pq);
		pq.add(new Node(2));
		System.out.println(pq);
		pq.add(new Node(4));
		System.out.println(pq);
		pq.add(new Node(4));
		System.out.println(pq);
		pq.add(new Node(8));
		System.out.println(pq);
		pq.add(new Node(3));
		System.out.println(pq);

		System.out.println(pq.size());
		
		System.out.println(pq.peek());
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		System.out.println(pq);

	}
}

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;

	}

	@Override
	public String toString() {
		return String.valueOf(data);
	}

}

class PriorityQueue {
	private int size;
	private Node head;

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public int size() {
		return size;
	}

	public Node peek() {
		return head;
	}

	public Node remove() {
		if (isEmpty())
			return null;
		Node res = head;
		head = head.next;
		return res;
	}

	public void add(Node n) {
		if (isEmpty()) {
			head = n;
			size++;
			return;
		}
		if (head.data >= n.data) {
			n.next = head;
			head = n;
			size++;
			return;
		}
		Node travellingNode = head;
		while (travellingNode != null) {
			if (travellingNode.next == null) {
				travellingNode.next = n;
				size++;
				return;
			}
			if (travellingNode.next.data >= n.data) {
				n.next = travellingNode.next;
				travellingNode.next = n;
				size++;
				return;
			}
			travellingNode = travellingNode.next;
		}
	}

	@Override
	public String toString() {
		String opString = "";
		Node travellingNode = head;

		while (travellingNode != null) {

			opString = opString + travellingNode + " => ";
			travellingNode = travellingNode.next;

		}
		return opString + "NULL";
	}

}